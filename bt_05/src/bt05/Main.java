package bt05;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CategoryManagement catMana = new CategoryManagement();
        while (true){
            System.out.println("Menu:");
            System.out.println("1: Thêm danh mục");
            System.out.println("2: Hiển thị danh mục");
            System.out.println("3: Cập nhật danh mục");
            System.out.println("4: Xóa danh mục");
            System.out.println("5: Thoát");
            System.out.print("Nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            byte opt = scanner.nextByte();
            switch (opt){
                case 1:
                    System.out.print("Nhập ID danh mục: ");
                    int inputId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên danh mục: ");
                    String inputName = scanner.nextLine();
                    System.out.print("Nhập mô tả danh mục: ");
                    String inputDes = scanner.nextLine();
                    Category category = new Category(inputId,inputName,inputDes);
                    catMana.addCategory(category);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Danh sách danh mục:");
                    List<Category> allCat = catMana.findAll();
                    for(Category cat : allCat){
                        cat.display();
                    }
                    System.out.println("");
                    break;

                case 3:
                    int foundId = -1;
                    List<Category> allCatCase03 = catMana.findAll();
                    System.out.print("Nhập ID danh mục cần cập nhật: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine();
                    for(int i =0; i < allCatCase03.size();i++){
                        if(allCatCase03.get(i).getId() == findId ){
                            foundId = i;
                        }
                    }
                    if(foundId != -1){
                        Category fixCat = allCatCase03.get(foundId);
                        System.out.print("Nhập tên mới: ");
                        fixCat.setName(scanner.nextLine());
                        System.out.print("Nhập mô tả mới: ");
                        fixCat.setDescription(scanner.nextLine());
                        catMana.updateCategory(fixCat);
                    }
                    else{
                        System.out.println("Không tìm thấy danh mục cần cập nhật.");
                    }
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    catMana.deleteById(deleteId);
                    System.out.println("");
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Nhập từ 1 đến 5!");
                    System.out.println("");
                    break;
            }
        }


    }

}
