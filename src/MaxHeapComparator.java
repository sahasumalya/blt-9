import java.util.Comparator;

public class MaxHeapComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {  // 2, 3
        if(o1 < o2) {
            return 1;
        }
        return -1;
    }
}
