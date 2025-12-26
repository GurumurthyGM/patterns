package creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {

    private static final Map<String, Supplier<Ticket>> ticketFactory = new HashMap<>();
    static {
        ticketFactory.put("BUS", BusTicket::new);
        ticketFactory.put("TRAIN", TrainTicket::new);
    }

    public Ticket getTicket(String type) {
        if (ticketFactory.containsKey(type)) {
            return ticketFactory.get(type).get();
        }else {
            throw new IllegalArgumentException("Ticket type not found");
        }
    }
}
