
public class Test {
	
	public static void main(String[] args) {
		
		//Lambda expression used for implement the functional interface.
		
		Message phoneMessage= (String message)->{
				System.out.println(message);
		};
		
		phoneMessage.getMessage("this a phonemessage");
		
		
		Message emailMessage= (String message)->{
			System.out.println("this is a email");
		};
		
		emailMessage.getMessage("this is an emaill");
	}

}
