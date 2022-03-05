package problem3;

public class Checker implements MyInteger {
    int num;
    Checker(int num){
        this.num=num;
    }


    @Override
    public boolean isEven() {
        if (num%2==0)
            return true;
        else
            return false;
    }

    @Override
    public boolean isOdd() {
        if (num%2!=0)
            return true;
        else
            return false;
    }

    @Override
    public boolean isPositive() {
        if (num>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean isNegative() {
        if (num<0)
            return true;
        else
            return false;
    }

    @Override
    public boolean isZero() {
        if (num==0)
            return true;
        else
            return false;
    }
}
