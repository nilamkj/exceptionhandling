package com.assignmentexception;

class Example {
    // 'final' keyword is used to define a constant
    final int finalVariable = 10;
    
    // 'finally' block is used to ensure a code block always executes, whether an exception is thrown or not
    void finallyExample() {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }
    
    // 'finalize' method is called by the garbage collector before an object is removed from memory
    @Override
    protected void finalize() {
        System.out.println("Finalize method called");
    }
}

public class FinalFinally18
{
    public static void main(String[] args) {
        Example example = new Example();
        
        // Using the final variable
        System.out.println("Final variable value: " + example.finalVariable);
        
        // Calling the finallyExample method
        example.finallyExample();
        
        // Making the 'example' object eligible for garbage collection
        example = null;
        
        // Requesting garbage collection explicitly (for demonstration purposes)
        System.gc();
        
        System.out.println("End of the program");
    }
}



