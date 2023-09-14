class ExtraNumberException extends Throwable {
    String a;

    ExtraNumberException() {
    }

    ExtraNumberException(String a) {
        super(a);
    }
}

class PhoneNumber {
    public static void main(String args[]) {
        try {
            if (args.length == 0) {
                throw new ExtraNumberException("Please provide a phone number as a command-line argument.");
            }

            String a = args[0];

            if (!a.matches("[7-9]\\d{9}")) {
                throw new ExtraNumberException("Invalid phone number. The phone number should start with 7, 8, or 9 and have a total of 10 digits.");
            }

            System.out.print("Your phone number is= " + a);
        } catch (ExtraNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}



// class ExtraNumberException extends Throwable {
    // String a;

    // ExtraNumberException() {
    // }

    // ExtraNumberException(String a) {
        // super(a);
    // }
// }

// class PhoneNumber {
    // public static void main(String args[]) {
        // try {
            // if (args.length == 0) {
                // throw new IllegalArgumentException("Please provide a phone number as a command-line argument.");
            // }

            // String a = args[0];

            // if (!a.matches("\\d+")) {
                // throw new NumberFormatException("Invalid phone number. The phone number should contain only digits.");
            // }

            // if (a.length() != 10) {
                // throw new ExtraNumberException("Number should be 10 digits");
            // } else {
                // System.out.print("Your phone number is= " + a);
            // }
        // } catch (Throwable e) {
            // System.out.println(e.getMessage());
        // }
    // }
// }



// class ExtraNumberException extends Throwable{
	// String a;
	// ExtraNumberException(){}
	// ExtraNumberException(String a){
		// super(a);
	// }
// }
// class PhoneNumber{
	// public static void main(String args[]){
		// try{
			// String a= args[0];
			// if(a.length()>10 || a.length()<10){
				// throw new ExtraNumberException ("number should be 10 digit");
			// }
			// else{
				// System.out.print("Your phone number is= "+a);
			// }
		// }
		// catch(ExtraNumberException e){
			// System.out.println(e);
		// }
	// }
// }