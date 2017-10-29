/**
 * Created by Yuliang on 03/08/17.
 */
public class TapeEquilibrium {
    public static void main(String[] args){
        int[] A = new int[]{3,1,2,4,3};

        SolutionTape sol = new SolutionTape();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionTape {
    public int solution(int[] A) {
        // write your code in Java SE 8

        // s1
        int[] s1 = new int[A.length - 1];
        s1[0] = A[0];
        for (int i = 1; i < s1.length; i++) {
            s1[i] = s1[i - 1] + A[i];
        }

        // s2
        int[] s2 = new int[A.length - 1];
        s2[s2.length - 1] = A[A.length - 1];
        for (int i = s2.length - 2; i >= 0; i--) {
            s2[i] = s2[i + 1] + A[i + 1];
        }

        int Finalsum = Integer.MAX_VALUE;
        for (int i = 0; i < s1.length; i++) {
            int sum = Math.abs(s1[i] - s2[i]);
            Finalsum = Finalsum > sum ? sum : Finalsum;
        }
        return Finalsum;
    }
}
