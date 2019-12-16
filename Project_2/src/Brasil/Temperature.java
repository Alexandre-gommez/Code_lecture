package Brasil;

//import java.awt.Color;
//import java.io.*;

//import java.awt.Canvas;
import java.awt.*;

@SuppressWarnings("serial")

public class Temperature extends Canvas{

	 int width, height;

	 
   /*
   public CustomCanvas(int width, int height){
           this.setSize(width,height);
           this.width = width;
           this.height = height;
           this.update();
   }*/
   
   public void update() { this.repaint(); }
	
	
  public static void main(String args[]) 
  {

  	int condition =0;
  	while (condition!=10)
  	{
  		
  		if(args.length==1)
      	{
      		Client theApp = new Client(args[0]);
  		    theApp.getDate();
  		}
      	else
      	{
      		System.out.println("Error: you must provide the address of the server");
      		System.out.println("Usage is:  java Client x.x.x.x  (e.g. java Client 192.168.7.2)");
      		System.out.println("      or:  java Client hostname (e.g. java Client localhost)");
      	}
  		condition++;
  	}
  	    
  	System.out.println("**. End of Application.");
  }
  
  public void paint(Graphics g, int X, int Y)		///
  {
		//X->time
  	//Y->temperature
		Color Color1 = new Color(0,6, 255); //blue
      g.setColor(Color1);
      g.drawOval(X,Y, 10, 10);
     
      //pour avoir couleur random : (float)Math.random()
      
      
      
    ///DRAWING 
 	 //The abscissa represent the time and the ordinate represent the temperature at this moment
 	 /*Graphics G;
 	 Color Color2 = new Color(255,0, 0); //red
   G.setColor(Color2);
 	 G.drawLine(0, Tmin, actual_time, Tmin);	//line representing the minimum temperature
 	 G.drawLine(0, Tmax, actual_time, Tmax);	//line representing the maximum temperature
 	 actual_time++;	//incrementing of the time
 	 */
 	 

  }

  
}
  
     
  
 
