
import java.util.Arrays;

public class Lesson_1 {

    
    public static void main(String[] args) {
        Figures f = new Figures();
        Algorithms a = new Algorithms();
        int[] arr = {29,7,9,-3,-6,-16,0,-27,-15,23,35};
        a.sort(arr,0,10);
        System.out.println(Arrays.toString(arr));
    }
    
}
