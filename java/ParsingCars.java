/**
 * Created by Yuliang on 04/08/17.
 */
public class ParsingCars {
    public static void main(String[] args){
        int[] A = new int[]{0,1,0,1,1};//{3,4,4,6,1,4,4} ;
        int N = 2;

        SolutionParsingC sol = new SolutionParsingC();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionParsingC {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int one = 0;

        // more like an application of suffix sum
        for(int i = A.length-1; i >= 0; i--){
            // create the one counter.
            if(A[i] == 1){
                one++;
            }
            // count the opposites
            if(i != A.length-1){
                if(A[i] == 0){
                    result += one;
                }
            }
//            System.out.println("at " + i+", zero:" + zero+", one:"+one+", result = " + result);
        }
        if(result > 1000000000){
            result = -1;
        }
        return result;
    }
}

class SolutionParsing1{
    public int solution(int[] A) {
        int countOfZeros = 0, count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) countOfZeros++;
            if (A[i] == 1) count += countOfZeros;
            if (count > 1000000000) return -1;
        }
        return count;
    }
}
