import java.io.*;
import java.util.*;
import java.net.*;

public class Practice {

	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;

		try {

			listener = new ServerSocket(9999);
			System.out.println("타임서버입니다.");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			System.out.println("500ms마다 수를 보냅니다.");
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			cThread th = new cThread(out,socket,listener);
			th.start();
			try {
				th.join();
			} catch (InterruptedException e) {

			} 

		} catch (IOException e) {

		}
	}

}

class cThread extends Thread {
	ServerSocket listener = null;
	Socket socket = null;
	BufferedReader in = null;
	BufferedWriter out = null;

	int n = 0;

	public cThread(BufferedWriter out,Socket socket,ServerSocket listener) {
		this.out = out;
		this.socket=socket;
		this.listener=listener;
	}

	public void run() {

		while(true) {
 
			 
		try {
			sleep(500);
			try {
				if (n < 20) {
				 
					out.write(Integer.toString(n)+"\n");
					out.flush();
 
				}
				else 
				{
					out.write("연결을 종료합니다."+"\n");
					out.flush();
					System.out.println("종료합니다.");
					 
					
				}
			} catch (IOException e) {
				 
			} finally
			{
				try {
					if(n==20) {
					 
					socket.close();
					listener.close();
					System.exit(0);
					}
				}catch(IOException e)
				{
					
				}
			}
			n++;
			 
		
		} catch (InterruptedException e) {
			 
		}
		}
	}
}