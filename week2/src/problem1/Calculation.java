package problem1;

public class Calculation extends Calculator {

    Calculation(double num1, double num2) {
        super(num1, num2);
    }

    public String toString(){
        return "the sum is "+ sum() + "\nthe difference is " + difference()+
                "\nthe product is " + multiply() + "\nthe ratio is " + ratio();
    }
}
