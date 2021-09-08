package BookOrderingSystem;

public class BookDecorator implements Book{
    private Book decoratedBook;

    public BookDecorator(Book decoratedBook) {
        this.decoratedBook = decoratedBook;
    }
    
    @Override
    public double getPrice(){
       return decoratedBook.getPrice(); 
    }
    
    @Override
    public String getDesc(){
       return decoratedBook.getDesc(); 
    }
}
