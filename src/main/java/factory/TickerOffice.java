package factory;

public class TickerOffice {

    static TicketMachine tm = new TicketMachine();

    public static void main(String[] args) {

        getBusTicket();
        getTrainTicket();
    }

    static void getBusTicket() {
        System.out.println("Taking Buss ticket : " + tm.getTicket("BUSS").getPrice());
    }

    static void getTrainTicket() {
        System.out.println("Taking Trains ticket : " + tm.getTicket("TRAIN").getPrice());
    }
}
