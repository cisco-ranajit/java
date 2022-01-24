abstract class DemoAbstract {
    abstract void input();

    abstract void area();

    abstract void show();
}

/*
 * any child class which will not override
 * the abstract method of parent abstract class then
 * the child class needs to be decleared as abstract.
 * use multi-level inheritance the sub-child of the child
 * class is responsiable to overwrite the abstract . this process will continune
 * till
 * all the abstract methods are overridden .
 */
abstract class ChildAbstract extends DemoAbstract {

    @Override
    void input() {
        // TODO Auto-generated method stub
        System.out.println("input");
    }

    @Override
    void show() {
        // TODO Auto-generated method stub
        System.out.println("show");

    }

    @Override
    void area() {
        // TODO Auto-generated method stub

    }
}

class SubChild extends ChildAbstract {
    void area() {
        System.out.println("area");
    }
}

class abstractDemo {
    public static void main(String[] args) {
        DemoAbstract ob;
        ob = new SubChild();
        ob.input();
        ob.area();
        ob.show();

    }
}
