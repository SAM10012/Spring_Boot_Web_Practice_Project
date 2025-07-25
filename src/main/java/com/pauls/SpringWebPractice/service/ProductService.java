package com.pauls.SpringWebPractice.service;

import com.pauls.SpringWebPractice.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    // For now, creating list of products manually as we have not integrated Database yet.

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"IPhone",80000),
            new Product(102, "Canon Camera", 50000)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductbyID(int prodID) {
        //return products.stream().filter(p -> p.getProdId() == prodID).findFirst().get();
        return products.stream().filter(p -> p.getProdId() == prodID).findFirst().orElse((
                new Product(100, "No Item Found", 0)));
    }


    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {

        int index = 0;

        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getProdId() == prod.getProdId())
            {
                index = i;
            }
        }

        products.set(index,prod);
    }

    public void deleteProduct(int prodID) {

        int index = 0;

        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getProdId() == prodID)
            {
                index = i;
            }
        }

        products.remove(index);
    }
}
