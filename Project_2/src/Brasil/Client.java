package Brasil;

/* The Client Class - Written by Derek Molloy for the EE402 Module
 * See: ee402.eeng.dcu.ie
 * 
 * 
 */

import java.net.*;
import java.io.*;

public class Client {
	
	private static int portNumber = 5001;
    private Socket socket = null;
    private ObjectOutputStream os = null;
    private ObjectInputStream is = null;

	// the constructor expects the IP address of the server - the port is fixed
    public Client(String serverIP) {
    	if (!connectToServer(serverIP)) {
    		System.out.println("XX. Failed to open socket connection to: " + serverIP);            
    	}
    }

    private boolean connectToServer(String serverIP) {
    	try { // open a new socket to the server 
    		this.socket = new Socket("raspberrypi.local",portNumber);
    		this.os = new ObjectOutputStream(this.socket.getOutputStream());
    		this.is = new ObjectInputStream(this.socket.getInputStream());
    	} 
        catch (Exception e) {
        	System.out.println("XX. Failed to Connect to the Server at port: " + portNumber);
        	System.out.println("    Exception: " + e.toString());	
        	return false;
        }
		return true;
    }

    public String[] getDate() {
    	String [] theDateAndTime = new String [2];
    	String theDateCommand = "GetDate";
    	this.send(theDateCommand);
    	try{
    		theDateAndTime = (String[]) receive();

    	}
    	catch (Exception e){
    		System.out.println("XX. There was an invalid object sent back from the server");
    	}
    	System.out.println("06. -- Disconnected from Server.");
    	return theDateAndTime;
    }
	
    // method to send a generic object.
    private void send(Object o) {
		try {
		    os.writeObject(o);
		    os.flush();
		} 
	    catch (Exception e) {
		    System.out.println("XX. Exception Occurred on Sending:" +  e.toString());
		}
    }

    // method to receive a generic object.
    private Object receive() 
    {
		Object o = null;
		try {
		    o = is.readObject();
		} 
	    catch (Exception e) {
		    System.out.println("XX. Exception Occurred on Receiving:" + e.toString());
		}
		return o;
    }

    
}