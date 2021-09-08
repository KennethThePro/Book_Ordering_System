package BookOrderingSystem;

import java.time.LocalDate;

public abstract class Payment {
    private Cart cart;
    private static int invoiceNum=1000;
    Payment(Cart cart) {
        this.cart = cart;
    }

    public double grandtotal() {
        return cart.getTotalPrice();
    }
    
    public String generateReceipt(){
        String receiptHeader=String.format("\n\n%22s \n%15s %s \n%21s %s\n %6s %27s\n %15s %18s",
                                "Notebooks", "Date: ", LocalDate.now(),
                                "Invoice No.:",invoiceNum, "Item", "Price (RM)",
                                "---------------", "----------");
        StringBuilder receipt = new StringBuilder(receiptHeader);
        receipt = receipt.append(cart.showBooks());
        receipt = receipt.append(String.format("%35s\n%29s%6.2f","======","Grand total (RM):",grandtotal()));
        invoiceNum++;
        return receipt.toString();
    }
    
}
