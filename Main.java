import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
1
Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user" (tip:
use if else)


         System.out.println("Enter Your role");
        String role = scanner.next();

        if (role.equals("admin")) {
            System.out.println("Welcome admin");
        } else if (role.equals("superuser")) {
            System.out.println("Welcome superuser");
        } else if (role.equals("user")) {
            System.out.println("Welcome user");
        } else {
            System.out.println("Invalid role");
        }


----------------------------------------------
2
  2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87


        System.out.println("Enter Num 1");
        int num = scanner.nextInt();
        System.out.println("Enter Num 2");
        int num2 = scanner.nextInt();
        System.out.println("Enter Num 3");
        int num3 = scanner.nextInt();

        if (num > num2 &&  num > num3) {
            System.out.print("greatest: "+num);
        }
        else if (num2 > num &&  num2 > num3) {
            System.out.print("greatest: "+num2);

        }else {
            System.out.print("greatest: "+num3);
        }


  ---------------------------------------------------------------------
      3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.


        Random random = new Random();

        int day = random.nextInt(7) + 1;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");

                break;
            case 4:
                System.out.println("Wednesday");

                break;
            case 5:
                System.out.println("Thursday");

                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");

                break;
            default:
                System.out.println("Invalid day");  // Just in case
        }


        4. Write a program that takes a numeric score as input and prints the corresponding letter grade using the following grading scale: A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69  F:
        0-59
        Enter your numeric score: 85
        Numeric Score: 85
        Letter Grade: B



        System.out.println("Enter your numeric score:  ");
        int score = scanner.nextInt();
        System.out.printf("Numeric Score: %d \n", score);
         if (score >= 90) {
             System.out.println("Letter Grade: A");
         }else if (score >= 80 && score <= 89) {
             System.out.println("Letter Grade: B");
         }else if (score >= 70 && score <= 79) {
             System.out.println("Letter Grade: C");
         }else if (score >= 60 && score <= 69) {
             System.out.println("Letter Grade: D");
         }else if (score >= 0 && score <= 59) {
             System.out.println("Letter Grade: F");
         }


        5. Write a Java program that takes a person's age as input and categorizes them into one of three age categories: "Child,"
        "Teenager," or "Adult" using an if statement.


if the age is less than 13, categorize them as a "Child."
•	If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
•	If the age is 20 or older, categorize them as an "Adult."


        System.out.print("Please Enter body age: ");

        int age = scanner.nextInt();

        if (age < 13)
        {
            System.out.println("You are an Child");
        }
        else if (age >= 13 && age <= 19)
        {
            System.out.println("Your are an Teenager");
        }
        else
        {
            System.out.print("You are an Adult.");
    }

        */
}
}