package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	ArrayList<Colour> color = new ArrayList<Colour>();

	public void loadColours(){

	}

	public void printColours(){

	}

	public void findColor(int value){ //color
		
	}

    public void setup() {
		
		ArrayList<Resistor> resistors = new ArrayList<Resistor>();
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}
	
	public void draw()
	{			
		rect(150,50,120,150);
		rect(150,200,120,150);
		rect(150,350,120,150);
		rect(150,500,120,150);
	}
}
