<?php
    $con = mysqli_connect("localhost", "id3430729_golden_offers", "123456", "id3430729_database");
    
	$username = $_POST["username"];
	$password = $_POST["password"];
    $name = $_POST["name"];
	$owner = $_POST["owner"];
	$afm = $_POST["afm"];
	
    
    $statement = mysqli_prepare($con, "INSERT INTO business (username, password, name, owner, afm) VALUES (?, ?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $username, $password, $name, $owner, $afm);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>