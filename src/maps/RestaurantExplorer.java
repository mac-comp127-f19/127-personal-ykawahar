package maps;

import java.util.HashMap;
import java.util.Map;

public class RestaurantExplorer {
    public static void main(String [] args) {
        // Step 1. Create a new empty HashMap.
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.

        Map<String, Restaurant> restaurantMap = new HashMap<>();

        // Step 2. Add five restaurants to the map (hint: use put()).

        restaurantMap.put("Lumiere's", new Restaurant("Lumiere's", "french", 5));
        restaurantMap.put("Cabanas", new Restaurant("Cabanas", "buffet", 4));
        restaurantMap.put("Animator's Palate", new Restaurant("Animator's Palate", "pacific-asian fusion", 5 ));
        restaurantMap.put("Vanellope's Sweets & Treats", new Restaurant("Vanellope's Sweets & Treats", "desserts", 3));

        // Step 3. Print the names of each restaurant (hint: use keySet()).
        System.out.println(restaurantMap.keySet());
        for (String restaurantName : restaurantMap.keySet()) {
            System.out.println(restaurantName);
        }

        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).
        if (restaurantMap.containsKey("Cabanas")) {
            restaurantMap.remove("Cabanas");
        }
        System.out.println(restaurantMap.keySet());
        // Step 5. Print the restaurant objects (hint: use values())
        for (Restaurant restaurant : restaurantMap.values())
            System.out.println(restaurant);

        // Step 6. Print the restaurant names and objects (hint: use entrySet()).
        for (Map.Entry e : restaurantMap.entrySet())
            System.out.println(e);
    }
}
