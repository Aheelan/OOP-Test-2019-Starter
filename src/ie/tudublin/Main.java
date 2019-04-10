package ie.tudublin;

public class Main
{	
	
	public void helloProcessing()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new UI());
	}

	public void helloProcessing1()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new Colour());
	}

	public void helloProcessing2()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new Resistor());
	}
	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.helloProcessing();		
	}
}