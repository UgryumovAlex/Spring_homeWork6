package ru.geekbrains.hw6.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.geekbrains.hw6.entities.Product;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class ProductsRepository {

    public List<Product> getProducts() {
        return new ArrayList<>();
    }

    public List<Product> getMinProducts() {
        return new ArrayList<>();
    }

    public List<Product> getMaxProducts() {
        return new ArrayList<>();
    }

    public List<Product> getMinMaxProducts() {
        return new ArrayList<>();
    }

    public List<Product> getProductsByPage(int pageNum) {
        return new ArrayList<>();
    }
}
