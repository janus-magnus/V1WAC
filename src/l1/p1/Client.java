package l1.p1;

import java.net.Socket;
import java.io.OutputStream;

class Client {
	public static void main(String[] arg) throws Exception {
		Socket s = new Socket("localhost", 4711);
		OutputStream os = s.getOutputStream();
		os.write("hello\n".getBytes());
		s.close();
	}
}
