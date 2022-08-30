public class СarPetrol {

    public static void main(String[] args) {

        // Создаём переменные, Цена, Расход, сумма.
        float price = 1.2F; // Цена за 1л
        float consumption = 8F; // Расход на 100км.
        float sum;

        sum = 100 / consumption; // Узнаём сколько проедет автомобиль на одном литре.
        sum = 120 / sum; // Узнаём сколько нам надо литров на данное растояние.
        sum = sum * price; // Умножаем количество литров на стоимость бензина.

        // Выводим результат на экран.
        System.out.println(sum);
    }
}
