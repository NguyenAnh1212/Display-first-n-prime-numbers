import java.util.Scanner;

public class DisplayFirstNumber {
    public static void main(String[] args) {
        System.out.println("Display first n prime numbers");
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        int i = 0;
        while (x>0){
            x++;
            if(isPrimeNumber(x)){
                System.out.println(" "+x);
                        i++;
            }
            if(i == n){
                break;
            }
        }
    }

    private static boolean isPrimeNumber(int x) {
        if(x<2){
            return false;
        }
        else {
            for (int j = 2; j <= Math.sqrt(x); j++) {
                if(x%j == 0){
                    return false;
                }
            }
        }return true;
    }
}
