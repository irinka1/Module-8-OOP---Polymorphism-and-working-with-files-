package RosaRomTul;

public class Tulip extends Flowers{

    private double price = 45;

    public Tulip (){
        super.price = this.price;
    }

      public String show(){
        return "Тюльпан";
    }

    public double getPrice() {
        return price;
    }
}


