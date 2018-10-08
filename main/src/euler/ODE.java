package euler;

/**
 * Represents a first-order euler.ODE in the form of y'(t) = f(t, y)
 */
public interface ODE {

    /**
     * Repersents a first-order euler.ODE of the form y'(t) = f(t, y)
     * @param t is the independent variable at a specified value
     * @param y is the dependent variable at a specified value
     * @return y'(t) at the given (t, y) value
     */
    double f(double t, double y);

}
