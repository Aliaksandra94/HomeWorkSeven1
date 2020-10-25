/*      (обязательное): В main:
        • получаем список товаров из магазина, сортируем по порядку
        добавления(последние добавленные в начале) и выводим в консоль.
        •??? редактируем один товар
        • получаем список товаров и выводим в консоль

 */
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Goods apple = new Goods("Яблоко", 3);
        Goods orange = new Goods("Апельсин", 5);
        Goods peach = new Goods("Персик", 7);
        Goods mango = new Goods("Манго", 9);
        Goods mango2 = new Goods("Манго", 9);
        shop.add(peach);
        shop.add(orange);
        shop.add(apple);
        shop.add(mango);
        shop.add(mango2);
        shop.showGoods();
        shop.delete(apple.getId());
        shop.showGoods();
        System.out.println(" ");
shop.sortByPrice();
shop.showGoods();


    }
}
