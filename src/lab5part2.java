import java.util.Scanner;
/**
 * 
 */

/**
*
* Name: Laturski, Garrett William
* Teacher: Mr.Hardman
* Assignment # I don't know
* Date Last Modified: 11/21/2016
*
*/
public final class lab5part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[] values = new int[10];
		int element;
		int count = 0;
		
		for(int i = 0; i < values.length; i++){
			
			System.out.print("Please enter an intiger ");
			values[i] = userInput.nextInt();
		
		}
		System.out.print("What element are you looking for? ");
		element = userInput.nextInt();
		
		for(int i = 0; i< values.length; i++){
			
			if(values[i] == element){
				count++;
			}
		}
		
		System.out.print("This element was found " + count + " time(s)");
		
		
		userInput.close();
	}

}
