package bt06;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager bookMana = new BookManager();
        while (true){
            System.out.println("1. Thêm sách ");
            System.out.println("2. Hiển thị sách ");
            System.out.println("3. Xóa sách ");
            System.out.println("4. Thoát ");
            System.out.print("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            byte opt = scanner.nextByte();
            scanner.nextLine();
            switch (opt){
                case 1:
                    System.out.print("Nhập tiêu đề: ");
                    String inputTitle = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String inputAuthor = scanner.nextLine();
                    System.out.print("Nhập ISBN: ");
                    String inputIsbn = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int inputYear = scanner.nextInt();
                    scanner.nextLine();
                    Book book = new Book(inputTitle, inputAuthor, inputIsbn, inputYear);
                    bookMana.addBook(book);
                    System.out.println("");
                    break;
                case 2:
                    bookMana.displayBooks();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Nhập ISBN sách cần xóa: ");
                    String deleteISBN = scanner.nextLine();
                    bookMana.removeBook(deleteISBN);
                    System.out.println("");
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.print("Chọn từ 1 đến 4!!!");
                    break;
            }
        }
    }
}
