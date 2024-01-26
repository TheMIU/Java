package oop.inheritance;

public class DiamondProblem {
    public static void main(String[] args) {
        new A();

        K k = new K();
        k.methodAi();
        k.methodBi();
        k.methodCi();

        R r = new R();
        r.methodAi();
        r.methodBi();
        r.methodCi();
    }
}

class A extends X {
    // only supports extend two classes
}

/*
 * // Java doesn't supports multiple inheritance with classes
 * class B extends X,Y,Z{
 * 
 * }
 */

class X {
    X() {
        System.out.println("X class created");
    }
}

class Y {
    Y() {
        System.out.println("Y class created");
    }
}

class Z {
    Z() {
        System.out.println("Z class created");
    }
}

/*
 * But java supports multiple interfaces
 */

class K implements Ai, Bi, Ci {

    @Override
    public void methodCi() {
        System.out.println("method 'methodCi'");
    }

    @Override
    public void methodBi() {
        System.out.println("method 'methodBi'");
    }

    @Override
    public void methodAi() {
        System.out.println("method 'methodAi'");
    }

}

interface Ai {
    void methodAi();
}

interface Bi {
    void methodBi();
}

interface Ci {
    void methodCi();
}

// ===================================================
// also interface can extend with multiple interfaces
interface Di extends Ci, Bi, Ai {

}

class R implements Di {

    @Override
    public void methodCi() {
        System.out.println("method 'methodCi'");
    }

    @Override
    public void methodBi() {
        System.out.println("method 'methodBi'");
    }

    @Override
    public void methodAi() {
        System.out.println("method 'methodAi'");
    }

}