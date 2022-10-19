public class Main {
    public static void main(String[] args) {
        int startMoney = 200; // деньги на счету изначально
        int addMoney = 2200; // пополнение счета
        int bonus = 0;

        if (addMoney > 1000) {
            bonus = addMoney / 100;
        }

        System.out.println("Итоговый счет:" + (startMoney + addMoney + bonus));
        System.out.println("Полученный бонус:" + bonus);
    }
}