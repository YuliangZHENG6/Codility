/**
 * Created by Yuliang on 21/08/17.
 */
public class NumberOfDiscIntersections {
    public static void main(String[] args){
        int[] A = new int[]{1, 5, 2, 1, 4, 0};
        NumSolution sol = new NumSolution();
        int result = sol.solution(A);
        System.out.println(result);
    }

}

class NumSolution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[][] discs = new int[A.length][2];

        // save the discs size info
        for(int i = 0; i < A.length; i++){
            int lowerBound = i - A[i];
            int uppperBound = i + A[i];
            discs[i][0] = lowerBound;
            discs[i][1] = uppperBound;
        }

        // count the intersections
        // keypoint: if one disc's upperBound is bigger than another's lowerBound => there must exist one intersection
        int countPairs = 0;
        for(int i = 0; i < A.length - 1; i++){
            for(int j = i+1; j < A.length; j++){
                if(discs[i][1] >= discs[j][1]) countPairs++;
            }
        }
        return countPairs;
    }
}


//class Solution {
//    public int solution(int[] A) {
//        // write your code in Java SE 8
//
//        int[][] disc = new int[A.length][2];
//
//        for(int i=0; i<A.length; i++) {
//            int downBound = i-A[i];
//            int upBound = i+A[i];
//
//            disc[i][0] = downBound;
//            disc[i][1] = upBound;
//
//            // System.out.println(Arrays.toString(disc[i]));
//        }
//
//        int pairCounter = 0;
//        for(int i= 0; i<A.length-1; i++) {
//
//            for(int j=i+1; j< A.length; j++) {
//                if(disc[i][1] >= disc[j][0]) {
//                    pairCounter++;
//                }
//                else {
//                    //break;
//                }
//            }
//        }
//
//        return pairCounter;
//    }
//}


class SolutionBest {
    public int solution(int[] A) {
        int[] a = A;
        int result = 0;
        int[] dps = new int[a.length];
        int[] dpe = new int[a.length];

        for (int i = 0, t = a.length - 1; i < a.length; i++)
        {
            int s = i > a[i]? i - a[i]: 0;
            int e = t - i > a[i]? i + a[i]: t;
            dps[s]++;
            dpe[e]++;
        }

        int t = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (dps[i] > 0)
            {
                result += t * dps[i];
                result += dps[i] * (dps[i] - 1) / 2;
                if (10000000 < result) return -1;
                t += dps[i];
            }
            t -= dpe[i];
        }

        return result;
    }
}