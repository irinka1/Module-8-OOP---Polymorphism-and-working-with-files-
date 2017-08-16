/*Создать класс FlowerStore который продает букеты цветов через функцию sell. Эта функция принимает 3 числа.
Кол-во роз, кол-во ромашек, кол-во тюльпанов. А вернуть должна один массив цветов, в котором будут храниться цветы.
Один объект в массив == один цветок в букете. Последовательность расстановки цветов в букете не имеет значения.
*/

import RosaRomTul.Cham;
import RosaRomTul.Flowers;
import RosaRomTul.Roza;
import RosaRomTul.Tulip;

public class FlowerStore extends Flowers{

    private int numbroza;
    private int numbromashka;
    private int numbtulpan;
    public Roza roza;
    //private  flowers;

    public FlowerStore(int numbroza, int numbromashka, int numbtulpan) {
        this.numbroza = numbroza;
        this.numbromashka = numbromashka;
        this.numbtulpan = numbtulpan;

    }


    public Flowers[] sell(int numbrose, int numbromashka, int numbtulpan) {
        Flowers[] flowers = new Flowers [numbrose + numbromashka + numbtulpan];

        for (int i = 0; i < numbrose; i++) {
          flowers[i] = new Roza();

        }

        for (int j = numbrose; j < numbrose + numbromashka; j++) {
            flowers[j] = new Cham();
        }

        for (int m = numbrose + numbromashka; m < numbrose + numbromashka + numbtulpan; m++) {
            flowers[m] = new Tulip();
        }

        return flowers;
    }

    public Flowers[]  sellSequence (int numbrose, int numbromashka, int numbtulpan){
        Flowers[] flowers1 = new Flowers [numbrose + numbromashka + numbtulpan];
        int j;
        for (int i = 0; i <numbrose + numbromashka + numbtulpan; i += j){
            j = 0;
            if (numbrose > 0) {
                flowers1[i] = new Roza();
                numbrose--;
                j++;
            }
            if (numbromashka > 0){
                flowers1[i] = new Cham();
                numbromashka--;
                j++;
            }
            if (numbtulpan > 0){
                flowers1[i] = new Tulip();
                numbtulpan--;
                j++;
            }
        }
        return flowers1;
    }

}
