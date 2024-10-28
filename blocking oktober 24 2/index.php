<?php
$host="localhost";
$user="root";
$pass="";
$db="akademik";

$koneksi=mysqli_connect($host,$user,$pass,$db);
if(!$koneksi){
    die("g konek lmao");
}

$nim="";
$nama="";
$alamat="";
$fakultas="";
$sukses="";
$error="";

if(isset($_GET['op'])){
    $op=$_GET['op'];
}else{
    $op="";
}
if($op=='delete'){
    $id=$_GET['id'];
    $sqli="delete from mahasiswa where id= '$id'";
    $q1=mysqli_query($koneksi,$sqli);
    if($q1){
        $sukses="Berhasil hapus data";
    }else{
        $error="error bwop";
    }
}
if($op=='edit'){
    $id=$_GET['id'];
    $sql1="select*from mahasiswa where id='$id'";
    $q1=mysqli_query($koneksi,$sql1);
    $r1=mysqli_fetch_array($q1);
    $nim=$r1['nim'];
    $nama=$r1['nama'];
    $alamat=$r1['alamat'];
    $fakultas=$r1['fakultas'];

    if($nim==''){
        $error="data g ketemu";
    }
}
if (isset($_POST['simpan'])){
    $nim=$_POST['nim'];
    $nama=$_POST['nama'];
    $alamat=$_POST['alamat'];
    $fakultas=$_POST['fakultas'];

    if($nim&& $nama && $alamat && $fakultas){
        if ($op='edit'){
            $sql1="update mahasiswa set nim='$nim',nama='$nama',alamat='$alamat',fakultas='$fakultas' where id='$id'";
            $q1=mysqli_query($koneksi,$sql1);
            if($q1){
                $sukses="data berhasil diupdate";
            }else{
                $error="bwop gagal";
            }
        }else{
            $sql1="insert into mahasiswa(nim,nama,alamat,fakultas)values('$nim','$nama','$alamat','$fakultas')";
            $q1=mysqli_query($koneksi,$sql1);
            if($q1){
                $sukses="data berhasil diupdate";
            }else{
                $error="bwop gagal";
            }
        }
    }
}
?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>data mahasiswa</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <style>
        .mx-auto{
            width: 800px;
        }
    </style>
</head>
<body>
    
</body>
</html>