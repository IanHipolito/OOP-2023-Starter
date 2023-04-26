package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;

public class Word extends PApplet{

    //field for the word (a String) and an ArrayList of type Follow as fields
    private String word;
    private ArrayList<Follow> follows = new ArrayList<Follow>();

    @Override
    public String toString() {
        return "Word [word=" + word + ", follows=" + follows + "]";
    }
    public Word(String word, ArrayList<Follow> follows) {
        this.word = word;
        this.follows = follows;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public ArrayList<Follow> getFollows() {
        return follows;
    }
    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }


}
