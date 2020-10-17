// Java Program to Ping an IP address 
import java.io.*; 
import java.net.*; 

class NewClass 
{ 
// Sends ping request to a provided IP address 
public static void sendPingRequest(String ipAddress) 
			throws UnknownHostException, IOException 
{ 
	InetAddress geek = InetAddress.getByName(ipAddress); 
	System.out.println("Sending Ping Request to " + ipAddress); 
	if (geek.isReachable(5000)) 
	System.out.println("Host is reachable"); 
	else
	System.out.println("Sorry ! We can't reach to this host"); 
} 

// Driver code 
public static void main(String[] args) 
		throws UnknownHostException, IOException 
{ 
	String ipAddress = "127.0.0.1"; 
	sendPingRequest(ipAddress); 

	ipAddress = "133.192.31.42"; 
	sendPingRequest(ipAddress); 

	ipAddress = "145.154.42.58"; 
	sendPingRequest(ipAddress); 
} 
} 
