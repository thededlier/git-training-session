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
     $album_id=$_GET['id'];
     $query=mysql_query("SELECT * FROM photos WHERE album_id='$album_id'");
     while ($run=mysql_fetch_array($query)) {
     	$name=$run['name'];
     	$url=$run['url'];
     ?>
     <div id="view_box">
     	<img src="uploads/<?php echo $url; ?>">
     	<br>
     	<b><?php echo "$name"; ?></b>
     </div>

     <?php
     }
	?>
	<div class="clear"></div>
	</div>
</div>
</body>
</html>