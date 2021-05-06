class WorkingWithStrings{
	public static void main(String[] args) {
		// Create a String reference variable and put an object ref to it
		String str = "Getting Started with Strings in Java";
		str = "Looks exciting";

		// String anotherRef = "Getting Started with Strings in Java";

		// System.out.println(str); //Looks exciting

		// str += " to work with Strings";

		str = str.concat(" to work with Strings");

		System.out.println(str); //Looks exciting to work with Strings

		str = str.toLowerCase();

		str = str.toUpperCase();

		System.out.println(str);	

		System.out.println("length: " + str.length());

		//System.out.println(str.charAt(6));

		// str = str.substring(4, 9);

		// str = str.substring(4);

		System.out.println(str);
		

		//String []values = str.split(" ");

		//for(String value : values){
			//System.out.println(value);

			System.out.println(valueof(6));
		}


	}



