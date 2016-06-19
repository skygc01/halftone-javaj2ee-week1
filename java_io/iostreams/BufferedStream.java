import java.io.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 * @date June 19, 2016
 *
 */ 
public class BufferedStream {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			
			in = new BufferedReader(new FileReader("inbuffered.txt"));
			out = new PrintWriter(new FileWriter("outbuffered.txt"));
			
			String read;
			
			System.out.println("Start Writing[BufferedStream]");
			System.out.print("Progress");
			
			while((read = in.readLine()) != null) {
				out.println(read);
				System.out.print(".");
			}
			
			System.out.println("\nEND----");
			
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
		
	}
}