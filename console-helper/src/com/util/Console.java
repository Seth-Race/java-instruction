package com.util;
import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }
    
    public static String getLine(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();  // read user entry
        //sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static String getString(String prompt, boolean isRequired) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (isRequired && s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
    public static String getString(String prompt, String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getString(prompt, true);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" +
                        s2 + "'. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
    
    
    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be greater than, or equal to " + min + ".");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be less than, or equal to " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }

    /**
     * Prompt the user for y/n response and convert to a boolean
     * @param prompt Yes or no response
     * @return boolean
     */
    public static boolean getBoolean(String prompt) {
    	String resp = getString(prompt, "y", "n");
    	return resp.equalsIgnoreCase("y") ? true : false;    	
    }

    
    public static void println(String words) {
    	System.out.println(words);
    }

}