/**
 * Created by Yuliang on 02/08/17.
 */

/***
 * A method with time O(n)
 */
public class binaryGap {
    public static void main(String[] args) {
        int n = 9;
//        String binary = Integer.toBinaryString(n);

        int max = 0;
        int count = -1;
        int r = 0;

        while(n>0){
            r = n & 1; // get the last digit of binary expression of n
//            System.out.println("r: "+r);
            n = n>>1; // move n one digit right for binary expression
//            System.out.println("n: "+n);

            // when the digit is 0, we should increment count
            if(r==0 && count>=0){
                count += 1;
//                System.out.println("count: "+count);
            }

            // when the digit is 1, we should stop this count and reset; Plus, always keep the max to be the max count
            if(r==1){
                max = count>max ? count:max;
                count = 0;
            }
        }

        System.out.println(max);
    }
}

