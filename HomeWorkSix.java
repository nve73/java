class HomeWorkSix {
    public static void main(String[] args) {
        Animal cat = new Cat("Murzik");
        Animal dog = new Dog("Bobik");
        Animal[] animals = {cat, dog};
        cat.run(20);
        cat.swim(20);
        dog.run(450);
        dog.swim(9);
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    
    @Override
    public void run(int lrun) {
        if (lrun < 200) {
            System.out.println("Cat run: " + lrun + "m");
        }
    }
    
    @Override
    public void swim(int lsw) {
        return;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    
    @Override
    public void run(int lrun) {
        if (lrun < 500) {
            System.out.println("Dog run: " + lrun + "m");
        }
    }
    
    @Override
    public void swim(int lsw) {
        if (lsw < 10) {
            System.out.println("Dog swim: " + lsw + "m");
        }
    }
}

interface IAnimal {
    abstract void run(int lrun);
}

abstract class Animal implements IAnimal {
    protected String name; 
    
    Animal(String name) {
        this.name = name;
    }
    
    @Override
    public String toString () {
        return name;
    }
    
    void swim(int lsw) {
        System.out.println("Animal swim: " + lsw + "m");
    }
}