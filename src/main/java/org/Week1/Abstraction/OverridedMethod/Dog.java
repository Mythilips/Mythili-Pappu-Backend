package org.Week1.Abstraction.OverridedMethod;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}