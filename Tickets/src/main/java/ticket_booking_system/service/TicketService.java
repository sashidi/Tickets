package ticket_booking_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket_booking_system.model.Ticket;
import ticket_booking_system.model.Ticket;
import tickets.TicketRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    public final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Optional<Ticket> getTicketById(int id) {
        return ticketRepository.findById(String.valueOf(id));
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public void deleteTicketById(int id) {
        ticketRepository.deleteById(String.valueOf(id));
    }

}
