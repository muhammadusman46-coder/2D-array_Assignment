import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Salescalculation_productwise_usinghashmap {
    public static void main(String[] args) {

        HashMap<String, Double> hm = new HashMap<>();

        try {
            File file = new File("C:\\Users\\User\\Documents\\Downloads\\SalesEVESession.txt");
            Scanner input = new Scanner(file);

            // reading heading
            String heading = input.nextLine();
            String[] headingdata = heading.split("\t");
            System.out.println(headingdata[1] + " " + headingdata[2] + " " + headingdata[3]);

            String productname;

            // read first data line
            String line = input.nextLine();

            while (line.length() > 0) {
                String[] linedata = line.split("\t");

                productname = linedata[1];

                int unit = Integer.parseInt(linedata[2]);
                int price = Integer.parseInt(linedata[3]);

                double total = unit * price;

                if (hm.containsKey(productname)) {
                    double oldtotal = hm.get(productname);
                    hm.put(productname, total + oldtotal);
                } else {
                    hm.put(productname, total);
                }

                line = input.nextLine();
            }

        } catch (Exception e) {
            System.out.println("---------------");
        } finally {
            for (Map.Entry<String, Double> entry : hm.entrySet()) {
                System.out.println(entry.getKey() + " total is " + entry.getValue());
            }
        }
    }
}