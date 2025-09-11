package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            products.add(sc.nextInt());

        }
        System.out.println(products);
        Collections.sort(products);
        System.out.println(products);
    }
}
