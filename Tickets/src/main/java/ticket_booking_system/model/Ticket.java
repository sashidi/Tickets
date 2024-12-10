package ticket_booking_system.model;
import jdk.jfr.Event;

import java.math.BigDecimal;

public class Ticket {
    private int ticketId;
    private Event event;
    private String seatNumber;
    private BigDecimal ticketPrice;

    public Ticket(int ticketId, Event event) {
        this.ticketId = ticketId;
        this.event = event;
        this.ticketPrice = ticketPrice;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}