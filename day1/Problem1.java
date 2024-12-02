
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws Exception {

        File f = new File("./input.txt");
        Scanner s = new Scanner(f);
        int total = 0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        while (s.hasNextLine()) {
            a.add(s.nextInt());
            b.add(s.nextInt());

        }

        Collections.sort(a);
        Collections.sort(b);

        for (int i = 0; i < a.size(); i++) {
            total += Math.abs(a.get(i) - b.get(i));
        }
        System.out.println(total);
    }
}