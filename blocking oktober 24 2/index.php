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
if (isset())