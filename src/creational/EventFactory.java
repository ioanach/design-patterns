package src.creational;

public class EventFactory {
    public Event createEvent(String eventName) {
        if("Untold".equalsIgnoreCase(eventName)) {
            return new Untold();
        }
        if ("BalulCopilariei".equalsIgnoreCase(eventName)) {
            return new BalulCopilariei();
        }
        System.out.println("This event does not exist");
        return null;
    }
}
