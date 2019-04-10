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
}