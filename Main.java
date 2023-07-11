import src.creational.BalulCopilariei;
import src.creational.Event;
import src.creational.EventFactory;
import src.creational.Untold;
import src.structural.Account;
import src.structural.AccountProxy;

/**
 * You can write good code without using design patterns
 * please don't force design patters :)
 * Code should be reusable, extensible and EASY TO READ
 * *
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("Q1: What are design patterns?");
//        System.out.println("A1: Solutions to repetitive problems");
//        System.out.println("Q2: What is Gof?");
//        System.out.println("A2: The 4 authors that wrote the initial book on design patterns");
//        System.out.println("Q3: What are the categories for design patterns?");
//        System.out.println("A3: a. Creational; b. Structural; c. Behavioural");

        //creational patterns
        Event event  = createEventFactory("untold");
        if(event!= null){
            event.attend();
        }

        //Structural patterns
        Account myAccount = new Account("BT");
        //without proxy
//        myAccount.deposit(100);
//        myAccount.withdraw(50);
//        System.out.println(myAccount.getMoneyAvailable());
        //with proxy
//        AccountProxy accountProxy = new AccountProxy(myAccount);
//        accountProxy.deposit(100);
//        accountProxy.withdraw(200);
//        System.out.println(accountProxy.getMoneyAvailable());

    }

    public static Event createEventNoFactory(String eventName){
        if("Untold".equals(eventName)){
            return new Untold();
        } else if ("BalulCopilariei".equals(eventName)) {
            return new BalulCopilariei();
        } else{
            System.out.println("Event not defined!");
            return null;
        }
        //for a new type of event / a new class, i would need to "grow" the if
    }
    public static Event createEventFactory(String eventName) throws Exception{
        EventFactory eventFactory = new EventFactory();
        return eventFactory.createEvent(eventName);
    }
}
