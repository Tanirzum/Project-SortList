import java.util.Comparator;

public class idComparator implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getIdHouse() - o2.getIdHouse();
    }
}
