package problem2;

public class Main {
    public static void main(String[] args) {
        Solver solver = new Solver();
        try {
            Check(solver.delta);
            System.out.println("the first answer is = " + solver.Solve1());
            System.out.println("the second answer is = " + solver.Solve2());
        }
        catch (NegativeDelta e){
            System.out.println(e);
        }
    }
    static void Check(double delta) throws NegativeDelta{
        if(delta<0)
            throw new NegativeDelta("this equation has no real answers");
    }
}
