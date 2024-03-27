class Custom_validation_exception extends Exception {
    public Custom_validation_exception(String message) {
        super(message);
    }
}
class validator {
    public void validateNumber(int number) throws Custom_validation_exception {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
}
public class Custom_validation {
    public static void main(String[] args) {
        Validator validator = new Validator();
        int inputNumber = -5; // Example input number

        try {
            validator.validatenumber(inputNumber);
            System.out.println("Number is valid");
        } catch (Custom_validation_exception e) {
            System.out.println("Custom_validation_exception: " + e.getMessage());
        }
    }
}