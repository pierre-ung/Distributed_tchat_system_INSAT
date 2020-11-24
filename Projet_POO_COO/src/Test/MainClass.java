package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import localApp.LocalSystemConfig;

public class MainClass {

	public static void main(String[] args) {
		
		LocalSystemConfig.openTCPServer();
		System.out.println(LocalSystemConfig.get_TCP_port());
		
		Scanner s = new Scanner(System.in);
		String t = s.next();
		
		if(t.equals("receive")) {
			
			Socket link;
			try {
				link = LocalSystemConfig.m_TCP_socket.accept();
			
				PrintWriter out = new PrintWriter(link.getOutputStream(),true);
				
				out.print("connected");
				out.flush();
				
			} catch (IOException e) {
				
			}
			
			
			
			
		}
		
		if(t.equals("send")) {
			for(int i=LocalSystemConfig.START_PORT; i <= LocalSystemConfig.END_PORT; ++i) {
				
				System.out.print("Emission sur le port " + i + " : ");
				
				try {
					Socket link = new Socket("localhost",LocalSystemConfig.get_TCP_port());
					
					BufferedReader buff = new BufferedReader(new InputStreamReader(link.getInputStream()));
					
					if(buff.readLine().equals("connected")) {
						System.out.println("CONNECTED");
					}
					
				} catch (IOException e) {
					System.out.println("PAS DE REPONSE");
				}
			}
		}
	
		
		
		
		
	}

}
