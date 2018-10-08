package euler;

public class Main {

    public static void main(String args[]) {

        double tf = 1;
        Euler solver = new Euler(0, 1, tf, 0.125, new myODE());
        double result = solver.solve();

        System.out.println("Result for ODE is: y(" + tf + ") = " + result);

    }

}
