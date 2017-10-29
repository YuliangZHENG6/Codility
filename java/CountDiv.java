/**
 * Created by Yuliang on 05/08/17.
 */
public class CountDiv {
    public static void main(String[] args){
        int A = 6;
        int B = 11;
        int K = 2;

        SolutionCountD sol = new SolutionCountD();
        int result = sol.solution(A, B, K);
        System.out.println(result);
    }
}

class SolutionCountD {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int num = 0;
        if(B/K <= 0) {
            if(A == 0){
                num++;
            }
        }else if(B/K == A/K) {
            if(B%K == 0 || A%K == 0){
                num = 1;
            }
        }else{
            num = B/K - A/K;
            if(A%K == 0 || B%K == 0){
                num++;
            }
        }
        return num;
    }
}

class SolutionCountD1{
    int solution(int A, int B, int K) {
        int b = B/K;
        int a = (A > 0 ? (A - 1)/K: 0);
        if(A == 0){
            b++;
        }
        return b - a;
    }
}