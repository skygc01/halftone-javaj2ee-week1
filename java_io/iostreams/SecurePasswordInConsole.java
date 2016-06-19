
import java.io.*;
import java.util.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 * @date June 19, 2016
 *
 */
public class SecurePasswordInConsole {

	public static void main(String[] args) {
	
		Console c = System.console();
		
		String read = c.readLine("Enter your login name:");
		char[] password = c.readPassword("Enter your password:");
		System.out.println("Username=" + read + ", PWD=" + Arrays.toString(password));
		
		
	}


}