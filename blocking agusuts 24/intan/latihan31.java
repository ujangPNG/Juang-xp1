public class latihan31 {
    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan();

        int[] numbers = {2, 5, 3, 5, 9, 5};
        bilangan.setNumbers(numbers);
        bilangan.ubahAngka(5, 1);

        int[] hasil = bilangan.getNumbers();
        System.out.print("Hasil setelah mengubah angka 5 menjadi 1: ");
        for (int num : hasil) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Bilangan {
    private int[] numbers;

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
}
