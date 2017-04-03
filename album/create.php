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
	<h2 style="text-align: center;">Create Album</h2>
	    <form style="text-align: center;" method="post" action="create.php">
	    <?php
          if(isset($_POST['name'])){
          $name=$_POST['name'];
          if(empty($name)){
          echo "Please enter album name";
          }
          else{
          mysql_query("INSERT INTO albums VALUES('','$name')");
          echo "Album created";       
          }
          }
	    ?>
	    	<h4>Album Name:</h4>
	    	<input type="text" name="name"/>
	    	<input type="submit" value="create">
	    </form>	
	</div>
</div>
</body>
</html>