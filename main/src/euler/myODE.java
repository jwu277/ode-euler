package euler;

public class myODE implements ODE{

    public myODE() {

    }

    /**
     * An ODE to define in the form of y'(t) = f(t, y)
     * @param t is the independent variable at a specified value
     * @param y is the dependent variable at a specified value
     * @return the desired function of t and y
     */
    @Override
    public double f(double t, double y) {
        return t + y;
    }

}
