public class latihan22 {
    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan();

        int[] numbers = {-5, -3, -6, -3, -4};
        bilangan.setNumbers(numbers);

        System.out.println("Nilai maksimum: " + bilangan.getMaksimum());
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

    public int getMaksimum() {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
