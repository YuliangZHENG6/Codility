import java.util.*;

/**
 * Created by Yuliang on 02/08/17.
 */
public class oldOccurrencesInArray {
    public static void main(String[] args){
        int[] A = new int[]{9,3,9,3,9,7,9};

        SolutionOdd sol = new SolutionOdd();
        int result = sol.solution(A);
        System.out.println(result);
    }
}

class SolutionOdd {
    public int solution(int[] A) {

        Map<Integer,Integer> matchMap = new HashMap<Integer,Integer>();
        int unPaired = 0;

        for(int i=0;i<A.length;i++){
            int value = matchMap.get(A[i])==null?0:matchMap.get(A[i]);
            matchMap.put(A[i],value+1);
        }

        for(Map.Entry<Integer, Integer> entry : matchMap.entrySet()){
            if(entry.getValue() % 2 > 0){
                unPaired = entry.getKey();
            }
        }
        return unPaired;
    }
}

