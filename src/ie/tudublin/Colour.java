package ie.tudublin;

import processing.core.PApplet;
import processing.data.*;

public class Colour extends PApplet {

    public void colour(){
        
    }

    public int r;
    public int g;
    public int b;
    public int value;
    private String colour;

    public void getColour(String newColor){
        this.colour= newColor;
    }

    public String toString(){

        return "a";
    }
    
    Table color;

    public void setup() {
      
      color = loadTable("colours.csv", "header");
    
      println(color.getRowCount() + " total rows in table"); 
    
      for (TableRow row : color.rows()) {
        
        String colour = row.getString("colour");
        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        value = row.getInt("value");
        
        println(r+g+b + value + "is" + colour);
      }
      
    }
}
