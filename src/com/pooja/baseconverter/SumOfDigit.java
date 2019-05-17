package com.pooja.baseconverter;

import java.util.List;

public class SumOfDigit {
    public static int getTotal(List<Integer>Product){
        int i=0,total=0;
        while (i<Product.size()){
            total+=Product.get(i);
            i++;
        }return total;
    }
}
