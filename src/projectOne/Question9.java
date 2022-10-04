package projectOne;

public class Question9 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 40, 45, 50,75, -2, 4};
        int max = 0;
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < max) {
                max = numbers[i];
            } else if (numbers[i] > min) {
                min = numbers[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
