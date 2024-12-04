import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        System.out.print("Enter a number to check if it's prime: ");
        int number = scan.nextInt();        
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
	}
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
