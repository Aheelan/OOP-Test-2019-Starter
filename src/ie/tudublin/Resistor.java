package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.*;

public class Resistor extends PApplet {

    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public void resistor(int value){
        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
    }

    

    public void setup() {
        Table resistor;
        
		resistor = loadTable("resistors.csv", "header");
    
      println(resistor.getRowCount() + " total rows in table"); 
    
      for (TableRow row : resistor.rows()) {
        value = row.getInt("value");
        
        println(value);
}