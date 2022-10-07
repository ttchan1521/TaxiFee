public class Fee {
    public static long calculateFee(double km, boolean familiarCus)
    {
        if (km <= 0)
            return 0;

        long money = 0;
        if (km <= 0.8) {
            money = 14000;
        } else if (km <= 25) {
            money = (long) (14000 + 16300 * (km - 0.8));
        } else {
            money = (long) (14000 + 16300 * (25 - 0.8) + 13300 * (km - 25));
        }

        if (familiarCus) {
            money = (long) (money * (1 - 0.1));
        }

        return money;
    }
}
