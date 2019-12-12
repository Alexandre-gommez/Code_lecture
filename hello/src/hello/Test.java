package hello;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")

///Class for the graphic
public class Test extends JFrame
{
    /// dessin graphique

    public static void main (String[] args)
    {
    	    JFrame fenetre = new JFrame();
    	    JPanel pan=new JPanel();
    	    Button button1 = new Button ("Close");
    	    fenetre.setTitle("CPU graph tamp");
    	    fenetre.setSize(800, 800);
    	    fenetre.setLocationRelativeTo(null);
    	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	    
    	    pan.setBackground(Color.ORANGE);
    	    pan.add(button1);
    	    fenetre.setContentPane(pan);
    	    
    	    fenetre.setVisible(true);
    	    
        int i=1;
        while(i!=0)
        {
            Data TempData=null;

            if(args.length==1)
            {
                Client theApp = new Client(args[0]);
                TempData= new Data(theApp.getDate());
                System.out.println(TempData.h+":"+TempData.min+":"+TempData.s);
                System.out.println(TempData.temp);
            }
            else
            {
            	System.out.println("a");
            }
            i++;
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
    
}