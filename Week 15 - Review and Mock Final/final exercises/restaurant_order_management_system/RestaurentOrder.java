import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RestaurentOrder {
    public static double calculateTotalSales(Map<MenuItem, Integer> order) {
        double totalSales = 0.0;
        for (Map.Entry<MenuItem, Integer> entry : order.entrySet()) {
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();
            totalSales += item.calculateDiscountedPrice(quantity);
        }

        return totalSales;
    }
    
    public static void main(String[] args) {
        MenuItem friedRice = new ThaiFood("Fried Rice", 100.0);
        MenuItem sushi = new JapaneseFood("Sushi", 200.0);
        MenuItem tteokbokki = new KoreanFood("Tteokbokki", 150.0);

        Map<String, List<MenuItem>> menuByType = new HashMap<>();
        menuByType.put("ThaiFood", Arrays.asList(friedRice));
        menuByType.put("JapaneseFood", Arrays.asList(sushi));
        menuByType.put("KoreanFood", Arrays.asList(tteokbokki));

        Map<MenuItem, Integer> order = new LinkedHashMap<>();
        order.put(friedRice, 2);
        order.put(sushi, 4);
        order.put(tteokbokki,1);

        System.out.println("Order Summary:");
        for (Map.Entry<MenuItem, Integer> entry : order.entrySet()) {
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();
            String type = item.getClass().getSimpleName();
            System.out.println("- " + item.getName() + " (" + type + ") x " + quantity);
        }
        
        double total = calculateTotalSales(order);
        System.out.println("\nTotal sales after discountL: " + total + " baht");
    }
}
