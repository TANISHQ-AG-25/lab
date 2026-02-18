class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class ArgumentProcessor {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            }

            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                int val = Integer.parseInt(args[i]);
                sum += (val * val);
            }
            System.out.println(sum);

        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please ensure all arguments are valid integers.");
        }
    }
}