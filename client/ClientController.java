package client;
/**
 * 
 */
/**
 * @author yossr
 *
 */





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;







public class ClientController {
	
	private PrintWriter out;
	private BufferedReader in;
	private Socket aSocket;
	private Scanner scannerin;
	/**
	 * Constructs a Client object with the specified server name and port number.
	 * The values of the data fields are supplied by the given parameters:
	 * 
	 * @param serverName is the name of the Server
	 * @param portNumber is the number of the port used
	 */
	public ClientController(String serverName, int portNumber) {
		try {
			aSocket = new Socket(serverName, portNumber);
			out = new PrintWriter(aSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(aSocket.getInputStream()));
			scannerin = new Scanner(System.in);
		
		} catch (IOException e) {
			System.err.println("error in client");
		}

	}
	
	
	
	/**
	 * Communicates with server, sending user input to server
	 */
	public void communicateWithServer() {
		String response = "";
		
		try {
			while (true) {
				String toSend=scannerin.nextLine();
				out.println(toSend);
				response = in.readLine();			// assume this is coming from the server side
				
				System.out.println(response +" in client");
				response="";
			}
		} catch (

				IOException e) {

					e.printStackTrace();
				}
				try {

					out.close();
					in.close();
					aSocket.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
	}
	
	
	
	
	/**
	 * Run Client.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ClientController aClient = new ClientController("localhost", 9898);
		System.out.println("after accept  client");
		aClient.communicateWithServer();
	}
	
	
}