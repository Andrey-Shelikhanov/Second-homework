public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15465; // Стоимость билета
        int bonusMilePerCost = 20; // Кол-во рублей за которое начисляется 1 миля
        int bonusAmount; // Кол-во бонусных миль

        bonusAmount = (ticketPrice / bonusMilePerCost);
        System.out.println("Стоимость вашего билета составила");
        System.out.println(ticketPrice + " Рубль(ей/ля)");
        System.out.println("Количество начисленных бонусных миль");
        System.out.println(bonusAmount + " Миля(ль/ли)");

    }

}
