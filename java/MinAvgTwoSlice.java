/**
 * Created by Yuliang on 07/08/17.
 */
public class MinAvgTwoSlice {
    public static void main(String[] args){
        int[] A = new int[]{4,2,2,5,1,5,8};

        SolutionMinAvg sol = new SolutionMinAvg();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionMinAvg {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 2) return 0;

        int minLength2 = A[0] + A[1];
        int min2Index = 0;

        int minLength3 = Integer.MAX_VALUE;
        int min3Index = 0;

        for (int i = 2; i < A.length; i++) {
            int length2 = A[i-1] + A[i];
            if (length2<minLength2){
                minLength2 = length2;
                min2Index = i-1;
            }

            int length3 = length2 + A[i-2];
            if(length3 < minLength3){
                minLength3 = length3;
                min3Index = i-2;
            }
        }

        if(minLength2*3 == minLength3*2) return Math.min(min2Index, min3Index);
        else return minLength2*3 < minLength3*2 ? min2Index:min3Index;
    }
}