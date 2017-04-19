package l1.p2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class MyServlet extends Thread {
	private Socket sock;

	public MyServlet(Socket socket) throws IOException {
		sock = socket;
	}

	@Override
	public void run() {
		InputStream is;
		OutputStream os;
		try {
			is = sock.getInputStream();
			os = sock.getOutputStream();
			Scanner sc = new Scanner(is);
			while (sc.hasNextLine()) {
				String test = sc.nextLine();
				System.out.println(test);
				if (test.equals("")) {
					os.write("succes".getBytes());
					// pr.write("succes");
					// pr.flush();
					// sc.close();
					sock.close();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}