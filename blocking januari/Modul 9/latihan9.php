<html>
    <head>
        <title>
Mencetak String        </title>
    </head>
    <body>
            <?php
            define("PI","3.14");
            $radius=100;
            $L_lingkar=PI*($radius*$radius);
            $K_lingkar=2*PI*$radius;
            echo"Luas lingkaran: ".$L_lingkar."";
            echo "<br />";
            echo"Keliling lingkar: ".$K_lingkar."";
            ?>
    </body>
</html>