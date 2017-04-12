import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        Integer[] a = new Integer[1];
        l.toArray(a);
        System.out.println(a[0]);
        System.out.println("Hello World!");
    }
}

