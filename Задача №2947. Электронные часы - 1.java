import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int totalMinutes = n % 1440;
        
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        
        System.out.println(hours + " " + minutes);
    }
}
