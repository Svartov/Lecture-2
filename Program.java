public class Program {

    public static void main(String[] args) {

        // Создаём переменные для цены, количества, и общего счёта.
        int price = 2; // цена за одно яблоко = 2$
        int apple = 6; // всего яблок = 6
        int sum;

        // Получаем сумму путём умножения цены на количество
        sum = price * apple;

        // Выводим на консоль результат
        System.out.println("Сумма: " + sum);

    }
}
