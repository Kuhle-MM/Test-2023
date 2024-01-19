package question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current estate agent name: ");
        String agentName = scan.nextLine();
        System.out.print("Enter the property price: ");
        double propertyPrice = scan.nextDouble();

        EstateAgentSales eas = new EstateAgentSales(agentName, propertyPrice);
        
        eas.printPropertyReport();
    }

}

//Java Programming, Ninth Edition. In: Java Programming, Ninth Edition.
// Farrell, J., 2012.
// pp 1 - 553

//https://www.youtube.com/watch?v=Zs342ePFvRI
//Java inheritence👪
//Bro Code
