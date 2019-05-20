package baseconverter;

import java.util.ArrayList;
import java.util.List;

public class GetPower {
    public static List<Integer> getPowers(int length, int base){
        ArrayList<Integer> listOfPowers=new ArrayList<Integer>();
        int i=0;
        while(i<length){
            int power=((int)(Math.pow(base,i)));
            listOfPowers.add(power);
            i++;
        }
        return listOfPowers;
    }
}
