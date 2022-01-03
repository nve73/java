/**
* Java 1. Homework #6
*
* @author Natalia Erokhova
* @version 25.12.2021 - 26.12.2021
*/

class HomeWorkSix {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 200);
        Dog dog = new Dog("Bobik", 500, 10);
        IAnimal[] animals = {cat, dog};
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
            System.out.println(animals[i].run(250));
            System.out.println(animals[i].run(150));
            System.out.println(animals[i].run(600));
            System.out.println(animals[i].swim(5));
            System.out.println(animals[i].swim(15));
        }
        //ещё один способ написания цикла для массива
        //в правой части итерируемый объект - animals
        //animal - промежуточная переменная с типом IAnimal
        //будет перебираться массив поэлементно и каждый элемент
        //будет записывать в переменную animal
        //
        //for (IAnimal animal : animals) {
        //    System.out.println(animal);
        //    System.out.println(animal.run(250));
        //    System.out.println(animal.run(150));
        //    System.out.println(animal.run(600));
        //    System.out.println(animal.swim(5));
        //    System.out.println(animal.swim(15));
        //} 
        
    }
}

class Cat extends Animal {
    Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }
    //перегружаем конструктор класса Cat, т.к. кот не умеет плавать, то 
    //только два параметра String name, int runLimit. Вмето трьетьего параметра
    //указываем 0 в super
    Cat(String name, int runLimit) {
        super(name, runLimit, 0);
    }
    
    @Override
    public String swim(int distance) {
        return name + " can't swim";
    }
}

class Dog extends Animal {
    Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }
}

interface IAnimal {
    abstract String run(int distance);
    abstract String swim(int distance);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    
    Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }
    
    @Override
    public String toString () {
        return name + ", runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
    
    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return name + " couldn't run " + distance +"m";
        } else {
            return name + " run " + distance + "m";
        }
    }
    
    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return name + " couldn't swim " + distance +"m";
        } else {
            return name + " swim " + distance + "m";
        }
    }
}