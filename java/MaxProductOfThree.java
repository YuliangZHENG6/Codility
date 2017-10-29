import java.util.Arrays;

/**
 * Created by Yuliang on 07/08/17.
 */
public class MaxProductOfThree {
    public static void main(String[] args){
        int[] A = new int[]{ -2, 5, 6};

        SolutionMaxPro sol = new SolutionMaxPro();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionMaxPro {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length < 3) return 0;

        Arrays.sort(A);
        int pro1 = A[A.length-1]*A[A.length-2]*A[A.length-3];
        int pro2 = A[A.length-1]*A[0]*A[1];
        return pro1>pro2 ? pro1:pro2;
    }
}


