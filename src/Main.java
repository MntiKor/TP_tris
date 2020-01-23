import java.util.ArrayList;
import static java.lang.System.out;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        GenerateArrayList gene = new GenerateArrayList();

        ArrayList<Integer> list = gene.GenerateIntArrayList(10, 5, 20);
        System.out.println(list);
    }
}
