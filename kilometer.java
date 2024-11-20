import java.util.Scanner;
public class kilometer{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter kilometer");
        float a= sc.nextFloat();
        double b= 0.621371;
        double total = a*b;
        System.out.println("the conversion of "+a+" is "+total);

        
    }
    
}
