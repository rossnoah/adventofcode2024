
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws Exception {

        File f = new File("./input.txt");
        Scanner s = new Scanner(f);
        int total = 0;

        loop:

        while (s.hasNextLine()) {
            Scanner s2 = new Scanner(s.nextLine());
            ArrayList<Integer> a = new ArrayList<>();

            while (s2.hasNextInt()) {
                a.add(s2.nextInt());
            }

            boolean inc = a.get(0) < a.get(1);
            for (int i = 0; i < a.size() - 1; i++) {
                int difference = Math.abs(a.get(i) - a.get(i + 1));
                if (difference > 3 || difference < 1) {
                    continue loop;
                }

                if (inc) {
                    if (a.get(i) > a.get(i + 1)) {
                        continue loop;
                    }
                } else {
                    if (a.get(i) < a.get(i + 1)) {
                        continue loop;
                    }
                }
            }
            total++;

        }

        System.out.println(total);
    }
}