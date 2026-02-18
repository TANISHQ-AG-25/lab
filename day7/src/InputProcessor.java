class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class InputProcessor {
    public void processInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
    }

    public static void main(String[] args) {
        InputProcessor processor = new InputProcessor();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        try {
            processor.processInput(input);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}