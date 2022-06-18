package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> airportMap = new LinkedHashMap<Integer,String>();
        airportMap.put(1000, "BLR");
        airportMap.put(1001, "MUM");
        airportMap.put(1002, "GOA");  
        System.out.println(airportMap);
        Set<Integer> airportKeySet = airportMap.keySet();
        System.out.println(airportKeySet);

        List<String> airportList = new ArrayList<String>();
        for(String airport : airportMap.values()) {
            airportList.add(airport);
        }
        System.out.println(airportList);
        Iterator<String> itr = airportList.iterator();
        //Iterator<DataType> itr = ListName.iterator();
         while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
