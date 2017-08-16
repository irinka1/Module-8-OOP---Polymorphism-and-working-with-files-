package RosaRomTul;

public class Cham extends Flowers {

        private double price = 70;

        public Cham(){
            super.price = this.price;
        }


    public String show(){
        return "Ромашка";
    }

    public double getPrice() {
        return price;
    }

}
