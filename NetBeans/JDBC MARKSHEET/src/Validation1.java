/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 

import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
import java.util.regex.Pattern;
public class Validation1 {

    public static boolean name(String name) {
        boolean Valid_name_boolen = false;
        if (name.length() > 0) {
            String[] words = name.split(" ");
            for (String word : words) {
                char[] chars = word.toCharArray();
                for (char aChar : chars) {
                    if (aChar >= 'A' && aChar <= 'Z' || aChar >= 'a' && aChar <= 'z') {
                        Valid_name_boolen = true;
                    } else {
                        Valid_name_boolen = false;
                    }
                }
            }
        }
        return Valid_name_boolen;
    }

    public static boolean isValidGmail(String email) {
        String gmailRegex = "^[a-zA-Z0-9_.+-]+@gmail.com$";
        Pattern pattern = Pattern.compile(gmailRegex);
        return pattern.matcher(email).matches();
    }

    public static boolean checkMarks(String marks) {
        int marks1 = 0;
        try {

            marks1 = Integer.parseInt(marks);
            if (marks1 > 0 && marks1 < 100) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Valid catch");
            return false;
        }
    }

    public static boolean checkYear(String year) {
        int year1 = 0;
        try {
            year1 = Integer.parseInt(year);
            if (year1 > 0 && year1 < 5) {
                System.out.println("Gghjghjghj");
                return true;
            } else {
                System.out.println("else ");
                return false;
            }

        } catch (Exception e) {
            return true;
        }

    }
     public static boolean checkRoll(String roll) {
        int roll1 = 0;
        try {
            roll1 = Integer.parseInt(roll);
            if (roll1 > 0) {

                return true;
            } else {

                return false;
            }

        } 
        catch (Exception e) {
            return false;
        }

    }

    //String sem,year
    public static boolean checkSem(String sem, int year) {
        int sem1 = 0;
        try {

            sem1 = Integer.parseInt(sem);

            switch (year) {
                case 1 -> {
                    return sem1 == 1 || sem1 == 2;
                }

                case 2 -> {
                    return sem1 == 3 || sem1 == 4;
                }

                case 3 -> {
                    return sem1 == 5 || sem1 == 6;
                }

                case 4 -> {
                    return sem1 == 7 || sem1 == 8;
                }

            }

        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

}
