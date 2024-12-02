
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) throws Exception {

        File f = new File("./input.txt");
        Scanner s = new Scanner(f);
        int total = 0;
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> b = new HashMap<>();

        while (s.hasNextLine()) {
            a.add(s.nextInt());
            int index = s.nextInt();
            int count = b.containsKey(index) ? b.get(index) : 0;
            b.put(index, count + 1);

        }

        for (int i : a) {
            int count = b.containsKey(i) ? b.get(i) : 0;
            total += i * count;
        }
        System.out.println(total);
    }
}