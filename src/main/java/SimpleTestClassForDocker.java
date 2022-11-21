import java.util.Map;
import java.util.TreeMap;

public class SimpleTestClassForDocker {

    public static void main(String[] args) {
        System.out.println("test class ran");

        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("this",1);
        treeMap.put("is",4);
        treeMap.put("test",6);

        for (Map.Entry<String,Integer> entry : treeMap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}
