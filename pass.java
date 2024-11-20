import java.util.Scanner;
public class pass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of ur 3 sujects");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int total= a+b+c;
        if(total>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("you are pass");
        }
        else{
            System.out.println(" better luck next time");
        }

        
    }
    
}
