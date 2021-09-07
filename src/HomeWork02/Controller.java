/*
 * Java training course
 * Homework 02
 * Sergiy Dolnyy
 */

package HomeWork02;
import java.util.Scanner;

public class Controller {
    // The Constants

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        view.printLnMessage(view.ABOUT);
        view.printLnMessage(view.DOUBLE_BAR);
        view.printLnMessage(view.RULES);

        model.init();

        view.printLnMessage("Hint = "+String.valueOf(model.getValueToGuess()));

        view.printLnMessage(view.DOUBLE_BAR);
        view.printLnMessage(view.ATTEMPTS_COUNTER +String.valueOf(model.getCounter()));

        model.setValue(inputValue(sc));

//        view.printLnMessage(view.YOU_ENTERED+String.valueOf(model.getValue()));

        while (! model.isSolved()){
            view.printLnMessage(view.TRY_AGAIN);
            view.printLnMessage(view.DOUBLE_BAR);
            view.printLnMessage(view.ATTEMPTS_COUNTER +String.valueOf(model.getCounter()));

            model.setValue(inputValue(sc));

//            view.printLnMessage(view.YOU_ENTERED+String.valueOf(model.getValue()));
        }
        view.printLnMessage(view.DOUBLE_BAR);
        view.printLnMessage(view.WELL_DONE);
        view.printLnMessage(view.ATTEMPTS_TOTAL +String.valueOf(model.getCounter()));
    }

    // The Utility methods
    public int inputValue(Scanner sc){
        view.printLnMessage(view.RANGE+model.getValueMin()+".."+model.getValueMax());
        view.printMessage(view.ENTER_NUMBER);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.ENTER_NUMBER_ERROR + View.ENTER_NUMBER);
            sc.next();
        }
        return sc.nextInt();
    }
}
