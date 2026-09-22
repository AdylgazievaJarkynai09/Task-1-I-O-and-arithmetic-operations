import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int N = 2000;
        
        int d = a - b;
        int r = ((d % N) + N) % N;
        int ind = r / 1000;
        
        int max = a * (1 - ind) + b * ind;
        
        System.out.println(max);
    }
}
