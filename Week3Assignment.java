
public class Week3Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ages;
		
		ages = new int[] {3,9,23,64,2,8,28,93,30};
		
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
		sum += ages[i];
		
		}
		
		System.out.println("The average is " + sum / ages.length);
	   
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		
		System.out.println("The average number of letters per name is " + sum / names.length);
		
		String names2 = "";
		for (int i = 0; i < names.length; i++) {
		names2 += names[i] + " ";
		}
	
		System.out.println(names2);
		
		System.out.println("Use array[arr.length] to access the last element of an array");
		
		System.out.println("Use array[0] to access the first element of an array");
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
			
			
		}
		
		System.out.println("The sum of all the elements in the array = " + sum);
		
		String word = "hello";

		System.out.println(word.repeat(3));
		
		String firstName = "Tom";

		String lastName = "Sawyer";

		String fullName = firstName  + " " +  lastName;

		System.out.println("My full name is " + fullName);

	        
	
	}
	
	public static boolean sumOfNumsGreaterThan100 (int [] arr) {
		int sum = 0; 
		
			for (int x : arr) {
				sum += x;
			} 
				if (sum > 100) {
					return true;
				} else 
					return false;
	}
	 
  }
	

	







