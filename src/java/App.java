import input.Input;

public class App {
    public static void main(String[] args) {
        Input input = new Input();

        String userInput = input.readInput();
        StringBuilder modifiedString = new StringBuilder();
        
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);

            if (i % 2 == 0) {
                modifiedString.append(Character.toUpperCase(currentChar));
            } else {
                modifiedString.append(Character.toLowerCase(currentChar));
            }
        }

        System.out.println("Result: " + modifiedString.toString());
    }
}