package HW5java.ex3;

import java.util.HashMap;
class ShoppingBasket {
    private HashMap<String, Integer> basket = new HashMap<>();
    // Метод для добавления продукта в корзину
    public void addProduct(String product, Integer quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + quantity);
        } else {
            basket.put(product, quantity);
        }
    }
    // Метод для удаления продукта из корзины
    public void removeProduct(String product) {
        if (basket.containsKey(product)) {
            basket.remove(product);
        }
    }
    // Метод для обновления количества продукта в корзине
    public void updateQuantity(String product, Integer quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, quantity);
        }
    }
    // Метод для проверки количества продукта в корзине
    public int checkProduct(String product) {
        return basket.getOrDefault(product, 0);
    }
    // Метод для вывода всех продуктов и их количества
    public void showBasket() {
        if (basket.isEmpty()) {
            System.out.println("Basket is empty.");
        } else {
            for (HashMap.Entry<String, Integer> entry :
                    basket.entrySet()) {
                System.out.println(entry.getKey() + " - " +
                        entry.getValue());
            }
        }
    }
}
