class HomeWorkFive {
    public static void main (String[] args) {
        Person[] person = new Person [5];
        person[0] = new Person("Ivanov Petr", "director", "ivanov_p@office.com", "88009001010", 120000, 55);
        person[1] = new Person("Sidorov Ivan", "specialist", "sidorov_i@office.com", "88009231010", 50000, 40);
        person[2] = new Person("Ivanova Svetlana", "assistant", "ivanova_s@office.com", "88009002323", 30000, 25);
        person[3] = new Person("Mavr Serg", "designer", "mavr_s@office.com", "88009555555", 100000, 45);
        person[4] = new Person("Greck Max", "designer", "greck_m@office.com", "88009554545", 70000, 31);
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                System.out.println(person[i].toString());
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String mail;
    private String tel;
    private int salary;
    private int age;
    
    Person (String name, String position, String mail, String tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
     
    @Override
    public String toString () {
        return name + ", " + position + ", " + mail + ", " + tel + ", " + salary + ", " + age;
    }
    
    public int getAge () {
        return age;
    }
}