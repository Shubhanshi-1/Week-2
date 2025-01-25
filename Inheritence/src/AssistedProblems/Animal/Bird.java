package AssistedProblems.Animal;

class Bird extends Animal{
    Bird(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println(name+" Chirps!!");
    }
}
