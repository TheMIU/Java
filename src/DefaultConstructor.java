class DefaultConstructor {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        System.out.println("name:" + person1.name + " age:" + person1.age);
        // name:null age:0

        Person2 person2 = new Person2();
        System.out.println("name:" + person2.name + " age:" + person2.age);
        // name:John age:25
    }
}

class Person1 {
    String name;
    int age;

    // this constructor is generated by compiler
    // if not defined by us
    Person1() {
        name = null;
        age = 0;
    }
}

class Person2 {
    String name;
    int age;

    // Custom default constructor
    // but default values are defined by us
    Person2() {
        name = "John";
        age = 25;
    }
}
