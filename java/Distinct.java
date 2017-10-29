import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yuliang on 07/08/17.
 */
public class Distinct {
    public static void main(String[] args){
        int[] A = new int[]{2, 1, 1, 2, 3, 1};

        SolutionDistinct sol = new SolutionDistinct();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionDistinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) return 0;
        Arrays.sort(A);
        int num = 1;
        for(int i = 1; i < A.length; i++){
            if(A[i] != A[i-1]){
                num++;
            }
        }
        return num;
    }
}