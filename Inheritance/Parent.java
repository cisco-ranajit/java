//use of inheritance is java ( advantage - code reuseable )
class Parent{
    void show(){
        System.out.println("Base class Method");
    }
}class Child extends Parent{
    void display(){
        System.out.println("Derived class Method");
    }
}
class DemoInheritance{
    public static void main(String[] args) {
        Child ob = new Child();
        ob.display();
        ob.show();
    }
}
