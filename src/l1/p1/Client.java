package l1.p1;

import java.net.Socket;
import java.util.Scanner;
import java.io.OutputStream;
import java.io.PrintWriter;

class Client {
	public static void main(String[] arg) throws Exception {
		Socket s = new Socket("localhost", 4711);
		OutputStream os = s.getOutputStream();
		// os.write("hello\n".getBytes());
		PrintWriter pr = new PrintWriter(os);

		Scanner keyboard = new Scanner(System.in);

		while (true) {
			String text = (keyboard.nextLine() + "\n");
			if (text.equals("stop")) {
				keyboard.close();
				s.close();
				break;
			}
			pr.write(text);
			pr.flush();
		}
	}
}
