package oop.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(18);
        System.out.println(st.getAge());
    }
}

class Student {
    private String name;
    private int age;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        if (age > 0 && age < 100) { //<- Validation level Protection
            this.age = age;
        }
    }
 }
 