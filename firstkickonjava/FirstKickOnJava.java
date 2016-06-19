
/**
 *
 * @author Bhuwan Prasad Upadhyay
 * @date June 19, 2016
 *
 */
public class FirstKickOnJava {
	
	public static void main(String[] args) {
		System.out.println("I am Java Developer from Now!");
		
		int argNo = 1;
		for(String argument : args) {
			System.out.println("Argument" + argNo + "=" + argument);
			argNo++;
		}
	}
	
}
