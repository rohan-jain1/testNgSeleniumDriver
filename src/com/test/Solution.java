package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

	
	@Test
    public void result(int n) {
    // Write your code here
    
        boolean fizz = false;;
        boolean buzz = false;
        
        for(int i = 0; i<n; i++) {
            
            if(i%3==0) {
                fizz= true;
            }
            if(i%5 == 0) {
                buzz=true;
            }
            
            if(fizz) {
                System.out.println("fizz");
            }
            if(buzz) {
                System.out.println("buzz");
            }
            if(!fizz && !buzz){
            	System.out.println(i);
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
