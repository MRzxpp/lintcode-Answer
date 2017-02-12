package LintCode;

/**
 * Your object will be instantiated and called as such:
 * LintCode.ToyFactory tf = new LintCode.ToyFactory();
 * LintCode.Toy toy = tf.getToy(type);
 * toy.talk();
 */
interface Toy {
    void talk();
}

class Dog implements Toy {
    // Write your code here
    public void talk() {
        System.out.println("Wow");
    }
}

class Cat implements Toy {
    // Write your code here
    public void talk() {
        System.out.println("Meow");
    }
}

public class ToyFactory {
    /**
     * @param type a string
     * @return Get object of the type
     */
    public Toy getToy(String type) {
        // Write your code here
        Toy toy = new Toy() {
            @Override
            public void talk() {
                System.out.println("Wrong Input");
            }
        };
        if (type == "LintCode.Dog") {
            toy = new Dog();
            return toy;
        } else if (type == "LintCode.Cat") {
            toy = new Cat();
            return toy;
        } else {
            return toy;
        }
    }

    public static void main(String[] args) {
        String type="LintCode.Dog";
        ToyFactory tf = new ToyFactory();
        Toy toy = tf.getToy(type);
        toy.talk();
    }
}
