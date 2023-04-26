package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<String> words = new ArrayList<String>();

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
		// for (String word : words) {
		// 	System.out.println(word); // Print each word in the list
		// }
		printModel();
       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	
    public void loadFile() {
		String[] lines = loadStrings("small.txt");
		for (String l : lines) {
			String[] words = split(l, ' ');
			for (String w : words) 
			{
				w = w.replaceAll("[^\\w\\s]","");
				w = w.toLowerCase();
				this.words.add(w);
			}
		}

    }

    public boolean findWord(String str) {
		for (String w : words) {
			if (w.equals(str)) {
				return true;
			}
		}
       return false;
    }

	public void printModel(){
    	System.out.println("Word Count: " + words.size());
	}

}


