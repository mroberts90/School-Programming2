package SchoolProgramming2;

import java.util.Scanner;

public class InputFromUser {
    public static int inputFromUserInt(String s) throws NullPointerException
    {
        Integer inputFromUser = null; 
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println(s);
            inputFromUser = scan.nextInt();
            scan.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return inputFromUser;
    }

    public static String inputFromUserAsString(String s)
    {
        String inputFromUser = null;
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println(s);
            inputFromUser = scan.nextLine();
            scan.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return inputFromUser;
    }
}
