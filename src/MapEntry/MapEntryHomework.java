package MapEntry;

import java.util.HashMap;
import java.util.Map;

public class MapEntryHomework {
    static void main() {
        HashMap<String, Integer> scores = new HashMap<>();

        //Putting keys and values

        scores.put("Bora", 90);
        scores.put("Sarper", 85);
        scores.put("Okan", 100);
        scores.put("Hilal", 95);
        scores.put("Ali", 75);
        scores.put("Uğur", 80);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + "= " + entry.getValue());
        }
    }
}
