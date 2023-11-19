import java.awt.image.ImageProducer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Реализуйте структуру HashMap,
        //где ключ - цена товара, значение - наименование товара.
        //Просмотрите добавление товаров с одинаковой ценой,
        //а также порядок товаров при выводе коллекции.
        HashMap<String, String> mag = new HashMap<>();
        mag.put("1 byn","Йогурт");
        mag.put("1 byn","Ряженка");
        mag.put("2 byn","Кефир");
        mag.put("3 byn","Молоко");
        mag.put("4 byn","Хлеб");
        mag.put("4 byn","Батон");
        mag.put("5 byn","Конфеты");
        mag.put("6 byn","Сок");
        mag.put("7 byn","Макароны");
        mag.put("8 byn","Мясо");
        mag.put("8 byn","Чипсы");
        mag.put("9 byn","Алкоголь");
        System.out.println(mag);
    }
}