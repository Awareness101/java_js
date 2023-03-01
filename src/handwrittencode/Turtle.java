package handwrittencode;

public class Turtle {
    int age;

    public Turtle(int age) {
        this.age = age;
    }
    public Turtle(){

    }

    @Override
    public String toString() {
        return "Turtle age："+age+"  years old";
    }
}
