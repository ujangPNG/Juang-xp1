<?php include '../config.php';
if (!isset($_SESSION['username'])) {
    header("location:../login.php");
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MyApp</title>
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="../assets/fontawesome/css/all.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
</head>
<body>
    <div class="container">
        <nav class="navbar navbar-expand-sm navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Prestasi Prima</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Hero</a>
                        </li>
                    </ul>
                    <?php if (!isset($_SESSION['username'])) { ?>
                        <a class="nav-link btn btn-primary btn-sm d-flex justify-content-end" style="color: white;" aria-current="page" href="login.php">Login</a>
                    <?php } else { ?>
                        <div class="dropdown">
                            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                                <?php echo $_SESSION['nmuser']; ?>
                            </button>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                                <li><a class="dropdown-item" href="../index.php">Halaman Utama</a></li>
                                <li><a class="dropdown-item" href="../logout.php">Logout</a></li>
                            </ul>
                        </div>
                    <?php } ?>
                </div>
            </div>
        </nav>

        <div class="row">
            <div class="col mt-3">
                <h3>Manajemen Hero</h3>
            </div>
        </div>
        <nav style="--bs-breadcrumb-divider:url(&#34;data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='8' height='8'%3E%3Cpath d='M2.5 0L1.5 3.5 4 1 6.5 2.5 8 4 4 6.5 1.5 8 0 4z' fill='currentColor'/%3E%3C/svg%3E&#34;);" aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="index.php">Home</a></li>
                <li class="breadcrumb-item active" aria-current="page">Hero</li>
            </ol>
        </nav>
        <div class="row">
            <div class="col">
                <?php if (isset($_GET['gagal'])) { ?>
                    <div class="alert alert-danger alert-dismissible fade show" role="alert">
                        <strong><i class="fas fa-exclamation-triangle"></i></strong> <?= $_SESSION['gagalposting']; ?>
                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                    </div>
                <?php } ?>
                <a href="#" class="btn btn-primary btn-sm float-end mb-2" data-bs-toggle="modal" data-bs-target="#tambahdata"><i class="fas fa-plus"></i> Tambah Data</a>
            </div>
        </div>
        <table class="table table-striped table-sm mt-1" id="tabel">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Judul</th>
                    <th width=30%>Sub Judul</th>
                    <th>Status</th>
                    <th>Gambar</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <?php 
                $no = 1; 
                $panggil = $koneksi->query("SELECT * FROM hero order by idHero desc "); 
                while ($row = $panggil->fetch_array()) { 
                ?>
                <tr>
                    <td class="align-middle"><?= $no++; ?></td>
                    <td class="align-middle"><?= $row['judul']; ?></td>
                    <td class="align-middle"><?= $row['subjudul']; ?></td>
                    <td class="align-middle"><?= $row['status']; ?></td>
                    <td class="align-middle"><img src="../assets/img/<?= $row['gambar']; ?>" width="100" height="100"></td>
                    <td class="align-middle">
                        <a href="#" class="btn btn-warning btn-sm update" data-bs-toggle="modal" data-bs-target="#editdata" data-idhero="<?= $row['idHero']; ?>" data-judul="<?= $row['judul']; ?>" data-subjudul="<?= $row['subjudul']; ?>"><i class="fas fa-pen"></i></a>
                        <a href="konfigurasi.php?delete=<?= $row['idHero']; ?>" class="btn btn-danger btn-sm"><i class="fas fa-trash"></i></a>
                    </td>
                </tr>
                <?php } ?>
            </tbody>
        </table>

        <!-- Modal tambah data -->
        <div class="modal fade" id="tambahdata" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="staticBackdropLabel">Buat Hero</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="konfigurasi.php" method="POST" enctype="multipart/form-data">
                            <div class="row mb-3">
                                <label for="judul" class="col-sm-3 col-form-label">Judul</label>
                                <div class="col-sm-9">
                                    <input type="text" name="judul" id="judul" class="form-control" required>
                                </div>
                            </div>
                            <div class="row mb-3">
                                <label for="subjudul" class="col-sm-3 col-form-label">Sub Judul</label>
                                <div class="col-sm-9">
                                    <textarea name="subjudul" id="subjudul" cols="5" rows="3" class="form-control" required></textarea>
                                </div>
                            </div>
                            <div class="row mb-3">
                                <label for="gambar" class="col-sm-3 col-form-label">Gambar</label>
                                <div class="col-sm-9">
                                    <input type="file" name="gambar" class="form-control" id="gambar" required>
                                </div>
                            </div>
                            <div class="row mb-3">
                                <label for="status" class="col-sm-3 col-form-label">Status</label>
                                <div class="col-sm-9">
                                    <select name="status" id="status" class="form-control">
                                        <option value="">Pilih</option>
                                        <option value="aktif">Aktif</option>
                                        <option value="tidak aktif">Tidak Aktif</option>
                                    </select>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Batal</button>
                                <button type="submit" name="simpan" class="btn btn-primary">Simpan</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Modal edit -->
        <div class="modal fade" id="editdata" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="staticBackdropLabel">Edit Hero</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="konfigurasi.php" method="POST" enctype="multipart/form-data">
                            <div class="row mb-3">
                                <label for="judul_u" class="col-sm-3 col-form-label">Judul</label>
                                <div class="col-sm-9">
                                    <input type="text" name="judul" class="form-control" id="judul_u">
                                </div>
                            </div>
                            <div class="row mb-3">
                                <label for="subjudul_u" class="col-sm-3 col-form-label">Sub Judul</label>
                                <div class="col-sm-9">
                                    <textarea name="subjudul" id="subjudul_u" cols="5" rows="3" class="form-control"></textarea>
                                </div>
                            </div>
                            <div class="row mb-3">
                                <label for="gambar_u" class="col-sm-3 col-form-label">Gambar</label>
                                <div class="col-sm-9">
                                    <input type="file" name="gambar" class="form-control" id="gambar_u">
                                </div>
                            </div>
                            <div class="row mb-3">
                                <label for="status_u" class="col-sm-3 col-form-label">Status</label>
                                <div class="col-sm-9">
                                    <select name="status" id="status_u" class="form-control">
                                        <option value="">Pilih</option>
                                        <option value="aktif">Aktif</option>
                                        <option value="tidak aktif">Tidak Aktif</option>
                                    </select>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Batal</button>
                                <button type="submit" name="editposting" class="btn btn-primary">Edit</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script src="../assets/js/jquery.min.js"></script>
        <script src="../assets/js/bootstrap.min.js"></script>
        <script src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
        <script>
            $(document).on('click', '.update', function(e) {
                var idPosting = $(this).attr("data-idhero");
                var judul = $(this).attr("data-judul");
                var subjudul = $(this).attr("data-subjudul");
                $('#idPosting_u').val(idPosting);
                $('#judul_u').val(judul);
                $('#subjudul_u').val(subjudul);
            });

            $(document).ready(function() {
                $('#tabel').DataTable({
                    "paging": true,
                    "ordering": true,
                    "info": true
                });
            });
        </script>
    </div>
</body>
</html>
