package RosaRomTul;

public class Roza extends Flowers {

    private double price = 100;

    public Roza(){
        super.price = this.price;
    }


    public String show(){
        return "Роза";
    }

    public double getPrice() {
        return price;
    }
}
