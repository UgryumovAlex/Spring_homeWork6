package ru.geekbrains.hw6.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.hw6.entities.Product;

import java.util.List;

@Repository
public interface ProductsPageRepository extends PagingAndSortingRepository<Product, Long> {
    List<Product> findAll();
}
