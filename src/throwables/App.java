package throwables;

import java.io.FileReader;
import java.io.FileNotFoundException;

class UserDefException extends Exception {
}

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("exception thrown successfully");
		} catch (UserDefException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("generic exception thrown t1ry2");
		}

	}

	public static void someMethod() throws Exception, FileNotFoundException, UserDefException {

		int x = 1 / 0;
		switch (x) {
		case 1:
			throw new FileNotFoundException();

		case 2:
			throw new Exception();
		default:
			throw new UserDefException();
		}
	}

}
