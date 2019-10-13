//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.


package task2_5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vouchers ticket1 = new Vouchers("Market");
        ticket1.addRalaxationTour(new Relaxation("Мальдивы","Самолет","1 декабря 2019",10,"Все включено"));
        ticket1.addRalaxationTour(new Relaxation("Мадагаскар","Яхта","22 ноября",15,"Питиние не включено"));
        ticket1.addRalaxationTour(new Relaxation("Египет","Самолет","20 октября", 7,"Все включено"));
        ticket1.addRalaxationTour(new Relaxation("Сочи","Поезд","15 октября",20,"Разовое питание"));
        ticket1.addRalaxationTour(new Relaxation("Одесса","Автобус","13 ноября",14,"Бесплатные завтраки"));

        System.out.println("Sort relaxation place: ");
        List<Relaxation> listSortByPlace1 = ticket1.getListByPlaceRelax();
        for (Relaxation c : listSortByPlace1) {
            System.out.println(c);
        }

        System.out.println();
        ticket1.getPlaceRelaxation();




        Vouchers ticket2 = new Vouchers("Market");
        ticket2.addExcursionTour(new Excursions("Хатынь","Автобус","12 января 2020",2,"Нет"));
        ticket2.addExcursionTour(new Excursions("Чернобыль","Маршрутка","3 мая 2019",1,"Нет"));
        ticket2.addExcursionTour(new Excursions("Освенцим","Поезд","2 ноября 2019", 4,"Трехразовое питание"));
        ticket2.addExcursionTour(new Excursions("Несвиж","Поезд","23 декабря 2019",2,"Разовое питание"));
        ticket2.addExcursionTour(new Excursions("Мир","Автобус","17 ноября 2019",5,"Бесплатные завтраки"));

        System.out.println("\nSort excursion place: ");
        List<Excursions> listSortByPlace2 = ticket2.getListByPlaceExcur();
        for (Excursions c : listSortByPlace2) {
            System.out.println(c);
        }

        System.out.println();
        ticket2.getPlaceExcursions();



        Vouchers ticket3 = new Vouchers("Market");
        ticket3.addShoppingTour(new Shopping("Белосток","Автобус","11 января 2020",1,"Нет"));
        ticket3.addShoppingTour(new Shopping("Хмельницкий","Маршрутка","30 апреля 2020",1,"Нет"));
        ticket3.addShoppingTour(new Shopping("Вильнюс","Минибас","28 ноября 2019", 1,"Кофе бесплатно"));
        ticket3.addShoppingTour(new Shopping("Варшава","Эколайнс","4 декабря 2019",1,"По пути кафе"));
        ticket3.addShoppingTour(new Shopping("Смоленск","Автобус","27 февраля 2020",1,"Нет"));

        System.out.println("\nSort shopping place: ");
        List<Shopping> listSortByPlace3 = ticket3.getListByPlaceShop();
        for (Shopping c : listSortByPlace3) {
            System.out.println(c);
        }

        System.out.println();
        ticket3.getPlaceShopping();



        Vouchers ticket4 = new Vouchers("Market");
        ticket4.addTravelAroundTheWorldTour(new TravelAroundTheWorld("Чили","Самолет","1 января 2020",100,"Все включено"));
        ticket4.addTravelAroundTheWorldTour(new TravelAroundTheWorld("Австралия","Лайнер","5 февраля 2020",90,"50%50"));
        ticket4.addTravelAroundTheWorldTour(new TravelAroundTheWorld("Канада","Верталет","14 мая 2021", 30,"Все включено"));
        ticket4.addTravelAroundTheWorldTour(new TravelAroundTheWorld("Гренландия","Самолет","9 мая 2020",48,"За свои средства"));
        ticket4.addTravelAroundTheWorldTour(new TravelAroundTheWorld("Аляска","Ледокол","16 апреля 2020",190,"Собственный бюджет"));

        System.out.println("\nSort travel around the world place: ");
        List<TravelAroundTheWorld> listSortByPlace4 = ticket4.getListByPlaceWorld();
        for (TravelAroundTheWorld c : listSortByPlace4) {
            System.out.println(c);
        }

        System.out.println();
        ticket4.getPlaceTravelAroundTheWorld();
    }
}
