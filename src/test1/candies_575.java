package test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class candies_575 {
    public int distributeCandies(int[] candies){
        int result;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer candy : candies) {
            if(map.containsKey(candy)){
                map.put(candy, (map.get(candy) + 1));
            }
            map.put(candy, 1);
        }

        int k = candies.length / 2;
        if(k < map.keySet().size()) {
            result = k;
        } else {
            result = map.keySet().size();
        }

        return result;
}

    public static void main(String[] args) {
        int[] candyyy=new int[100];
        for (int i = 0; i < candyyy.length; i++) {
            candyyy[i] = (int) (Math.random() * 50) + 1;
        }
        candies_575 can=new candies_575();

        int result = can.distributeCandies(candyyy);
        System.out.println(result);
    }


}