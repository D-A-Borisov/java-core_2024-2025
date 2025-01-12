package lab4;
public class task07 {
        public static void main(String[] args) {
            int height = 5;
            int length = 5;
            int[][] array = new int[height][length];
            int value = 1; // Начальное значение для заполнения
            for (int i = 0; i < height; i++) {
                if (i % 2 == 0) {
                    // Заполняем строку слева направо
                    for (int j = 0; j < length; j++) {
                        array[i][j] = value++;
                    }
                } else {
                    // Заполняем строку справа налево
                    for (int j = length - 1; j >= 0; j--) {
                        array[i][j] = value++;
                    }
                }
            }
            System.out.println("Массив, заполненный «змейкой»:");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }
}