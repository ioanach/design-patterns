package src.creational;

public class Untold extends Event {
    public Untold() {
        setName("Untold");
    }

    private void listenToMusic() {
        System.out.println("Music happening");
    }

    private void peoplePresent() {
        System.out.println("Grown ups present");
    }

    @Override
    public void attend() {
        System.out.println("Attending event: " + getName());
        listenToMusic();
        peoplePresent();
    }
}
