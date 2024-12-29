package lab3;

public class task08 {
    public static void main(String[] args) {
        int size = 10;
        char[] array = new char[size];
        int index = 0; // Индекс для заполнения массива
        // Заполнение массива согласными буквами
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            // Проверка, является ли буква согласной
            if (letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U') {
                array[index] = letter; // Присваиваем согласную букву
                index++; // Увеличиваем индекс
            }
            // Прерываем цикл, если массив заполнен
            if (index >= size) {
                break;
            }
        }
        // Вывод содержимого массива
        System.out.println("Содержимое массива:");
        for (char c : array) {
            System.out.print(c + " ");
        }
    }
}