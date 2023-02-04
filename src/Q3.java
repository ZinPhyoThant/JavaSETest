import java.sql.Array;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int numbers[] = {23,24,12,78,62};

        int largestNumber =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>largestNumber){
                largestNumber = numbers[i];
            }

        }
        System.out.println(largestNumber);
    }
}
