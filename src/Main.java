import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        int sum1 = 0;
        for (int i = 0; i < myInts.size(); i++) {
            sum1 += myInts.get(i);
        }
        float avg1 = (float)sum1/myInts.size();

        int sum2 = 0;
        for(int myInt: myInts) {
            sum2 += myInt;
        }
        float avg2 = (float)sum2 / myInts.size();

        int sum3 = 0;
        Iterator<Integer> MyIntIt = myInts.iterator();
        while(MyIntIt.hasNext()) {
            sum3 += MyIntIt.next();
        }
        float avg3 = (float)sum3 / myInts.size();

        System.out.println("For Loop: " + avg1 + "\nFor Each Loop: " + avg2 + "\nIterator: " + avg3);
    }
}