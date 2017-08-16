import RosaRomTul.Cham;
import RosaRomTul.Flowers;
import RosaRomTul.Roza;
import RosaRomTul.Tulip;

import java.util.Arrays;

public class main {


    public static void main(String[] args) {

        FlowerStore flowerStore = new FlowerStore(4,2,3);
        Flowers[] flowers = flowerStore.sell(3,5,1);
        showFlowers(flowers);


        Flowers[] flowers1 = flowerStore.sellSequence(3,2,3);
        showFlowers(flowers1);

    }

    public static void showFlowers(Flowers[] flowers){
        for (int i = 0; i < flowers.length; i++){
            System.out.print(flowers[i].show() + " ");
        }
        System.out.println();
    }


}
