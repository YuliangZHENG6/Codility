import java.util.*;

/**
 * Created by Yuliang on 03/08/17.
 */
public class MissingInteger {
    public static void main(String[] args){
        int[] A = new int[]{99,100,102, 103, 104, 105} ;

        SolutionMissing sol = new SolutionMissing();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionMissing {
//    public int solution(int[] A) {
//        // write your code in Java SE 8
//        int missing = 0;
//
//        // single element
//        if(A.length == 1){
//            missing = A[0]+1;
//        }else{
//
//            // find the min and max of A:
//            int min = Integer.MAX_VALUE;
//            int max = Integer.MIN_VALUE;
//            for(int i: A){
//                min = min<i ? min:i;
//                max = max>i ? max:i;
//            }
//
//            if(max<=0){
//                missing = 1;
//            }else{
//
//                // count A
//                int[] count = new int[max];
//                for(int i: A){
//                    if(i>0){
//                        count[i-1] += 1;
//                    }
//                }
//
//                // find the missing
//                int start = -1;
//                if(min<=0){
//                    start = 0;
//                }else{
//                    start = min -1;
//                }
//
//                int num = 0;
//                for(int i = start; i < count.length; i++){
//                    if(count[i] == 0){
//                        missing = i+1;
//                        break;
//                    }
//                    num += 1;
//                }
//                if(num == count.length){
//                    missing = max+1;
//                }
//
//            }
//
//        }
//
//        return missing;
//    }

    public int solution(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<Integer>();

        for (int i = 0 ; i < A.length; i++) {
            hset.add(A[i]);

            while (hset.contains(num)) {
                num++;
            }
        }

        return num;
    }
}
