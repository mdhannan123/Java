import java.util.Scanner;
public class swi{
    public static void main(String[] args){
       
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ur age");
        int age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("u r eligible to vote");
                break;
            
            case 50:
                System.out.println("its time to retire");
                break;
            
            default:
                System.out.println("you had a great life");
            
        }



    }
    
}
