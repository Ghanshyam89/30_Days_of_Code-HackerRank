//Day 11: 2D Arrays

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxsum=-64, hoursum;   

        for(int i=0;i<4;i++) {
            
            for(int j=0;j<4;j++) {
                
                hoursum=arr[i+1][j+1];    
                
                for(int k=0;k<3;k++) {                   
                    hoursum = hoursum + arr[i][j+k] + arr[i+2][j+k]; 
                }             
                
                if(hoursum > maxsum)         
                maxsum = hoursum;       
            }      
        }     
        
        System.out.println(maxsum);

        scanner.close();
    }
}
