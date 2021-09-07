/*
 * Java training course
 * Homework 02
 * Sergiy Dolnyy
 */

package HomeWork02;

import java.util.Random;

public class Model {
    private int valueMin = 0;
    private int valueMax = 100;
    private int valueToGuess;
    private int counter;
    private int value;

    // The Program logic

    /**
     * This method sets new number by user entry
     * @param newValue to store user entry
     */
    public void setValue(int newValue){
        value=newValue;
    }

    /**
     * This method returns the entered by user number
     * @return user entered number
     */
    public int getValue() {
        return value;
    }

    /**
     * This method initialise the model with initial values
     */
    public void init(){
        Random r = new Random();
        valueToGuess = r.nextInt(valueMax-valueMin)+valueMin;
        counter = 1;
    }
    public int getValueToGuess(){
        return valueToGuess;
    }

    /**
     * This method solves the quiz.
     * It updates the iteration counter and Min Max ranges.
     * @return TRUE when quiz solved
     */
    public boolean isSolved(){
        if (value != valueToGuess){
            counter++;
            this.setValueMin();
            this.setValueMax();
        }
        return value == valueToGuess;
    }

    /**
     * @return Min range
     */
    public int getValueMin() {
        return valueMin;
    }

    /**
     * @return Max range
     */
    public int getValueMax() {
        return valueMax;
    }

    /**
     * This method updates if required the Min range.
     */
    public void setValueMin(){
        if (value < valueToGuess && value > valueMin ){
            valueMin = value;
        }
    }

    /**
     * This method updates if required the Max range.
     */
    public void setValueMax() {
        if (value > valueToGuess && value < valueMax){
            valueMax=value;
        }
    }

    /**
     * This method returns amount of iterations taken to guess the number
     * @return Amount of iterations
     */
    public int getCounter(){
        return counter;
    }

}