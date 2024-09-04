package day2;

public class Loop {

    public static void main(String[] args) {
        // for loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
        
        // Enhanced for loop (foreach loop)
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        // while loop
        System.out.println("\nWhile Loop:");
        int i = 0;
        while (i < 5) {
            System.out.println("i: " + i);
            i++;
        }
        
        // do-while loop
        System.out.println("\nDo-While Loop:");
        i = 0;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 5);
    }
}



