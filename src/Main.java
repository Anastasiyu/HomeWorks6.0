public class Main {
    public static void main(String[] args) {
        task1();
    }


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random randome = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = randome.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        int[] array = generateRandomArray();
        int sum = 0;
        for (int spending : array) {
            sum += spending;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей", sum);
    }
}