import java.util.ArrayList;
import java.util.Random;

public class GenerateArrayList {

    ArrayList liste;
    int borneInf = 0; //par defaut si la list n'est pas composee d'entiers
    int borneSup = 0;

    public GenerateArrayList() {
        this.liste = new ArrayList<>();
    }

    public ArrayList GenerateIntArrayList(int len, int inf, int sup) {
        this.liste = new ArrayList<Integer>();
        this.borneInf = inf;
        this.borneSup = sup;
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            liste.add(rand.nextInt(borneSup - borneInf) + borneInf);
        }
        return liste;
    }
}
