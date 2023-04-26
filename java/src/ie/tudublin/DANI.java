package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class DANI extends PApplet {

	String[] s;
	String[] w;


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
		s = loadStrings("small.txt");

		for(int i = 0 ; i < s.length ; i ++)
		{
			//split the string into an array of words
			w = s[i].split(s[i], ' ');	
		}

		for(int i = 0 ; i < w.length ; i ++)
		{
			//remove punctuation characters
			w[i] = w[i].replaceAll("[^\\w\\s]","");
		}

		for(int i = 0 ; i < w.length ; i ++)
		{
			//convert to lower case
			w[i] = w[i].toLowerCase();
		}

		for(int i = 0 ; i < w.length ; i ++)
		{
			//print the contents of the file
			System.out.println(w[i]);
		}
		
	}
}
