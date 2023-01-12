public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService(); // Сервис расчета бонусов
        long bonus = service.calculate( 99, false);
        System.out.println(bonus);




    }



}
