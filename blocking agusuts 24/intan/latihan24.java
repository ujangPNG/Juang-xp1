public class latihan24 {
    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan();

        int[] numbers = {-5, -3, -6, -3, -4};
        bilangan.setNumbers(numbers);

        int[] indices = bilangan.getIndex(-3);
        System.out.print("Angka -3 terdapat pada index: ");
        for (int index : indices) {
            System.out.print(index + " ");
        }
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

    public int[] getIndex(int value) {
        int count = 0;
        for (int num : numbers) {
            if (num == value) {
                count++;
            }
        }

        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                indices[index++] = i;
            }
        }
        return indices;
    }
}
