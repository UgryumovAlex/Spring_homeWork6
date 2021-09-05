package ru.geekbrains.hw6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.hw6.entities.Product;
import ru.geekbrains.hw6.repositories.ProductsRepository;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getProducts() {
        return productsRepository.getProducts();
    }

    public List<Product> getMinProducts() {
        return productsRepository.getMinProducts();
    }

    public List<Product> getMaxProducts() {
        return productsRepository.getMaxProducts();
    }

    public List<Product> getMinMaxProducts() {
        return productsRepository.getMinMaxProducts();
    }

    public List<Product> getProductByPage(int pageNum) {
        return productsRepository.getProductsByPage(pageNum);
    }
}
