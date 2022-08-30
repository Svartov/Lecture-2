public class СarPetrol {

    public static void main(String[] args) {

        // Создаём переменные, Цена, Расход, сумма.
        double price = 1.2; // Цена за 1л
        double consumption = 8; // Расход на 100км.
        double sum;

        sum = 100 / consumption; // Узнаём сколько проедет автомобиль на одном литре.
        sum = 120 / sum; // Узнаём сколько нам надо литров на данное растояние.
        sum = sum * price; // Умножаем количество литров на стоимость бензина.

        // Выводим результат на экран.
        System.out.println(sum);
    }
}
