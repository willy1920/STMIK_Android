<?php
  $host = "localhost";
  $user = "root";
  $pass = "";
  $name = "stmikandroid";
  $mysqli = mysqli_connect($host, $user, $pass, $name);
  if($mysqli){
    $sql = "SELECT * FROM mahaiswa";
    $query = $mysqli->query($sql);
    $mysqli->close();
    if($query){
      $rows = array();
      while ($row = $query->fetch_assoc()) {
        $rows[] = $row;
      }
      print json_encode($rows);
    }
    else {
      echo "Query gagal";
    }
  }
  else {
    echo "Koneksi gagal";
  }
  $query->free();
?>
