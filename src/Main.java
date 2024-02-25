public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int initiAlaccount = 100;
        int amountDeposit = 1100;
        if (amountDeposit < 1000) {
            int balans = amountDeposit + initiAlaccount;
            System.out.println(balans);
        } else {
            int balansBonus = amountDeposit / 100 + amountDeposit + initiAlaccount;
            System.out.println("initiAlaccount");
            System.out.println(balansBonus);
        }
    }
}