<!DOCTYPE html>
<html>
<head>
	<title>Album System</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<?php include("connect.php"); ?>
<div id="body">
	<?php include("tittle_bar.php");?>
	<div id="container">
		<?php
         $query=mysql_query("SELECT `id`,`name` FROM `albums`");
         while ($run=mysql_fetch_array($query)) {
         	$album_name=$run['name'];
         	$album_id=$run['id'];
         	$query1=mysql_query("SELECT `url` FROM `photos` WHERE `album_id`='$album_id'");
         	$run1=mysql_fetch_array($query1);
         	$pic=$run1['url'];
         ?>
          <a href="view.php?id=<?php echo $album_id; ?>">
          <div id="view_box">
          	<img src="uploads/<?php echo $pic;?>">
          	<br>
          	<b><?php echo "$album_name"; ?>
          </div>
          </a>

         <?php	
         }
		?>
		<div class="clear"></div>
	</div>
</div>
</body>
</html>