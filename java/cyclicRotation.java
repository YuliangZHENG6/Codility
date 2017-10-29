/**
 * Created by Yuliang on 02/08/17.
 */
public class cyclicRotation {
    public static void main(String[] args){
        int[] A = new int[]{3, 8, 9, 7, 6};//{1,2,3,4,5};
        int K = 3;

//        System.out.println("AAAAAA");
//        for (int i: A){
//            System.out.println(i);
//        }

        Solution sol = new Solution();
        int[] B = sol.solution(A, K);

//        System.out.println("BBBBBB");
//        for (int i: B){
//            System.out.println(i);
//        }
    }
}

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        while (K > 0) {
            int[] B = new int[A.length];
            for (int i = 0; i < A.length; i++){
                if(i==A.length-1){
                    B[0] = A[i];
                }else{
                    B[i+1] = A[i];
                }
            }
            System.out.println("AAAAAA before");
            for (int i: A){
                System.out.println(i);
            }
            A = B;
            System.out.println("AAAAAA after");
            for (int i: A){
                System.out.println(i);
            }
            System.out.println("BBBBBB changed");
                for (int i: B){
                System.out.println(i);
            }
            K = K - 1;
            System.out.println("K is " + K);
        }
        return A;
    }
}
