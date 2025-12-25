package factory;

public class TicketMachine {

    public Ticket getTicket(String type) {
        switch (type){
            case "BUS":
                return new BusTicket();
            case "TRAIN":
                return new TrainTicket();
            default:
                return null;
        }
    }
}
