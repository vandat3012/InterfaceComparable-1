import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(5,"blue");
        circles[1] = new Circle(6,"pink");
        circles[2] = new Circle(2,"blue");

        System.out.println("After Result");
        for (Circle o : circles) {
            System.out.println(o);
        }

        Comparator comparator = new CircleComparater();
        Arrays.sort(circles , comparator);
        System.out.println("Before Result");
        for (Circle o : circles) {
            System.out.println(o);
        }

    }
}