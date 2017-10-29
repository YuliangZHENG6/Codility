import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yuliang on 03/08/17.
 */
public class MaxCounters {
    public static void main(String[] args){
        int[] A = new int[]{1,1,1,3};//{3,4,4,6,1,4,4} ;
        int N = 2;

        SolutionMaxC sol = new SolutionMaxC();
        int[] result = sol.solution(N, A);
        for(int i: result){
            System.out.println(i);
        }
    }
}

class SolutionMaxC {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];

        int max = 0;
        for(int i: A){
            if(i<=N){
                result[i-1] += 1;
                max = max>result[i-1] ? max:result[i-1];
//                System.out.println("max: " + max);
            }else if(i == N+1){
                Arrays.fill(result, max);
            }
        }
        return result;
    }
}

class Solution2 {
    public int[] solution(int N, int[] A) {
        int counter[] = new int[N];
        int n = A.length;
        int max=-1,current_min=0;

        for(int i=0;i<n;i++){
            if(A[i]>=1 && A[i]<= N){
                if(counter[A[i] - 1] < current_min) counter[A[i] - 1] = current_min;
                counter[A[i] - 1] = counter[A[i] - 1] + 1;
                if(counter[A[i] - 1] > max) max = counter[A[i] - 1];
            }
            else if(A[i] == N+1){
                current_min = max;
            }
        }
        for(int i=0;i<N;i++){
            if(counter[i] < current_min) counter[i] =  current_min;
        }
        return counter;
    }
}
