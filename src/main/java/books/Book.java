package books;

public class Book {

    private final long loan_id;
    private final String lender_name;
    private final String hostname;


    public Book(Long loan_id, String lender_name, String hostname) {
        this.loan_id = loan_id;
        this.lender_name = lender_name;
        this.hostname = hostname;
    }

    public long getLoan_id() {
        return this.loan_id;
    }

    public String getLender_name() {
        return this.lender_name;
    }

    public String getHostname() {
        return this.hostname;
    }
}