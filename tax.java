import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();

        double totalTax;

        if (amount > 250000 && amount <= 500000) {
            totalTax = 0.05 * amount; // 5% tax
            System.out.println("The total tax is: " + totalTax);
        } else if (amount > 500000 && amount <= 1000000) {
            totalTax = 0.20 * amount; // 20% tax
            System.out.println("The total tax is: " + totalTax);
        } else if (amount > 1000000) {
            totalTax = 0.30 * amount; // 30% tax
            System.out.println("The total tax is: " + totalTax);
        } else {
            System.out.println("No tax applicable.");
        }
    }
}

    

