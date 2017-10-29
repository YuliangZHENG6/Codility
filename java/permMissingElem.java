/**
 * Created by Yuliang on 03/08/17.
 */
import java.util.*;

public class permMissingElem {
    public static void main(String[] args){
        int[] A = new int[]{1,2,3};

        SolutionPerm sol = new SolutionPerm();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionPerm {
    public int solution(int[] A) {
        int missing = -1;

        // empty
        if(A.length == 0){
            missing = 1;
        }else {

            // sort the array
            Arrays.sort(A);

            // traverse and search for the missing element
            int last = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] != i + 1) {
                    missing = i + 1;
                    break;
                }
                last += 1;
            }
            if(last == A.length){
                missing = A.length+1;
            }

        }
        return missing;
    }
}

