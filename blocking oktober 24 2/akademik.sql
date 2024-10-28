set SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone="+00:00";

CREATE Table 'mahasiswa'(
    'id' INT(11) NOT NULL
    'nim' VARCHAR(25) NOT NULL
    'nama' VARCHAR(25) NOT NULL
    'alamat' VARCHAR(25) NOT NULL
    'fakultas' VARCHAR(25) NOT NULL
) engine=InnoDB DEFAULT Charset=utf8mb4;

INSERT INTO 'mahasiswa'('id','nim','nama','alamat','fakultas')values
(4,'20200003','Tri Untoro','Semarang Tengah','soshum'),
(4,'20200004','Ahmad','Yogyakarta','saintek'),
(4,'20200005','Doni','Jakarta','soshum'),
(4,'20200006','Budi','Klaten','soshum'),

ALTER Table 'mahasiswa'
add primary key('id'),
add unique key 'nim'('nim');

alter Table 'mahasiswa'
modify 'id'INT(11)not null AUTO_INCREMENT,
auto_increment=8;
Commit;