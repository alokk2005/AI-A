package Unit3;

import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        Vector<String> vt=new Vector<String>(5,5);
        vt.add("First");
        vt.add("Second");
        vt.add("five");

        vt.add(2,"Third");
        vt.add(3,"Fourth");
        System.out.println(vt.capacity());
        System.out.println(vt.size());

        System.out.println(vt.remove(0));


        System.out.println(vt);
    }

}
