/**
* Java 1. Homework #7
*
* @author Natalia Erokhova
* @version 29.12.2021 - 03.01.2022
*/

class HomeWorkSeven {
    public static void main (String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 15);
        cats[1] = new Cat("Mursik", 15);
        cats[2] = new Cat("Timka", 15);
        
        Plate plate = new Plate (50, 30);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);
        
        for (Cat cat : cats) {
        //    cat.setFull(false); я данную строку закомментировала,т.к.
        //третьему коту не хватало еды, а т.к. два кота уже поели, то я не стала менять
        //им статус на голодных, конечно, можно положить больше еды, но больше у меня нет,
        //а хотелось покормить всех котов :)
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean full;
    
    Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        full = false;
    }
    
    void setFull(boolean status) {
        full = status;
    }
    
    //передаем методу eat в качестве параметра объект plate 
    //(созданную тарелку), а если объект доступен, можем вызвать у него метод
    //в качестве параметра метод decreaseFood передаем аппетит кота
    void eat(Plate plate) {
        if (!full) {
        full = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString () {
        return "Cat: " + name + ", appetite: " + appetite + " full: " + full;
    }
}

class Plate {
    private int valume;
    private int food;
    
    Plate (int valume, int food) {
        this.valume = valume;
        this.food = food;
    }
    
    //метод, уменьшающий еду в тарелке
    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    
    void add(int food) {
        if (this.food + food <= valume) {
            this.food += food;
        }
    }
    
    @Override
    public String toString () {
        return "Food: " + food;
    }
}