/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-10
 */
class OperasiPenjumlahan extends OperasiBilangan {

    @Override
    protected void set_C() {
        this.c = this.a + this.b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Penjumlahan: " + get_C());
    }
}

class OperasiPengurangan extends OperasiBilangan {

    @Override
    protected void set_C() {
        this.c = this.a - this.b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pengurangan: " + get_C());
    }
}

class OperasiPerkalian extends OperasiBilangan {

    @Override
    protected void set_C() {
        this.c = this.a * this.b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Perkalian: " + get_C());
    }
}

class OperasiPembagian extends OperasiBilangan {

    @Override
    protected void set_C() {
        if (this.b != 0) {
            this.c = this.a / this.b;
        } else {
            System.out.println("Error: Pembagian dengan nol.");
            this.c = Double.NaN; // Not-a-Number
        }
    }

    @Override
    protected void tampil() {
        if (!Double.isNaN(get_C())) {
            System.out.println("Hasil Pembagian: " + get_C());
        }
    }
}
