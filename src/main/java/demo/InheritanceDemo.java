package demo;

public class InheritanceDemo {
    public static void main(String[] args) {
        T object = new T(new T1());
        object.m();
    }
}

/**
 * Template Method <-> Strategy/State
 */
class T {
    private State state;

    T(State state) {
        this.state = state;
    }

    public void m() {
        System.out.println("step 1"); // 1
        state.step(); // 2
        System.out.println("step 3"); // 3
    }
}

interface State {
    public void step();
}

class T1 implements State {
    @Override
    public void step() {
        System.out.println("step 2 variant 1");
    }
}

class T2 implements State {
    @Override
    public void step() {
        System.out.println("step 2 var 2");
    }
}

class Santehnik {
    public void fix() {
        this.sayHello();
        //.....
        //.....
    }

    protected void sayHello() {
        System.out.println("Hi");
    }
}

// Special Case
class NotSoTrezv extends Santehnik {
    @Override
    public void sayHello() {
        System.out.println("!!!!!!!!$%^$&^*&^*&^*");
    }
}







