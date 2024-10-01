public class MainArray2 {
    public static void main(String[] args){
        Array2 ob = new Array2();
        String [][] Mhs = {
            {"NIM", "NAMA"},
            {"11223344", "INTAN"},
            {"55667788", "DAVINA"},
            {"99887766", "VANI"},
            {"55443322", "MARIN"}
        };
        ob.tampil("Data Mahasiswa: ");
        ob.setMahasiswa(Mhs);
        ob.tampil(ob.getMahasiswa());
        ob.tampil("===================");
        int[][] data = {
            {1,2},
            {3,4},
            {5,6}
        };
        int pengali = 2;
        ob.tampil("Data Matriks: ");
        ob.setData(data);
        ob.tampil(ob.getData());
        ob.tampil("Data Matriks X "+pengali+" : ");
        ob.setPerkalianSkalar(data,pengali);
        ob.tampil(ob.getPerkalianSkalar());

        ob.hapus();
        Mhs = null;
        data = null;
        ob = null;
    }
}