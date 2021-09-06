/*
 * Java training course
 * Homework 02
 * Sergiy Dolnyy
 */

package HomeWork02;

public class View {
    // Text's constants
    public static final String ABOUT = "Homework 02 by S.Dolnyy";
    public static final String RANGE = "Current range [Min...Max] = ";
    public static final String RULES = "Guess the number";
    public static final String ATTEMPTS_COUNTER = "Attempt = ";
    public static final String ATTEMPTS_TOTAL = "Attempts total = ";
    public static final String TRY_AGAIN = "You missed! Try again.";
    public static final String ENTER_NUMBER = "Enter your number => ";
    public static final String ENTER_NUMBER_ERROR = "Error! Number must be int. Try again. ";
    public static final String YOU_ENTERED = "You entered = ";
    public static final String WELL_DONE = "You nailed it! Well Done!";
    public static final String DOUBLE_BAR = "==================================";


    public void printMessage(String message){
        System.out.print(message);
    }
    public void printLnMessage(String message){ System.out.println(message); }
}
