package main.prototype.deepPrototype;

public class DeepFood implements Cloneable {

    private String name;

    @Override
    public DeepFood clone() throws CloneNotSupportedException {
        return (DeepFood) super.clone();
    }

    public DeepFood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeepFood{" +
                "name='" + name + '\'' +
                '}';
    }
}
