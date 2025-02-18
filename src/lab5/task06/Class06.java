package lab5.task06;
public class Class06 {
    private int max, min;
    public void setMaxAndMin(int number) {
        if (this.max < number) {
            this.max = number;
        } else if (this.min < number) {
            this.min = number;}
    }
    public void setMaxAndMin(int number1, int number2) {
        int max_number;
        int min_number;
        if (number1 > number2) {
            max_number = number1;
            min_number = number2;
        } else {
            max_number = number2;
            min_number = number1;
        }
        if (this.max < max_number) {
            this.max = max_number;
            if (this.min < min_number) {
                this.min = min_number;
            }
        } else if (this.min < max_number) {
            this.min = max_number;
        }
    }
    public void showMaxMin() {
        System.out.printf("\nmax: %d\nmin: %d", this.max, this.min);
    }
}