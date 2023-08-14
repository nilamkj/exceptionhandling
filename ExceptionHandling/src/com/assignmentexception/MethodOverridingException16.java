package com.assignmentexception;
//16. WAP to check Exception handling with method overriding. Means, If super
//class method don’t declare exception then subclass overridden method can 
//declare exception or not.

class Superclass {
    void methodWithoutException() {
        System.out.println("Superclass methodWithoutException");
    }

    void methodWithException() throws Exception {
        System.out.println("Superclass methodWithException");
        throw new Exception("Exception from Superclass");
    }
}

class Subclass extends Superclass {
    @Override
    void methodWithoutException() {
        System.out.println("Subclass methodWithoutException");
    }

    @Override
    void methodWithException() {
        System.out.println("Subclass methodWithException");
        // No exception declared or thrown
    }
}

public class MethodOverridingException16 {
	
    public static void main(String[] args) {
        Superclass superClassObj = new Superclass();
        Subclass subClassObj = new Subclass();

        superClassObj.methodWithoutException();
        subClassObj.methodWithoutException();

        try {
            superClassObj.methodWithException();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        subClassObj.methodWithException();
    }
}



