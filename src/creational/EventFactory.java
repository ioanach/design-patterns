package src.creational;

/**
 * Encapsulates the logic related to the creation of events
 * centralises it : it's all in just this place
 * this class has only one responsibility: it creates events
 */
public class EventFactory {
    public Event createEvent(String eventName) {
        if ("Untold".equalsIgnoreCase(eventName)) {
            return new Untold();
        }
        if ("Serbare".equalsIgnoreCase(eventName)) {
            return new Serbare();
        }
        System.out.println("This event does not exist");
        return null;
    }
}
