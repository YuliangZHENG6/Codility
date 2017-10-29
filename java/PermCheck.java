import java.util.Arrays;

/**
 * Created by Yuliang on 03/08/17.
 */
public class PermCheck {
    public static void main(String[] args){
        int[] A = new int[]{3, 3, 3, 1, 5} ;

        SolutionPermC sol = new SolutionPermC();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionPermC {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;

        Arrays.sort(A);

        int max = A[A.length - 1];
        int min = A[0];

        int num =0;
        if(min == 1 || max-min+1 == A.length){
            for(int i=0; i<A.length; i++){
                if(A[i] != i+1){
                    break;
                }
                num++;
            }
        }
        if(num == A.length){
            result = 1;
        }

        return result;
    }
}