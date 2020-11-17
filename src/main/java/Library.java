import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }


    public int stockCount(){
        return this.stock.size();
    }

    public void addBook(Book book){
        if (libraryCanAcceptBook()) {
            this.stock.add(book);
        }
    }

    public boolean libraryCanAcceptBook(){
        return this.stockCount() < this.capacity;
    }

}
