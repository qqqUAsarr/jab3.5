public class Main {
    public static void main(String[] args) {
        int[] array = generateArray(300, -100, 150);

        findSignChangeSequences(array);
    }

    public static void findSignChangeSequences(int[] array) {
        int length = array.length;
        int startIndex = 0;
        int sequenceLength = 1;

        for (int i = 1; i < length; i++) {
            if (array[i] * array[i - 1] < 0) { // Змінюється знак
                System.out.println("Послідовність знакозмінних чисел:");
                System.out.println("Початковий індекс: " + startIndex);
                System.out.println("Довжина: " + sequenceLength);
                System.out.println();
                sequenceLength = 1;
                startIndex = i;
            } else {
                sequenceLength++;
            }
        }
    }

    public static int[] generateArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }
}
