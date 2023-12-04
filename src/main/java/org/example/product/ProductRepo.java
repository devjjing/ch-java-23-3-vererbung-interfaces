package org.example.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ProductRepo {

    private List<Product> productList;

    public ProductRepo(List<Product> productList) {
        this.productList = productList;
    }

    public ProductRepo() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public Optional<Product> findProductById(int productId) {
        return productList.stream()
                .filter(product -> product.id() == productId)
                .findFirst();
    }

    public void updateProduct(Product updatedProduct) {
        int index = productList.indexOf(updatedProduct);
        if (index != -1) {
            productList.set(index, updatedProduct);
            System.out.println("Produkt aktualisiert: " + updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    public List<Product> getProductList() {
        return productList;
    }


}
