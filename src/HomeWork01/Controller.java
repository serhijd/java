/*
 * Homework 01
 * Sergiy Dolnyy
 * MVC pattern
 * Model must receive validated and correct data
 */

package HomeWork01;

import java.util.Scanner;

public class Controller {
    // The Constants
    public static final String W1_HELLO= "Hello";
    public static final String W2_WORLD= "World";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        view.printLnMessage(view.ABOUT);
        view.printLnMessage(view.DOUBLE_BAR);

        Scanner sc = new Scanner(System.in);

        //model.setWord1(inputWord1WithScanner(sc));
        //model.setWord2(inputWord2WithScanner(sc));

        do {
            model.setWord1(inputWordWithScanner(sc,view.INPUT_HELLO));
            if (! model.isWordValid(model.getWord1(),W1_HELLO)) {
                view.printLnMessage(View.WRONG_INPUT_HELLO);
            }
        } while (! model.isWordValid(model.getWord1(),W1_HELLO));

        do {
            model.setWord2(inputWordWithScanner(sc,view.INPUT_WORLD));
            if (! model.isWordValid(model.getWord2(), W2_WORLD)) {
                view.printLnMessage(View.WRONG_INPUT_WORLD);
            }
        } while(! model.isWordValid(model.getWord2(),W2_WORLD));

//        model.setWord1(inputWordWithScanner(sc,view.INPUT_HELLO));
//        while (! model.isWord1Valid(W1_HELLO)){
//            view.printLnMessage(View.WRONG_INPUT_HELLO);
//            model.setWord1(inputWordWithScanner(sc,view.INPUT_HELLO));
//        }
//        model.setWord2(inputWordWithScanner(sc, view.INPUT_WORLD));
//        while (! model.isWord2Valid(W2_WORLD)) {
//            view.printLnMessage(View.WRONG_INPUT_WORLD);
//            model.setWord2(inputWordWithScanner(sc, view.INPUT_WORLD));
//        }

        view.printLnMessage(view.DOUBLE_BAR);
        view.printLnMessage(view.WELL_DONE);
//        view.printLnMessage(view.DOUBLE_BAR);

        model.setPhrase(model.getWord1(), model.getWord2());
        view.printLnMessage(model.getPhrase());

//        view.printLnMessage(view.DOUBLE_BAR);
    }

    // The Utility methods
    public String inputWordWithScanner(Scanner sc, String message){
        view.printMessage(message);
        while (! sc.hasNext()){
            sc.next();
        }
        return sc.next();
    }
//    public String inputWord1WithScanner(Scanner sc){
//        view.printMessage(View.INPUT_HELLO);
//        while (! sc.hasNext(W1_HELLO)){
//            view.printMessage(View.WRONG_INPUT_HELLO +View.INPUT_HELLO);
//            sc.next();
//        }
//        return sc.next();
//    }
//
//    public String inputWord2WithScanner(Scanner sc){
//        view.printMessage(View.INPUT_WORLD);
//        while (! sc.hasNext(W2_WORLD)) {
//            view.printMessage(View.WRONG_INPUT_WORLD +View.INPUT_WORLD);
//            sc.next();
//        }
//        return sc.next();
//    }
}
