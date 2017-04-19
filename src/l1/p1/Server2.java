package l1.p1;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStream;

class Server2 {
	public static void main(String[] arg) throws Exception {
		ServerSocket ss = new ServerSocket(4711);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		
		while (sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		
//		int c = is.read();
//		while (c != -1) {
//			System.out.print((char) c);
//			c = is.read();
//		}
		sc.close();
		s.close();
		ss.close();
	}
}