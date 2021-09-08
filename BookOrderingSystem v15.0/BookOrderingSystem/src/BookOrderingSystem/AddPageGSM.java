package BookOrderingSystem;

public class AddPageGSM extends BookDecorator {

    private Book book;
    private final double _120GSMPrice = 5;
    int choice;

    public AddPageGSM(Book book, int choice) {
        super(book);
        this.book = book;
        this.choice = choice;
    }

    @Override
    public double getPrice() {
        if (choice != 1) {
            return (book.getPrice() + _120GSMPrice);
        }
        else
            return book.getPrice();
    }

    @Override
    public String getDesc() {
        if (choice == 2) {
            return book.getDesc() + String.format("%-15s%20.2f\n", "  -120gsm", _120GSMPrice);
        }
        return book.getDesc() + String.format("%-15s%20s\n", "  -80gsm", " - ");
    }
}
