import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 5 subject marks");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int sum= a+b+c+d+e;
        int total= 500;
        double g = (sum / (double) total) * 100;
        System.out.println("the percentage is "+ g);
        
    }


    
}
