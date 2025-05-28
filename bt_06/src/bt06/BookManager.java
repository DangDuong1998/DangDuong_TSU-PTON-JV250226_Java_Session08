package bt06;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements IBookManager {
    List<Book> bookList = new ArrayList<>();

    @Override
    public void addBook(Book book) {
            this.bookList.add(book);
            System.out.println("Sách đã được thêm");
    }

    @Override
    public void removeBook(String isbn) {
        boolean isFound = false;
        for(Book book : bookList){
            if(book.getIsbn().equals(isbn) ){
                bookList.remove(book);
                isFound = true;
                System.out.print("Đã xóa sách với ISBN: " + isbn);
                break;
            }
        }
        if(!isFound){
            System.out.println("Không tìm thấy!!");
        }
    }

    @Override
    public void displayBooks() {
        for(Book book : bookList){
            System.out.println(book.getDetails());
        }
    }
}
