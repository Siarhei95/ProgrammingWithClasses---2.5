package task2_5;

import java.util.*;

public class Vouchers {

    private String nameVouchers;
    private ArrayList<Relaxation> relaxationsList = new ArrayList<>();

    Vouchers(String nameVouchers) {
        this.nameVouchers = nameVouchers;
    }

    void addRalaxationTour(Relaxation relaxation) {
        relaxationsList.add(relaxation);
    }

    public List<Relaxation> getListByPlaceRelax() {
        List<Relaxation> list = new ArrayList<>(relaxationsList);
        Collections.sort(list, new Comparator<Relaxation>() {
            @Override
            public int compare(Relaxation o1, Relaxation o2) {
                return o1.getPlace().compareToIgnoreCase(o2.getPlace());
            }
        });
        return list;
    }

    public List<Relaxation> getPlaceRelaxation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the place: ");
        String finder = scanner.next();
        List<Relaxation> list = new ArrayList<>(relaxationsList);
        for (Relaxation c : relaxationsList) {
            if (c.getPlace().equals(finder)) {
                list.add(c);
                System.out.println("place: "+c.getPlace()+"\t transport: "+c.getTransport()+"\t " +
                        " date: "+c.getDate()+"\t  daysStay: "+c.getDaysStay()+"\t  food: "+c.getFood()+"");
            }
        }
        return list;
    }





    private ArrayList<Excursions> excursionsList = new ArrayList<>();

    void addExcursionTour(Excursions excursions) {
        excursionsList.add(excursions);
    }

    public List<Excursions> getListByPlaceExcur() {
        List<Excursions> list = new ArrayList<>(excursionsList);
        Collections.sort(list, new Comparator<Excursions>() {
            @Override
            public int compare(Excursions o1, Excursions o2) {
                return o1.getPlace().compareToIgnoreCase(o2.getPlace());
            }
        });
        return list;
    }

    public List<Excursions> getPlaceExcursions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the place: ");
        String finder = scanner.next();
        List<Excursions> list = new ArrayList<>(excursionsList);
        for (Excursions c : excursionsList) {
            if (c.getPlace().equals(finder)) {
                list.add(c);
                System.out.println("place: "+c.getPlace()+"\t transport: "+c.getTransport()+"\t " +
                        " date: "+c.getDate()+"\t  daysStay: "+c.getDaysStay()+"\t  food: "+c.getFood()+"");
            }
        }
        return list;
    }





    private ArrayList<Shopping> shoppingsList = new ArrayList<>();

    void addShoppingTour(Shopping shopping) {
        shoppingsList.add(shopping);
    }

    public List<Shopping> getListByPlaceShop() {
        List<Shopping> list = new ArrayList<>(shoppingsList);
        Collections.sort(list, new Comparator<Shopping>() {
            @Override
            public int compare(Shopping o1, Shopping o2) {
                return o1.getPlace().compareToIgnoreCase(o2.getPlace());
            }
        });
        return list;
    }

    public List<Shopping> getPlaceShopping() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the place: ");
        String finder = scanner.next();
        List<Shopping> list = new ArrayList<>(shoppingsList);
        for (Shopping c : shoppingsList) {
            if (c.getPlace().equals(finder)) {
                list.add(c);
                System.out.println("place: "+c.getPlace()+"\t transport: "+c.getTransport()+"\t " +
                        " date: "+c.getDate()+"\t  daysStay: "+c.getDaysStay()+"\t  food: "+c.getFood()+"");
            }
        }
        return list;
    }




    private ArrayList<TravelAroundTheWorld> travelAroundTheWorldsList = new ArrayList<>();

    void addTravelAroundTheWorldTour(TravelAroundTheWorld travelAroundTheWorld) {
        travelAroundTheWorldsList.add(travelAroundTheWorld);
    }

    public List<TravelAroundTheWorld> getListByPlaceWorld() {
        List<TravelAroundTheWorld> list = new ArrayList<>(travelAroundTheWorldsList);
        Collections.sort(list, new Comparator<TravelAroundTheWorld>() {
            @Override
            public int compare(TravelAroundTheWorld o1, TravelAroundTheWorld o2) {
                return o1.getPlace().compareToIgnoreCase(o2.getPlace());
            }
        });
        return list;
    }

    public List<TravelAroundTheWorld> getPlaceTravelAroundTheWorld() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the place: ");
        String finder = scanner.next();
        List<TravelAroundTheWorld> list = new ArrayList<>(travelAroundTheWorldsList);
        for (TravelAroundTheWorld c : travelAroundTheWorldsList) {
            if (c.getPlace().equals(finder)) {
                list.add(c);
                System.out.println("place: "+c.getPlace()+"\t transport: "+c.getTransport()+"\t " +
                        " date: "+c.getDate()+"\t  daysStay: "+c.getDaysStay()+"\t  food: "+c.getFood()+"");
            }
        }
        return list;
    }

}
