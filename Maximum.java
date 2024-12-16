public class Maximum {

    // Метод для нахождения максимума из четырех целых чисел
    public static int findMaximum(int a, int b, int c, int d) {
        int max = a; // Предполагаем, что максимум - первое число
        if (b > max) {
            max = b; // Обновляем максимум, если b больше текущего
        }
        if (c > max) {
            max = c; // Обновляем максимум, если c больше текущего
        }
        if (d > max) {
            max = d; // Обновляем максимум, если d больше текущего
        }
        return max; // Возвращаем найденный максимум
    }

    public static void main(String[] args) {
        // Пример вызова метода
        int a = 5, b = 12, c = 8, d = 7;
        int max = findMaximum(a, b, c, d);
        System.out.println("Максимальное число: " + max);
    }
}