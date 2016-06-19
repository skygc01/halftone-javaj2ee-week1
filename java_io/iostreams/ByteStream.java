
import java.io.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 * @date June 19, 2016
 *
 */
public class ByteStream {
	
	public static void main(String[] args) throws Exception {
			
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("inbyte.txt");
			out = new FileOutputStream("outbyte.txt");
			
			int c ;
			
			System.out.println("Start Writing[ByteStream]");
			System.out.print("Progress");
			
			while((c = in.read()) != -1)  {
				out.write(c);
				System.out.print(".");
			}
			
			System.out.println("\nEND----");
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
		
	
	}

}