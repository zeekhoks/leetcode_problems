package data_structures.BinarySearch;

import java.util.*;

class TimeMap {

    Map<String, List<Pair>> map;

    public TimeMap(String key, String value, int timestamp) {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            map.get(key).add(new Pair(value, timestamp));
        } else {
            List<Pair> list = new ArrayList<>();
            list.add(new Pair(value, timestamp));
            map.put(key, list);
        }
    }

    public String get(String key, int timestamp) {
        String result = "";

        if (map.containsKey(key)) {
            List<Pair> list = map.get(key);
            int left = 0, right = list.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (list.get(mid).b == timestamp) {
                    return list.get(mid).a;
                } else if (list.get(mid).b < timestamp) {
                    result = list.get(left).a;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return result;
    }

    public class Pair {
        String a;
        int b;

        public Pair(String a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    
}
