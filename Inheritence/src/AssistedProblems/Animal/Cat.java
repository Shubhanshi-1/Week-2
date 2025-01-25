package AssistedProblems.Animal;

class Cat extends Animal{
    Cat(String name, int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println(name+" Meaow!!");
    }
}

