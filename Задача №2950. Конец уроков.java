import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int m = n - 1;
        int breakMinutes = 10 * m - 5 * (m % 2);
        int totalMinutes = 540 + 45 * n + breakMinutes;
        
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        
        System.out.println(hours + " " + minutes);
    }
}
