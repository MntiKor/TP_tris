import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        GenerateArrayList gene = new GenerateArrayList();

        ArrayList<Integer> list = gene.GenerateIntArrayList(10, 5, 20);
        System.out.println(list.toString());

        Bubbles bubbles = new Bubbles();
        bubbles.applyTo(list);
        System.out.println(list.toString());

    }
}
