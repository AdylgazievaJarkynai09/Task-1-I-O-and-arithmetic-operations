import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;
        
        int sum = hundreds + tens + units;
        
        System.out.println(sum);
    }
}
