public class latihan21 {
    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan();

        int[] numbers = {-5, -3, -6, -3, -4};
        bilangan.setNumbers(numbers);

        System.out.println("Nilai rata-rata: " + bilangan.getRataRata());
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

    public double getRataRata() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}
