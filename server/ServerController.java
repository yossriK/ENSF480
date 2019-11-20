package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


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
	 */
	public void runServer() throws IOException {
	
		try {
			while (true) {
				
				
				
				String recieved=in.readLine();
				System.out.println(recieved+" in server");
				
				out.println("the server recieved your message and is sending back");
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
	 */
	
	public static void main(String[] args) throws IOException {

		ServerController myServer = new ServerController();
		System.out.println("after accept");
		myServer.runServer();

	}
	
	
	
	
	
	
	
	

}
