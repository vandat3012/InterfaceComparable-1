import java.util.Comparator;

public class CircleComparater extends Circle
        implements Comparator<Circle> {
    @Override
    public int compare(Circle c1 , Circle c2) {
        if (c1.getRadius() > c2.getRadius()){
            return 1;
        }else if (c1.getRadius() == c2.getRadius()) {
            return 0;
        }else {
            return -1;
        }
    }
}
