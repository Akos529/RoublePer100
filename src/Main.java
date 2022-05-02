public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int paid = 100;
        int bonus;

        if (paid < 1000) {
            bonus = 0;
        } else {
            bonus = paid / 100;
        }
        int finalAmount = initialAmount + paid + bonus;
        System.out.println("Итоговая сумма на счете: " + finalAmount);
        System.out.println("Начислено бонусов: " + bonus);
    }
}
