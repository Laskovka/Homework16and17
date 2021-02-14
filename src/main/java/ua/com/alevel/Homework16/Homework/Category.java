package ua.com.alevel.Homework16.Homework;

public class Category {
    private String name;
    private Long categoryId;

    Category(String name, Long categoryId) {
        this.name = name;
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public Long getCategoryId() {
        return categoryId;
    }
}
