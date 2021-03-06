package ru.geekbrains.hw6.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.hw6.entities.Product;

import java.util.List;


@Repository
public interface ProductsRepository extends CrudRepository<Product, Long> {

    List<Product> findAll();
    List<Product> findAllByPriceLessThanOrderByPrice(int min);
    List<Product> findAllByPriceGreaterThanOrderByPrice(int max);
    List<Product> findAllByPriceBetweenOrderByPrice(int min, int max);
}
