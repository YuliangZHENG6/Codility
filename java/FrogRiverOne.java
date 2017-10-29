import java.util.HashSet;

/**
 * Created by Yuliang on 03/08/17.
 */
public class FrogRiverOne {
    public static void main(String[] args){
        int[] A = new int[]{1,3,1,4,2,3,5,4} ;
        int X = 5;

        SolutionFrogR sol = new SolutionFrogR();
        int result = sol.solution(X, A);
        System.out.println(result);
    }
}

class SolutionFrogR {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int result = -1;
        HashSet<Integer> hset = new HashSet<Integer>();

        for(int i = 0; i < A.length; i++){
            if(A[i] <= X){
                hset.add(A[i]);
//                System.out.println("i:"+i+", hset size:"+hset.size());
            }
            if(hset.size()==X){
//                System.out.println("result:"+i);
                result = i;
                break;
            }
        }
        return result;
    }
}
