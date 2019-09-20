package books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.net.InetAddress;



@RestController
public class BooksController {


    private static final Book[] books = {
        new Book(1L, "Nemesis", "hostname1"),
        new Book(2L, "Great Expectations", "hostname2"),
        new Book(3L, "The Chronicles of Narnia", "hostname3")
    };

    @GetMapping("/loans")
    public Book[] books() {
        return books;
    }

    @GetMapping("/loans/{loan_id}")
    public Book book(@PathVariable int loan_id) throws Exception{
        for (Book book : books) {
            if (book.getLoan_id() == loan_id) {
                return book;
            }
        }
        InetAddress inetAddress = InetAddress.getLocalHost();
        Book book = new Book(9L, "FannieMae", inetAddress.getHostAddress());
        return book;
    }

}