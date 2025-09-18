package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<Integer>();
        al.add(51);
        al.add(12);
        al.add(03);
        al.add(23);
        al.add(31);
        al.add(41);

        Collections.sort(al);
        System.out.println(al);
    }
}
