import javax.swing.*;
import java.util.Scanner;
import java.util.*;
import java.io.*;

/**
 * Created by icondor on 26/03/16.
 */
public class ex1 {

    /* utility methods for INPUT/OUTPUT using a GUI or Console, please leave them as they are */

    // GUI
    public static int readIntGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        int returnValue = Integer.parseInt(input);
        return returnValue;
    }

    public static double readDoubleGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        double returnValue = Double.parseDouble(input);
        return returnValue;
    }

    public static String readStringGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        return input;
    }

    public static void printGUI(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(int text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(double text) {
        JOptionPane.showMessageDialog(null, text);
    }

    // CONSOLE
    public static String readStringConsole(String label) {
        System.out.print(label);
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static int readIntConsole(String label) {
        System.out.print(label);
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static double readDoubleConsole(String label) {
        System.out.print(label);
        double input = new Scanner(System.in).nextDouble();
        return input;
    }

    public static void printConsole(String text) {
        System.out.println(text);
    }

    public static void printConsole(int text) {
        System.out.println(text);
    }

    public static void printConsole(double text) {
        System.out.println(text);
    }
    /* end of utility methods*/


    /* here starts the main class */
    public static void main(String[] arguments) {
        String userTrue="gmanu";
        String passTrue="hello";
        int i=0;
        boolean test=true;
        do {
            String user = readStringConsole("introduceti user:");
            String parola = readStringConsole("introduceti parola:");
            if(user.equals(userTrue) && parola.equals(passTrue)){
                pass(user,parola);
                test=false;
            }
            i++;


        }while(test&& i<3);
    }

    public static int pass(String u, String p ) {


            System.out.println("Lansare");
            Runtime rs = Runtime.getRuntime();

            try {
                rs.exec("notepad");
            }
            catch (IOException e) {
                System.out.println(e);
            }
        return 1;


    }
}
