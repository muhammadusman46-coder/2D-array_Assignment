import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Salescalculation_Employeeidwise_usinghashmap {

    public static void main(String[] args) {

        HashMap<String, Double> hm = new HashMap<>();

        try {
            File file = new File("C:\\Users\\User\\Documents\\Downloads\\SalesEVESession.txt");
            Scanner input = new Scanner(file);

            // reading heading
            String heading = input.nextLine();
            System.out.println(heading);

            // read first data line
            String line = input.nextLine();

            while (line.length() > 0) {
                String[] linedata = line.split("\t");

                String Empid = linedata[5];

                int unit = Integer.parseInt(linedata[2]);
                int price = Integer.parseInt(linedata[3]);

                double total = unit * price;

                if (hm.containsKey(Empid)) {
                    double oldtotal = hm.get(Empid);
                    hm.put(Empid, oldtotal + total);
                } else {
                    hm.put(Empid, total);
                }
                line = input.nextLine();
            }

            input.close();

        } catch (Exception e) {
            System.out.println("---------------");
        } finally {
            for (Map.Entry<String, Double> entry : hm.entrySet()) {
                System.out.println(entry.getKey() + " total is " + entry.getValue());
            }
        }
    }
}