import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
    static void duplicateCharInString(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
            } else {
                count.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> mapElement : count.entrySet()) { // iterating through the unordered map
            if (mapElement.getValue() > 1) // if the count of characters is greater than 1 then duplicate found
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
        }
    }

    public static void main(String[] args) {
        duplicateCharInString("Kaushal");
    }
}
