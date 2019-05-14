import java.util.List;

public class DotProduct {
    public static int getDotProduct(List<Integer> digit, List<Integer> powers){
        int dotProduct=0,j=0;
        while(j<digit.size()){
            dotProduct+=digit.get(j)*powers.get(j);
            j++;
        }
        return dotProduct;
    }
}
