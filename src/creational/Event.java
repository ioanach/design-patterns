package src.creational;

/**
 * Creational patterns --> have to do with..creating objects in different ways
 */
public abstract class Event {
    private String name;

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    abstract public void attend();

}
