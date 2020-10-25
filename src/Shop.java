/*•     • редактировать товар(принимает объект товара и редактирует им список
        товаров)

 */

import java.util.*;

public class Shop {
    private Goods good;
    private Map<Integer, Goods> list = new HashMap<>();
    private ArrayList<Integer> listID = new ArrayList<>();
    private ArrayList<Integer> listPrice = new ArrayList<>();

    public void add(Goods good) {
        /*if (list.isEmpty()) {
            list.put(good.getId(), good);
            listID.add(good.getId());
        } else {
            for (int i = 0; i < listID.size(); i++){
                if (listID.get(i).equals(good.getId())){
                    continue;
                } else {
                    list.put(good.getId(), good);
                    listID.add(good.getId());
                }
            }
        }
         */
        list.putIfAbsent(good.getId(), good);
    }

    public void showGoods() {
        for (Map.Entry<Integer, Goods> pair : list.entrySet()) {
            Goods value = pair.getValue();                  //значение
            System.out.println(value.toString());
        }
    }

    public void delete(int id) {
        list.remove(id);
    }

    public void edit(Goods good) {
    }

    public void sortByPrice() {
        for (Map.Entry<Integer, Goods> pair : list.entrySet()) {
            Goods price = pair.getValue();                  //значение
            listPrice.add(price.getPrice());
            listPrice.stream().sorted();
        }
    }
}
