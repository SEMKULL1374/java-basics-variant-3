import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] purchases = new int[5];

        System.out.println("Введите 5 сумм покупок (в рублях):");
        for (int i = 0; i < purchases.length; i++) {
            System.out.print("Покупка №" + (i + 1) + ": ");
            purchases[i] = scanner.nextInt();
        }
        scanner.close();

        int totalSum = 0;
        for (int purchase : purchases) {
            totalSum += purchase;
        }

        double bonusPercent;
        if (totalSum > 5000) {
            bonusPercent = 10.0;
        } else if (totalSum > 2000) {
            bonusPercent = 5.0;
        } else {
            bonusPercent = 0.0;
        }

        double bonusAmount = totalSum * (bonusPercent / 100.0);

        System.out.println("\nОбщая сумма покупок: " + totalSum + " руб.");
        System.out.println("Процент кэшбека: " + bonusPercent + "%");
        System.out.println("Начислено бонусов: " + bonusAmount + " руб.");
    }
}
