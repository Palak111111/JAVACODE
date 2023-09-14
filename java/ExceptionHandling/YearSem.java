class MyException3 extends Exception {
    MyException3() {

    }

    MyException3(String msg) {
        super(msg);
    }
}

class Test {
    public static void main(String args[]) {
        try {
            int year = Integer.parseInt(args[0]);
            int sem = Integer.parseInt(args[1]);

            if (year == 1 && (sem != 1 && sem != 2))
                throw new MyException3("You can only choose 1st and 2nd sem");
            else if (year == 2 && (sem != 3 && sem != 4))
                throw new MyException3("You can only choose 3rd and 4th sem");
            else if (year == 3 && (sem != 5 && sem != 6))
                throw new MyException3("You can only choose 5th and 6th sem");
            else if (year == 4 && (sem != 7 && sem != 8))
                throw new MyException3("You can only choose 7th and 8th sem");
            else if (year < 1 || year > 4)
                throw new MyException3("Year should be 1, 2, 3, or 4");
			 System.out.println("Currect");
        } catch (MyException3 ref) {
            System.out.println(ref.getMessage());
        }
    }
}
