package lsa;

import java.util.*;
import java.net.*;
import java.io.*;

public class lsa {
	public static void main(String[] args) {

		BufferedReader in = null;
		Socket socket = null;
		String inputMessage = null;
		System.out.print("서버의 시간 : ");
		try {

			socket = new Socket("localhost", 9999);
			while (true) {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				inputMessage = in.readLine();

				System.out.print(inputMessage + " ");
			}
		} catch (IOException e) {

		} finally {
			if (Integer.parseInt(inputMessage) == 19) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
