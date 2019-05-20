package baseconverter;
import java.util.ArrayList;
import java.util.List;

public class DotProduct {
    public static List<Integer> getProduct(List<Integer> digit, List<Integer> powers){
        ArrayList<Integer>Product=new ArrayList<Integer>();
        int j=0;
        while(j<digit.size()){
            Product.add(digit.get(j)*powers.get(j));
            j++;
        }
        return Product;
    }
}
