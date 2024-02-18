import java.util.*;

public class SetEvaluate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(12);
        set.add(12);
        set.add(9);
        set.add(7);
        set.add(7);

        for(int i:set){
            System.out.println(i);
        }
    }
}
