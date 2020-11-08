package class25_reflex.classknowledge.popj;

import jdk.nashorn.internal.runtime.logging.Logger;

@Logger
public class User extends Animal implements MyInterface {
    private String name;
    private Integer age;
    public String idNumber;

    public User() {
    }

    private User(String name) {
        this.name = name;
    }

    private User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, Integer age, String idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public void method1() {

    }

    public void eat(){
        System.out.println("³Ô·¹");
    }

   private void sleep(){
        System.out.println("Ë¯¾õ");
    }
    public void study(){
        System.out.println("Ñ§Ï°");
    }
    private void work(){
        System.out.println("¹¤×÷");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
