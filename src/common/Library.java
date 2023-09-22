package common;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Library {

    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }

    public String getString(String mes) {
        System.out.print(mes + ": ");
        return sc.nextLine();
    }

    public int getInt(String promt) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number: ");
            }
        }
        return a;
    }
    
    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if ((a >=m) && (a<=n)) {
                    break;
                }
                System.out.printf("Please enter a numbe between %d and %d: \n",m,n);
            } catch (Exception e) {
                System.out.printf("Please enter a numbe between %d and %d: \n",m,n);
            }
        }
        return a;
    }

    public double getDouble(String promt) {
        double a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Double.parseDouble(s);
                if (a > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number: ");
            }
        }
        return a;
    }

    public String getYN(String prompt) {
        String temp;
        while (true) {
            System.out.print(prompt + ": ");
            String input = sc.nextLine();
            temp = input.trim().toLowerCase();
            if (temp.equalsIgnoreCase("Y") || temp.equalsIgnoreCase("N")) 
                break;
            System.out.println("Please enter a valid option (Y/N): ");
        }
        return temp;
    }
}