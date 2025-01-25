package AssistedProblems.Animal;

class Animals{
    public static void main(String args[]){
        Dog dog = new Dog("Simba",5);
        dog.makeSound();
        Cat cat = new Cat("Jerry",3);
        cat.makeSound();
        Bird bird= new Bird("Piper",1);
        bird.makeSound();
    }
}

