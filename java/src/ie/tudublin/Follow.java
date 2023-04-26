package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;

public class Follow extends PApplet
{
    //field for the word (a String) and the count (an int)
    private String word;
    private int count;
    
    @Override
    public String toString() {
        return "Follow [word=" + word + ", count=" + count + "]";
    }
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

}
