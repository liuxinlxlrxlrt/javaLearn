package class25_reflex.classknowledge.popj;

import class25_reflex.classknowledge.annotaion.MyAnnotation;

@MyAnnotation(content = "��������")
public class NewUser extends Animal implements MyInterface {

    @MyAnnotation(content = "��������,�в�������������")
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
        System.out.println("�Է�");
    }

   private void sleep(){
        System.out.println("˯��");
    }
    public void study(){
        System.out.println("ѧϰ");
    }
    private void work(){
        System.out.println("����");
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
