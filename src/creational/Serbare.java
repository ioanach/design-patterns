package src.creational;

public class Serbare extends Event {
    public Serbare() {
        setName("Serbare");
    }

    private void playGames() {
        System.out.println("Games happening");
    }

    private void peoplePresent() {
        System.out.println("Kids present");
    }


    @Override
    public void attend() {
        System.out.println("Attending event: " + getName());
        playGames();
        peoplePresent();
    }
}
