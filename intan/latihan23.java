public class latihan23 {
    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan();

        int[] numbers = {-5, -3, -6, -3, -4};
        bilangan.setNumbers(numbers);

        System.out.println("Nilai minimum: " + bilangan.getMinimum());
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

    public int getMinimum() {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
