package BookOrderingSystem;

public class AddCoverColor extends BookDecorator {

    private final String[] ColorArr = {"Black", "Blue", "Yellow", "Green", "Pink"};
    private Book book;
    int choice;

    public AddCoverColor(Book book, int choice) {
        super(book);
        this.book = book;
        this.choice = choice;
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }

    @Override
    public String getDesc() {
        return book.getDesc() + String.format("%3s%-12s%20s\n", "  -", ColorArr[choice - 1], " - ");
    }
}
