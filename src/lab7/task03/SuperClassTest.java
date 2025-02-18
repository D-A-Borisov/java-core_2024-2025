package lab7.task03;
public class SuperClassTest {
    public int number;
    SuperClassTest(int number) {
        this.number = number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "SuperClass: number = " + number;
    }
}