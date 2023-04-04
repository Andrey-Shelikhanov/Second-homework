public class Main {
    public static void main(String[] args) {
        int ticket_price = 15465; // Стоимость билета
        int bonus_mile_per_cost = 20; // Кол-во рублей за которое начисляется 1 миля
        int bonus_amount; // Кол-во бонусных миль

        bonus_amount = (ticket_price / bonus_mile_per_cost);
        System.out.println("Стоимость вашего билета составила");
        System.out.println(ticket_price + " Рубль(ей/ля)");
        System.out.println("Количество начисленных бонусных миль");
        System.out.println(bonus_amount + " Миля(ль/ли)");

    }

}
