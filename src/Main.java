public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int initialaccount = 100;
        int amountdeposit = 1100;
        if (amountdeposit < 1000) {
            int balans = amountdeposit + initialaccount;
            System.out.println(balans);
        } else if(amountdeposit >= 1000) {
            int balansbonus = amountdeposit / 100 + amountdeposit + initialaccount;
            System.out.println("initialaccount");
            System.out.println(balansbonus);
        }
    }
}