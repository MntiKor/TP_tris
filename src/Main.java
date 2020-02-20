import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        GenerateArrayList gene = new GenerateArrayList();

        ArrayList<?> list = gene.generateStrArrayList(40, 5);
        System.out.println("liste de base : " + list.toString());
        ArrayList<?> newList = list;

        Bubbles bubbles = new Bubbles();
        bubbles.applyTo(newList);
        System.out.println("tri par bulles : " + newList.toString());

        newList = list;
        Quick quick = new Quick();
        quick.applyTo(newList, 0, list.size() - 1);
        System.out.println("tri rapide : " + newList.toString());

        newList = list;
        Fusion fusion = new Fusion();
        fusion.applyTo(newList, 0, list.size() - 1);
        System.out.println("tri par fusion : " + newList.toString());

        newList = list;
        Heap heap = new Heap();
        heap.applyTo(newList);
        System.out.println("tri par tas : " + newList.toString());



    }
}
