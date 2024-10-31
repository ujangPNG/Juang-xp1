<?php 
include '../config.php';
if (isset($_POST['simpan'])) {
    $judul = $_POST['judul'];
    $subjudul = $_POST['subjudul'];
    $status = $_POST['status'];
    $namagambar = $_FILES['gambar']['name'];
    $ekstensi_diperbolehkan = array('png', 'jpg', 'jpeg');
    $x = explode('.', $namagambar);
    $ekstensi = strtolower(end($x));
    $ukuran = $_FILES['gambar']['size'];
    $file_tmp = $_FILES['gambar']['tmp_name'];
    
    if (in_array($ekstensi, $ekstensi_diperbolehkan)) {
        if ($ukuran < 1044070) {
            move_uploaded_file($file_tmp, '../assets/img/' . $namagambar);
            $koneksi->query("INSERT INTO hero (gambar, judul, subjudul, status) VALUES ('$namagambar','$judul','$subjudul','$status')");
            header("location:index.php");
            exit();
        } else {
            $_SESSION['gagalposting'] = "Maaf Postingan tidak berhasil disimpan karena ukuran terlalu besar";
            header("location:index.php?gagal");
            exit();
        }
    } else {
        $_SESSION['gagalposting'] = "Maaf Postingan tidak berhasil disimpan karena format tidak sesuai";
        header("location:index.php?gagal");
        exit();
    }
}

if (isset($_GET['delete'])) {
    $idHero = $_GET['delete'];
    $koneksi->query("DELETE FROM hero WHERE idHero = '$idHero'");
    header("location:index.php");
    exit();
}

if (isset($_POST['editposting'])) {
    $judul = $_POST['judul'];
    $subjudul = $_POST['subjudul'];
    $status = $_POST['status'];
    $namagambar = $_FILES['gambar']['name'];
    $file_tmp = $_FILES['gambar']['tmp_name'];

    if (!empty($namagambar)) {
        move_uploaded_file($file_tmp, '../assets/img/' . $namagambar);
        $koneksi->query("UPDATE hero SET judul='$judul', subjudul='$subjudul', gambar='$namagambar', status='$status' WHERE judul='$judul'");
    } else {
        $koneksi->query("UPDATE hero SET judul='$judul', subjudul='$subjudul', status='$status' WHERE judul='$judul'");
    }
    header("location:index.php");
    exit();
}
?>
