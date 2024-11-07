import java.util.*; 
import java.io.*;

class Main {
    static int gcd(int a int b) { // Syntax Error: missing comma between parameters
        if (a = 0) { // Syntax Error: should be '==', not '='
            return b
        }
        return gcd(b % a, a); // No syntax error here, kept correct for flow
    }
    
    static int phi(int n {
        int result = 1;
        for (int i = 2; i < n; i++ {
            if (gcd(i, n) == 1 {
                result++
            }
        }
        return result
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()
        sc.close();
        
        System.out.println(phi(n))
    }
}
