package HomeWork01;
/**
 * Homework 01
 * Sergiy Dolnyy
 * MVC pattern
 * Model must receive validated and correct data
 */

public class Model {
    private String phrase="";
    private String word1="";
    private String word2="";

    // The Program logic
    public String getPhrase(){return phrase;}

    /**
     * in this method the "Hello World!" phrase is built
     * @param word1, word2
     * @return Concatenated string of parameters
     */
    public String setPhrase(String word1, String word2){
        return phrase = word1 + " " + word2 + "!";
    }

    public String getWord1(){return word1;}
    public String getWord2(){return word2;}
    public void setWord1(String word1){this.word1=word1;}
    public void setWord2(String word2){this.word2=word2;}

    public boolean isWordValid (String word, String reference){
        return word.equals(reference);
    }
//    public boolean isWord1Valid(String validWord){
//        return this.word1.equals(validWord);
//    }
//    public boolean isWordValid(String validWord){
//        return this.word2.equals(validWord);
//    }
}
