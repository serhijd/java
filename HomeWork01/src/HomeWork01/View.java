/*
 * Homework 01
 * Sergiy Dolnyy
 * MVC pattern
 * Model must receive validated and correct data
 */

package HomeWork01;

public class View {
    // Text's constants
    public static final String INPUT_HELLO = "Enter \"Hello\"=> ";
    public static final String INPUT_WORLD = "Enter \"World\"=> ";
    public static final String WRONG_INPUT_HELLO = "Try again! Please type \"Hello\" without quotes.";
    public static final String WRONG_INPUT_WORLD = "Try again! Please type \"World\" without quotes.";
    public static final String WELL_DONE = "Well done!";
    public static final String DOUBLE_BAR = "==================================";
    public static final String ABOUT = "Homework 01 by S.Dolnyy";
    public void printMessage(String message){
        System.out.print(message);
    }
    public void printLnMessage(String message) {System.out.println(message); }
}
