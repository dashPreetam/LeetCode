package MapSumPairs_677;
/*

 * Date : 30/07/21

 * Author : SWASTIK PREETAM DASH

 */

import java.util.HashMap;
import java.util.Set;

public class MapSum {

    HashMap<String,Integer> map;

    /** Initialize your data structure here. */
    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        Set<String> keys = map.keySet();
        int res = 0;
        for (String key : keys) {
            if(prefix.length()<=key.length()&&key.substring(0,prefix.length()).equals(prefix))
                res+=map.get(key);
        }
        return res;
    }
}
