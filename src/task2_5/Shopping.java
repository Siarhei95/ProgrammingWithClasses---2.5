package task2_5;

public class Shopping {
    private String place;
    private String transport;
    private String date;
    private int daysStay;
    private String food;

    public Shopping(String place, String transport, String date, int daysStay, String food){
        this.place = place;
        this.transport = transport;
        this.date = date;
        this.daysStay = daysStay;
        this.food = food;
    }

    public String getPlace() {
        return place;
    }
    public String getTransport() {
        return transport;
    }
    public String getDate() {
        return date;
    }
    public int getDaysStay(){
        return daysStay;
    }
    public String getFood(){
        return food;
    }
    public String toString() {
        return String.format("place: %s\t transport: %s\t  date: %s \t  daysStay: %s\t  food: %s",
                place, transport, date, daysStay, food);
    }
}
