import java.util.ArrayList;
import java.util.Random;

public class GenerateArrayList {

    ArrayList list = new ArrayList<>();

    public GenerateArrayList() {}

    public ArrayList<Integer> generateIntArrayList(int len, int inf, int sup) {
        this.list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            list.add(rand.nextInt(sup - inf) + inf);
        }
        return list;
    }

    public ArrayList<Boolean> generateBoolArrayList(int len) {
        this.list = new ArrayList<Boolean>();
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            list.add(rand.nextBoolean());
        }
        return list;
    }

    public ArrayList<Character> generateCharArrayList(int len) {
        this.list = new ArrayList<Character>();
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < len; i++) {
            list.add(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        return list;
    }

    public ArrayList<String> generateStrArrayList(int len, int maxStrLen) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        this.list = new ArrayList<String>();
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            int strLen = rand.nextInt(maxStrLen + 1);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strLen; j++) {
                sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
            }
            list.add(sb.toString());
        }
        return list;
    }

    public ArrayList<Double> generateDoubleArrayList(int len) {
        this.list = new ArrayList<Double>();
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            list.add(rand.nextDouble());
        }
        return list;
    }
}
