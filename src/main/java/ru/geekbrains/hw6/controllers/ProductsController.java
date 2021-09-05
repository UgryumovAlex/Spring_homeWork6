package ru.geekbrains.hw6.controllers;

import org.springframework.web.bind.annotation.*;
import ru.geekbrains.hw6.entities.Product;
import ru.geekbrains.hw6.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/products")
public class ProductsController {

    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    /**Отображение всего списка продуктов*/
    @GetMapping("/list")
    public String showProducts(Model uiModel) {
        uiModel.addAttribute("products", productsService.getProducts());
        return "products";
    }

    @GetMapping("/minCost")
    public String showMinProducts(Model uiModel) {
        uiModel.addAttribute("products", productsService.getMinProducts());
        return "products";
    }

    @GetMapping("/maxCost")
    public String showMaxProducts(Model uiModel) {
        uiModel.addAttribute("products", productsService.getMaxProducts());
        return "products";
    }

    @GetMapping("/minMaxCost")
    public String showMinMaxProducts(Model uiModel) {
        uiModel.addAttribute("products", productsService.getMinMaxProducts());
        return "products";
    }

    @GetMapping("/page")
    public String showProduct(Model uiModel, @RequestParam("pageNum") int pageNum) {
        uiModel.addAttribute("products", productsService.getProductByPage(pageNum));
        return "products";
    }

}

