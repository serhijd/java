/*
 * Homework 01
 * Sergiy Dolnyy
 * MVC pattern
 * Model must receive validated and correct data
 */

package HomeWork01;

public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
