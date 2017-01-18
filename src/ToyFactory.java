/**
 * Your object will be instantiated and called as such:
 * ToyFactory tf = new ToyFactory();
 * Toy toy = tf.getToy(type);
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
        if (type == "Dog") {
            toy = new Dog();
            return toy;
        } else if (type == "Cat") {
            toy = new Cat();
            return toy;
        } else {
            return toy;
        }
    }

    public static void main(String[] args) {
        String type="Dog";
        ToyFactory tf = new ToyFactory();
        Toy toy = tf.getToy(type);
        toy.talk();
    }
}
