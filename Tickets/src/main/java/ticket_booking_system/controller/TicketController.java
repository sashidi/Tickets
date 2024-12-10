package ticket_booking_system.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticket_booking_system.model.Ticket;
import ticket_booking_system.service.TicketService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ticlets")

public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/{id}")
    public Optional<Ticket> getTicketById(@PathVariable int id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping
    public Optional<Ticket> addTicket(@RequestBody Ticket ticket) {
        return ticketService.getTicketById(ticket.getTicketId());
    }

    @DeleteMapping("/{id}")
    public String deleteTicket(@PathVariable int id) {
        ticketService.deleteTicketById(id);
        return "Ticket with ID+id+deleted successfully!";
    }
}
