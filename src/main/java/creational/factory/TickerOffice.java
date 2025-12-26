package creational.factory;

public class TickerOffice {

    static TicketMachine tm = new TicketMachine();

    public static void main(String[] args) {

        getBusTicket();
        getTrainTicket();
        getFlightTicker();
    }

    static void getBusTicket() {
        System.out.println("Taking Buss ticket : " + tm.getTicket("BUS").getPrice());
    }

    static void getTrainTicket() {
        System.out.println("Taking Trains ticket : " + tm.getTicket("TRAIN").getPrice());
    }

    static void getFlightTicker(){
        System.out.println("Taking Flights ticket : " + tm.getTicket("FLIGHT").getPrice());
    }
}
