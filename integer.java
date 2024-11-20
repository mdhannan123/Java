import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        if(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println("the number is integer");
        }
        else{
            System.out.println("the number is not integer");
        }
        

        
    }
    
}
