package org.Week1.Abstraction.Day0405;

final class FinalClass {
    private final int finalVariable = 10;

    final void finalMethod() {
        System.out.println("Final method called. Final variable value: " + finalVariable);
    }

    public static void main(String[] args){
        Object finalMethod;
        finalMethod final = new FinalClass();
        final();
    }

}


// Reverse a number
// 123456 --> 654321
