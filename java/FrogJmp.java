/**
 * Created by Yuliang on 03/08/17.
 */
import java.util.*;

public class FrogJmp {
    public static void main(String[] args){
        int X = 10;
        int Y = 85;
        int D = 40;

        SolutionFrog sol = new SolutionFrog();
        int result = sol.solution(X, Y, D);
        System.out.println(result);
    }
}

class SolutionFrog{
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int remainder = (Y-X)%D;
        if(remainder!=0){
            return (Y-X)/D +1;
        }else {
            return (Y-X)/D;
        }

    }
}


