package class25_reflex.classknowledge.popj;

import class25_reflex.classknowledge.annotaion.MyAnnotation;

@MyAnnotation(content = "我是内容")
public class NewUser extends Animal implements MyInterface {

    @MyAnnotation(content = "我是李四,行不改名坐不改姓")
    private String name;
    private Integer age;
    public String idNumber;

    private NewUser() {
    }

    private NewUser(String name) {
        this.name = name;
    }

    private NewUser(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public NewUser(String name, Integer age, String idNumber) {
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
        System.out.println("吃饭");
    }

   private void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
    private void work(){
        System.out.println("工作");
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
