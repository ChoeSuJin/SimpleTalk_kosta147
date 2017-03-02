package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import server.Server_Model;
import server.Server;

public class Server_Controller { // 서버 컨트롤러
	
	// Net Source
	private ServerSocket serverSocket = null;
	private Socket socket = null;
	private int port = 7777;
	
	public Server_Controller(){ // 생성자 함수

	}
	
	public void server_start(){
		
		try {
			serverSocket = new ServerSocket(port);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}// start
	
}// class end
