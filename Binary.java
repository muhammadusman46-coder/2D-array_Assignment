import java.util.Arrays;
import java.util.Scanner;

public class Binary {

    // Part B: User-defined function that returns integer array of binary digits
    public static int[] toBinaryArray(int n) {
        if (n == 0) {
            return new int[] {0};
        }

        int[] binaryDigits = new int[32]; 
        int i = 0;
        int temp = n;


        while (temp > 0) {
            binaryDigits[i] = temp % 2;
            temp /= 2;
            i++;
        }
    
        int[] result = new int[i]; 
        for (int j = 0; j < i; j++) {
            result[j] = binaryDigits[i - 1 - j];
        }

        return result; 
    }

    // Part C: User-defined function that returns String of binary digits
    public static String toBinaryString(int n) {
        if (n == 0) {
            return "0";
        }

        String binary = "";
        int temp = n;
        while (temp > 0) {
            int remainder = temp % 2;
            binary = remainder + binary;
            temp /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to convert into binary: ");
        int n = sc.nextInt();

        // Part A
        int temp = n;
        String binaryStr = "";
        while (temp > 0) {
            int remainder = temp % 2;
            binaryStr = remainder + binaryStr;
            temp /= 2;
        }
        System.out.println("Part A - Binary = " + binaryStr);

        // Part B: using user-defined function 
        int[] binaryArray = toBinaryArray(n);
        System.out.println("Part B - Binary array = " + Arrays.toString(binaryArray));

        // Part C: using user-defined function that returns String
        String binaryStringFromFunction = toBinaryString(n);
        System.out.println("Part C - Binary string = " + binaryStringFromFunction);

        sc.close();
    }
}