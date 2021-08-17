import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        String[] strArr = str.split(" ");
        for (String ch : strArr) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else hm.put(ch, 1);
        }
        for (Map.Entry entry : hm.entrySet()) {
            int i = (int) entry.getValue();
            if (i == 1) System.out.print(entry.getKey() + " ");
        }
    }
}
