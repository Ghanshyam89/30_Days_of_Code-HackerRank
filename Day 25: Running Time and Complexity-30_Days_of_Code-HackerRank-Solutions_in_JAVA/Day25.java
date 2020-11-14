//Day 25: Running Time and Complexity

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        
        int i = 0;
        
        while( i < t) {
            int flag = 1;
            int num = scan.nextInt();
            
            if(num == 1)
            {
                flag = 0;
            }
            else if(num == 2)
            {
                flag = 1;
            }
            for(int j = 2; j <= Math.sqrt(num); ++j) {
                if(num%j == 0){
                    flag = 0;
                }
            }    
            if(flag == 1){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
            i++;
        }
    }
}
