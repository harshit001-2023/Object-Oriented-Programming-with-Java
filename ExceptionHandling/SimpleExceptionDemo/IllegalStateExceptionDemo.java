package ExceptionHandling.SimpleExceptionDemo;

public class IllegalStateExceptionDemo {
    // Static method as specified
    static void throwIllegalException() {
        try {
            throw new IllegalStateException("MyException");
        } catch (IllegalStateException objA) {
            System.out.println("Caught: " + objA);
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Calling throwIllegalException from main method:");
        throwIllegalException();
    }
}
