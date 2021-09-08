package BookOrderingSystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
   private List<Book> books = new ArrayList<>();
   private int itemCount=0;

   public void addBook(Book book){
      books.add(book);
      itemCount++;
   }

   public double getTotalPrice(){
      double totalPrice = 0.0;
      
      for (Book book : books) {
         totalPrice += book.getPrice();
      }		
      return totalPrice;
   }

   public String showBooks(){
      StringBuilder booklist = new StringBuilder(); 
      int i = 1;
      for (Book book : books) {
         booklist.append("\n Book Item #").append(i).append("  ");
         booklist.append(book.getDesc()); 
         booklist.append(String.format("%35s\n%29s%6.2f\n","-----","Sub-total (RM):",book.getPrice()));
         i++;
      }		
      return booklist.toString();
   }
   
   public int getItemCount(){
       return itemCount;
   }
   
   
}
