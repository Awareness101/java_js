package javaS;

import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) {
        // Method method = javaS.GetClassTest.getDeclaredMethod("getComputer");
    }
}

class  GetClassTest{
    private String computer;
    private String charger;
    private int num;

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    @Override
    public String toString() {
        return "GetClassTest{" +
                "computer='" + computer + '\'' +
                ", charger='" + charger + '\'' +
                ", num=" + num +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
