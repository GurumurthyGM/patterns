package factory;

public class TicketMachine {

    public Ticket getTicket(String type) {
        switch (type){
            case "BUSS":
                return new BusTicket();
            case "TRAIN":
                return new TrainTicket();
            default:
                return null;
        }
    }
}
