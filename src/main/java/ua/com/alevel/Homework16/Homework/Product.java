package ua.com.alevel.Homework16.Homework;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private Category category;

    Product(String name, BigDecimal price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", category.Name=" + category.getName() + ", category.Id=" + category.getCategoryId() +
                "}\n";
    }
}
