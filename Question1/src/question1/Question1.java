package question1;

public class Question1 {

    public static void main(String[] args) {
        double[][] prices = {{10500, 8500},
        {9500, 7200},
        {12000, 8000}};
        String[] brands = {"CANON", "SONY", "NIKON"};

        System.out.println("""
                               -------------------------------------------------
                               CAMERA TECHNOLOGY REPORT
                               -------------------------------------------------               
                                                MIRRORLESS              DSLR""");

        double dslrPrice;
        double mirrorlessPrice;

        for (int j = 0; j < prices.length; j++) {
            mirrorlessPrice = prices[j][0];
            dslrPrice = prices[j][1];

            System.out.println(brands[j] + "\t\t R " + mirrorlessPrice + "\t\t R " + dslrPrice);

        }

        double maxDifference = 0;
        int index = -1;

        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                System.out.println("""
                                   ------------------------------------------------
                                   CAMERA TECHNOLOGY RESULTS
                                   ------------------------------------------------
                                   """);
            }

            mirrorlessPrice = prices[i][0];
            dslrPrice = prices[i][1];
            double difference = mirrorlessPrice - dslrPrice;

            System.out.print(brands[i] + "\tR " + difference);
            if (difference >= 2500) {
                System.out.print(" ***");
            }
            System.out.println("");
            
            if (difference > maxDifference) {
                maxDifference = difference;
                index = i;

            }

        }

        System.out.println("\nCAMERA WITH THE MOST COST DIFFERENCE: " + brands[index]);

    }

}

//Java Programming, Ninth Edition. In: Java Programming, Ninth Edition.
// Farrell, J., 2012.
// pp 1 - 470

//https://www.youtube.com/watch?v=alwukGslBG8
//Java 2D arrays 🚚
//Bro Code

