import java.io.File;
import java.util.Scanner;

public class Salescalculation_EmployeeIdwise {
    public static void main(String[] args) {

        double E011total = 0.0;
        double E012total = 0.0;
        double E013total = 0.0;
        double E014total = 0.0;

        try {
            File file = new File("C:\\Users\\User\\Documents\\Downloads\\SalesEVESession.txt");
            Scanner input = new Scanner(file);

            // reading heading
            String heading = input.nextLine();
            String[] headingdata = heading.split("\t");
            System.out.println(headingdata[5] + " " + headingdata[2] + " " + headingdata[3]);

            String E011 = "E011";
            String E012 = "E012";
            String E013 = "E013";
            String E014 = "E014";

            String line = input.nextLine();

            while (line.length() > 0) {
                String[] linedata = line.split("\t");

                int unit = Integer.parseInt(linedata[2]);
                int qty = Integer.parseInt(linedata[3]);

                if (linedata[5].equals(E011)) {
                    E011total = E011total + (unit * qty);
                }

                if (linedata[5].equals(E012)) {
                    E012total = E012total + (unit * qty);
                }

                if (linedata[5].equals(E013)) {
                    E013total = E013total + (unit * qty);
                }

                if (linedata[5].equals(E014)) {
                    E014total = E014total + (unit * qty);
                }

                line = input.nextLine();
            }

            input.close();

        } catch (Exception e) {
            System.out.println("---------");
        }

        System.out.println("E011 total is " + E011total);
        System.out.println("E012 total is " + E012total);
        System.out.println("E013 total is " + E013total);
        System.out.println("E014 total is " + E014total);
    }
}