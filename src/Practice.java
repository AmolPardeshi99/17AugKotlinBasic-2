import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i=0; i<10; i++) list.add(sc.next());
        String country = sc.next();
        if (list.contains(country)) System.out.println("Country Found");
        else System.out.println("Country not found");
    }
}
