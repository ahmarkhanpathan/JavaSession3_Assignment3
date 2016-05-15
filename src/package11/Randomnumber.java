package package11;

public class Randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is the given input number N
        
        int N = 4;
 
        
        double randomNumber = Math.random();
        int randomInt = (int)(N * randomNumber);
 
        //Displays the random number
        System.out.println(randomInt);
 
	}

}
