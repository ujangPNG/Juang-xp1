<?php
include 'config.php';
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MyAPP</title>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <nav class="navbar navbar-expand-sm navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">MyApp</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                    </ul>
                    <?php if (!isset($_SESSION['username'])) { ?>
                        <a class="nav-link btn btn-primary btn-sm d-flex justify-content-end" style="color: black;" href="login.php">Login</a>
                    <?php } else { ?>
                        <div class="dropdown">
                            <button class="btn btn-secondary dropdown-toggle" type="button"
                                    id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                                <b><?php echo htmlspecialchars($_SESSION['nmuser']); ?></b>
                            </button>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                                <li><a class="dropdown-item" href="admin/index.php">Dashboard Admin</a></li>
                                <li><a class="dropdown-item" href="logout.php">Logout</a></li>
                            </ul>
                        </div>
                    <?php } ?>
                </div>
            </div>
        </nav>


        <style>
            .carousel-item img {
                opacity: 0.5;
                min-height: 550px;
                max-height: 550px;
            }
        </style>


        <div class="row mt-3 justify-content-center">
            <div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <?php
                    // Menambahkan entry statis
                    $carouselItems = [
                        [
                            'judul' => 'NAGA',
                            'subjudul' => 'DRAGON KNIGHT',
                            'gambar' => 'assets/img/naga.png', 
                            'status' => 'aktif'
                        ],
                        [
                            'judul' => 'KILUA',
                            'subjudul' => 'DINGIN DAN KEJAM',
                            'gambar' => 'assets/img/kilua.jpg',
                            'status' => 'aktif'
                        ],
                        [
                            'judul' => 'TANJIRO',
                            'subjudul' => 'API DAN AIR',
                            'gambar' => 'assets/img/tanjiro.png',
                            'status' => 'aktif'
                        ],
                        [
                            'judul' => 'MIKEY',
                            'subjudul' => 'PETARUNG JALANAN',
                            'gambar' => 'assets/img/mikey.jpg',
                            'status' => 'aktif'
                        ]
                        
                    ];


                    // Mengambil data dari database
                    $panggil = $koneksi->query("SELECT * FROM hero WHERE status = 'aktif' LIMIT 3");
                    $dbItems = $panggil->fetch_all(MYSQLI_ASSOC);


                    // Gabungkan items statis dan dari database
                    $allItems = array_merge($carouselItems, $dbItems);
                    $activeSet = false;


                    // Menampilkan carousel items, pastikan hanya tiga yang ditampilkan
                    foreach ($allItems as $index => $item) {
                        if ($index >= 3) break; // Batasi hanya tiga slide
                        ?>
                        <div class="carousel-item <?= (!$activeSet && $index === 0) ? 'active' : ''; ?>" data-bs-interval="4000">
                            <img src="<?= $item['gambar'] ?? '/assets/img/iya.jpg'; ?>" class="d-block w-100" alt="...">
                            <div class="carousel-caption d-none d-md-block">
                                <h2><?= $item['judul']; ?></h2>
                                <p><?= $item['subjudul']; ?></p>
                            </div>
                        </div>
                        <?php
                        if (!$activeSet) {
                            $activeSet = true; // Tandai bahwa item aktif sudah ada
                        }
                    }
                    ?>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>
    </div>
    <script src="assets/js/bootstrap.bundle.min.js"></script>
</body>
</html>



