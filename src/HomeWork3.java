public class HomeWork3 {
    public static void main(String[] args) {
        double[] numbers = {8.5, 2.3, -4.2, 1.1, -3.7, 5.6, 3.3, -2.0, 4.9, 6.6, -1.4, 7.2, -5.1, 2.8, 3.7};

        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double num : numbers) {
            if (!foundNegative) {
                if (num < 0) {
                    foundNegative = true;
                }
            } else {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Положительные числа после первого отрицательного не найдены.");
        }
    }
}

