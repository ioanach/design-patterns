import src.behavioural.Request;
import src.behavioural.RequestToCancel;
import src.behavioural.RequestToPay;
import src.behavioural.RequestToRefund;
import src.creational.Event;
import src.creational.EventFactory;
import src.creational.Serbare;
import src.creational.Untold;
import src.structural.Account;
import src.structural.AccountProxy;

/**
 * You can write good code without using design patterns
 * please don't force design patterns :)
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

        //-----creational patterns

        //without Factory
//        Event event  = createEventNoFactory("Untold");
//        if(event!= null){
//            event.attend();
//        }

//        //with Factoru
//        EventFactory eventFactory = new EventFactory();
//        Event event= eventFactory.createEvent("balulcopilariei");
//        if(event!= null){
//            event.attend();
//        }

        //-----Structural patterns

        Account myAccount = new Account("BT");
//        without proxy
//        myAccount.deposit(100);
//        myAccount.withdraw(200);
//        System.out.println(myAccount.getMoneyAvailable());
        //with proxy
//        AccountProxy accountProxy = new AccountProxy(myAccount);
//        accountProxy.deposit(100);
//        accountProxy.withdraw(50);
//        System.out.println(accountProxy.getMoneyAvailable());

        //------Behavioural patterns

        Request userRequestToPay = new RequestToPay("RequestToPay");
//          userRequestToPay.submit(100);
        Request userRequestToCancel = new RequestToCancel("RequestToCancel");
//         userRequestToCancel.submit(0);
        Request shopRequestToRefund = new RequestToRefund("RequestToRefund");
         shopRequestToRefund.submit(100);

    }

    public static Event createEventNoFactory(String eventName) {
        if ("Untold".equals(eventName)) {
            return new Untold();
        } else if ("Serbare".equals(eventName)) {
            return new Serbare();
        } else {
            System.out.println("Event not defined!");
            return null;
        }
        //for a new type of event / a new class, I would need to "grow" the if
        // and maybe even duplicate this code here
    }

}
