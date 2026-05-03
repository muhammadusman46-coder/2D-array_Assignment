import java.io.File;
import java.util.Scanner;

public class Salescalculation_productwise {
    public static void main(String[] args) {

        double Atotal = 0.0;
        double Btotal = 0.0;
        double Ctotal = 0.0;
        double Dtotal = 0.0;

        try {
            File file = new File("C:\\Users\\User\\Documents\\Downloads\\SalesEVESession.txt");
            Scanner input = new Scanner(file);

            // reading heading
            String heading = input.nextLine();
            String[] headingdata = heading.split("\t");
            System.out.println(headingdata[1] + " " + headingdata[2] + " " + headingdata[3]);

            String searchproductA = "Product A";
            String searchproductB = "Product B";
            String searchproductC = "Product C";
            String searchproductD = "Product D";

            // read first data line
            String line = input.nextLine();

            while (line.length() > 0) {
                String[] linedata = line.split("\t");

                int unit = Integer.parseInt(linedata[2]);
                int qty = Integer.parseInt(linedata[3]);

                if (linedata[1].equals(searchproductA)) {
                    Atotal = Atotal + (unit * qty);
                }

                if (linedata[1].equals(searchproductB)) {
                    Btotal = Btotal + (unit * qty);
                }

                if (linedata[1].equals(searchproductC)) {
                    Ctotal = Ctotal + (unit * qty);
                }

                if (linedata[1].equals(searchproductD)) {
                    Dtotal = Dtotal + (unit * qty);
                }
                line = input.nextLine();
            }

            input.close();

        } catch (Exception e) {
            System.out.println("-------");
        }

        System.out.println("Product A total is " + Atotal);
        System.out.println("Product B total is " + Btotal);
        System.out.println("Product C total is " + Ctotal);
        System.out.println("Product D total is " + Dtotal);
    }
}