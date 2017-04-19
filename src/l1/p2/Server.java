package l1.p2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.attribute.TextSyntax;

class Server {
	public static void main(String[] arg) throws Exception {
		ServerSocket ss = new ServerSocket(4711);

		while (true) {
			Socket s = ss.accept();

			MyServlet testlet = new MyServlet(s);
			testlet.start();
		}
	}
}