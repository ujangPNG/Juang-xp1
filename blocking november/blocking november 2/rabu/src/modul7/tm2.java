/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author vfz
 */
class AlatMusik {
    public void musik() {
        System.out.println("Memainkan alat musik");
    }
}

class Piano extends AlatMusik {
    public void musik() {
        System.out.println("Memainkan Piano");
    }
}

class Biola extends AlatMusik {
    public void musik() {
        System.out.println("Memainkan Biola");
    }
}

class Gitar extends AlatMusik {
    public void musik() {
        System.out.println("Memainkan Gitar");
    }
}

class Drum extends AlatMusik {
    public void musik() {
        System.out.println("Memainkan Drum");
    }
}

class Saxophone extends AlatMusik {
    public void musik() {
        System.out.println("Memainkan Saxophone");
    }
}

class Trumpet extends AlatMusik {
    public void musik() {
        System.out.println("Memainkan Trumpet");
    }
}

public class tm2 {
    public static void main(String[] args) {
        AlatMusik alat1 = new Piano();
        AlatMusik alat2 = new Biola();
        AlatMusik alat3 = new Gitar();
        AlatMusik alat4 = new Drum();
        AlatMusik alat5 = new Saxophone();
        AlatMusik alat6 = new Trumpet();

        musik(alat1);
        musik(alat2);
        musik(alat3);
        musik(alat4);
        musik(alat5);
        musik(alat6);
    }

    public static void musik(AlatMusik alatMusik) {
        alatMusik.musik();
    }
}
