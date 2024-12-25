public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] costsByMonth = new int[]{10000, 14000, 20000, 42000, 7000};
        int sum = 0;
        for (int k : costsByMonth) {
            sum += k;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
        //Task 2
        int[] costsByWeek = new int[]{2000, 3000, 4000, 5000, 6000};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int k : costsByWeek) {
            if (min > k) {
                min = k;
            }
            if (max < k) {
                max = k;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей\n", min);
        System.out.printf("Максимальная сумма трат за неделю составила %d рублей\n", max);
        //Task 3
        double averageCost = 0;
        int count = 0;
        for (int k : costsByMonth) {
            averageCost += k;
            count++;
        }
        averageCost /= count;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", averageCost);
        //Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (char k : reverseFullName) {
            System.out.printf("%s ", k);
        }

    }
}