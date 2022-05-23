package LEC7;
import java.util.Scanner;
public class primetwon {
    public static boolean isPrime(int n) {
		int d = 2;
		while (d < n) {
			if (n % d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}

    public static void printPrimes(int n) {
        for(int i = 2; i<=n; i++){
            boolean isIprime = isPrime(i);
            if(isIprime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(100);
    }
}
