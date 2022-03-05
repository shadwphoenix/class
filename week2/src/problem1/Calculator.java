package problem1;

public abstract class Calculator {
    public double num1,num2;

    Calculator(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    protected double sum(){
        return num1+num2;
    }

    protected double difference(){
        return num1-num2;
    }

    protected double multiply(){
        return num1*num2;
    }

    protected double ratio(){
        return num1/num2;
    }

}
