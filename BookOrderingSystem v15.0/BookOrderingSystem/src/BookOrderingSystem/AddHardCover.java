package BookOrderingSystem;

public class AddHardCover extends BookDecorator {

    private Book book;
    private final double hardCoverPrice = 8;
    int choice;

    public AddHardCover(Book book, int choice) {
        super(book);
        this.book = book;
        this.choice = choice;
    }

    @Override
    public double getPrice() {
        if (choice != 1) {
            return (book.getPrice() + hardCoverPrice);
        }
            return book.getPrice();
    }

    @Override
    public String getDesc() {
        if (choice == 2) {
            return book.getDesc() + String.format("%-15s%20.2f\n", "  -Hard Cover", hardCoverPrice);
        }
        return book.getDesc() + String.format("%-15s%20s\n", "  -Paperback", " - ");
    }
}
