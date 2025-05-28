package bt05;

import java.util.ArrayList;
import java.util.List;

public class CategoryManagement implements ICRUD {
    private List<Category> categories = new ArrayList<>();

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public void addCategory(Category category) {
        this.categories.add(category);
        System.out.println("Danh mục đã được thêm");
    }

    @Override
    public void updateCategory(Category category) {
        for(Category cat : categories){
            if(cat.getId() == category.getId()){
                cat.setName(category.getName());
                cat.setDescription(category.getDescription());
                System.out.println("Danh mục đã được cập nhật.");
            }
        }
    }

    @Override
    public void deleteById(int id) {
        boolean isFound = false;
        for(Category cat : categories){
            if(cat.getId() == id){
                categories.remove(cat);
                isFound = true;
                System.out.println("Danh mục đã được xóa.");
                break;
            }

        }
        if(!isFound){
            System.out.println("Danh mục không tồn tại");
        }
    }



}
