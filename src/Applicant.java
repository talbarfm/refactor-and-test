
public class Applicant {
    // TODO: Test the function's and see if its returning what its supposed to. Assert that the name, the last name and number were initialized.
    // If one of the tests you have written fail, fix the code.  
	
    public String name;
    public String lastName;
    public int number; 
    
    public void printName() {
    	name = "Roberta";
    	System.out.println("Roberta");
    }
    
    public void printNumber(int number) {
    	number = 7;
    	System.out.print(number);
    }
}
