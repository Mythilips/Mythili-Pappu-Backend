package org.Week1.Abstraction.OverridedMethod;

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}