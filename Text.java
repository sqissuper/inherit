import com.baidu.TextDemo;

class Animal{
    public String name;
    public int age;

    public Animal(){

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("animal");
    }

    public void eat(){
        System.out.println("animal eat");
    }
}

class Dog extends Animal{
    public Dog(){

    }
    public Dog(String name,int age){
        super("旺旺",12);
        System.out.println("dog...");
    }
    public void bark(){
        System.out.println("犬吠");
    }
    public void eat(){
        System.out.println("dog eat");
    }
}
public class Text{
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
//        animal.bark();
//        Dog dog = new Animal();
//        Animal animal = new Animal();
////        Animal animal = new Dog();
//        Dog dog = (Dog)animal;
//        dog.name = "旺旺";
//        dog.age = 21;
//        System.out.println(dog.name + dog.age);

    }
}
//public class Text extends TextDemo{
//    public void func(){
//        System.out.println(super.val);
//    }
//    public static void main(String[] args) {
//        Text t = new Text();
//        Dog dog = new Dog();
//        dog.bark();
//        t.func();
//        //System.out.println(dog.name + dog.age);
//    }
//}
//public class Text {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//
//    }
////    public static void main1(String[] args) {
////        Dog dog = new Dog();
////        dog.name = "旺旺";
////        dog.age = 12;
////        dog.eat();
////        dog.bark();
////        System.out.println(dog.name + dog.age);
////    }
//}
