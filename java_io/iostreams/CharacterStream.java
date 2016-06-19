import java.io.*;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 * @date June 19, 2016
 *
 */
public class CharacterStream {

	public static void main(String[] args) throws IOException {
		
		Reader in = null;
		
		Writer out = null;
		
		try {
			in = new FileReader("incharacter.txt");
			out = new FileWriter("outcharacter.txt");
			
			int read;
			System.out.println("Start Writing[CharacterStream]");
			System.out.print("Progress");
			while((read = in.read()) != -1) {
				out.write(read);
				System.out.print(".");
			}
			System.out.println("\nEND----");
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
		
	}
}