package input;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    
    public Input() {
        scanner = new Scanner(System.in);
    }

    public String readInput() {
        System.out.println("Your text please: ");
        String input = scanner.nextLine();
        return input;
    }
}