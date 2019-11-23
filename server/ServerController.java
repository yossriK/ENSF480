package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import server.model.*;

public class ServerController {
	
	// setting my variables here that will be assigned to input/output
	
	static PrintWriter out;
	Socket aSocket;
	ServerSocket serverSocket;
	static BufferedReader in;
	
	public ServerController() {
		try {
			serverSocket = new ServerSocket(9898);
			aSocket = serverSocket.accept();
			System.out.println("Server is running");
			out = new PrintWriter((aSocket.getOutputStream()), true);
			in = new BufferedReader(new InputStreamReader(aSocket.getInputStream()));
			
			
	
			} catch (Exception e) {
				e.printStackTrace();
				}
	
	
	
	}
	
	
	
	
	/**
	 * Runs the Server
	 * in case of exception close all buffers
	 * @throws IOException
	 * @throws SQLException 
	 */
	public void runServer() throws IOException, SQLException {
		Person user=new Renter (new Name("yoss","hai","khal"),new Address("Adf","adsf","adsf",58),new BirthDate(29,5,1999));

		try {
			while (true) {
				
				String recieved=in.readLine();// what i  recieve from socket
				
				
				
			
				if(recieved.toString().startsWith("SEARCH")) {
					out.println(((Renter) user).Search(recieved));		// I get a string back from renter that I will write into socket from here
					
				}
				
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			try {
				in.close();
				out.close();
				aSocket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}
	
	
	
	
	
	/**
	 * Starts running the Server
	 * 
	 * @param args
	 * @throws IOException
	 * @throws SQLException 
	 */
	
	public static void main(String[] args) throws IOException, SQLException {

		ServerController myServer = new ServerController();
		System.out.println("after accept");
		myServer.runServer();

	}
	
	
	
	
	
	
	
	

}
