import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yuliang on 07/08/17.
 */
public class Triangle {
    public static void main(String[] args){
        int[] A = new int[]{10, 2, 5, 1, 8, 20};

        SolutionTriangle sol = new SolutionTriangle();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionTriangle {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length < 3) return 0;

        Arrays.sort(A);
        for(int i = 0; i < A.length - 2; i++){
            if (A[i] > 0 && A[i+1] + A[i] > A[i+2]){
                return 1;
            }
        }
        return 0;
    }
}
