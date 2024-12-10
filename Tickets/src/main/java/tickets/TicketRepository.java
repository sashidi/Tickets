package tickets;

import ticket_booking_system.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TicketRepository extends MongoRepository<Ticket,String>{
}
