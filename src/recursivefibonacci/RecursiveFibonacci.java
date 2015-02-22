
package recursivefibonacci;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class RecursiveFibonacci {

    public int fib(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else 
            return fib(n-1) + fib(n-2);
    }
 
    public static void main(String[] args) {
      
        
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Kacinci fibonacci sayisi");
        sayi = input.nextInt();
       
        long startTime = System.nanoTime();
              
        RecursiveFibonacci rf = new RecursiveFibonacci();
        System.out.println(rf.fib(sayi));
        
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime ;
        System.out.println("süre : " + TimeUnit.SECONDS.toSeconds(totalTime)+" nanosaniye");
       
        
    }
    
}
