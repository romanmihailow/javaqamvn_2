import ru.netology.bonus.BonusService;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService(); // Сервис расчета бонусов
        long bonus = service.calculate( 100060, true);
        System.out.println(bonus);




    }



}
