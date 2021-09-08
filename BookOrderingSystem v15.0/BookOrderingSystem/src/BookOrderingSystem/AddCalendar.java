package BookOrderingSystem;

public class AddCalendar extends BookDecorator {

    private final double calendarPrice = 6;
    private Book book;

    public AddCalendar(Book book) {
        super(book);
        this.book = book;
    }

    @Override
    public double getPrice() {
        return (book.getPrice() + calendarPrice);
    }

    @Override
    public String getDesc() {
        return book.getDesc() + String.format("%-15s%20.2f\n", "  -Calendar", calendarPrice);
    }
}
