package day2;
public class Condition {
    public static void main(String[] args) {
        // Variables for demonstration
        int num = 20;
        int age = 18;
        String day = "Wednesday";

        // 1. If Statement
        if (num > 10) {
            System.out.println("Number is greater than 10.");
        }

        // 2. If-Else Statement
        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

        // 3. If-Else If-Else Ladder
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age < 20) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }

        // 4. Nested If Statements
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Number is positive and even.");
            } else {
                System.out.println("Number is positive and odd.");
            }
        } else {
            System.out.println("Number is zero or negative.");
        }

        // 5. Switch Case Statement
        switch (day) {
            case "Monday":
                System.out.println("Today is Monday.");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday.");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday.");
                break;
            case "Thursday":
                System.out.println("Today is Thursday.");
                break;
            case "Friday":
                System.out.println("Today is Friday.");
                break;
            case "Saturday":
                System.out.println("Today is Saturday.");
                break;
            case "Sunday":
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }
}
