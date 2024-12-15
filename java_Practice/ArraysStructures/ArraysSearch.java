package ArraysStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println("n: " + n);
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(scanner.nextInt());
            }
            data.add(row);
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x <= data.size() && x > 0 && y > 0 && y <= data.get(x - 1).size()) {
                System.out.println(data.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
