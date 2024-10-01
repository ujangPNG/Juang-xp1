public class latihan32 {
    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan();

        int[] numbers = {2, 1, 3, 1, 9, 1};
        bilangan.setNumbers(numbers);
        bilangan.kalikanBilangan(0.5);

        double[] hasil = bilangan.getHasilPerkalian();
        System.out.print("Hasil setelah mengalikan bilangan dengan 0.5: ");
        for (double num : hasil) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Bilangan {
    private int[] numbers;
    private double[] hasilPerkalian;

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void ubahAngka(int angkaLama, int angkaBaru) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == angkaLama) {
                numbers[i] = angkaBaru;
            }
        }
    }

    public void kalikanBilangan(double faktor) {
        hasilPerkalian = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            hasilPerkalian[i] = numbers[i] * faktor;
        }
    }

    public double[] getHasilPerkalian() {
        return hasilPerkalian;
    }
}
