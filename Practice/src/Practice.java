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
			System.out.println("Ÿ�Ӽ����Դϴ�.");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			System.out.println("500ms���� ���� �����ϴ�.");
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
					out.write("������ �����մϴ�."+"\n");
					out.flush();
					System.out.println("�����մϴ�.");
					 
					
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