package euler;

/**
 * Approximates y(t) given an euler.ODE and initial value using euler's method.
 */
public class Euler {

    private static double tf;

    private static double step = 0.5;

    private static ODE ode;

    private static double t;
    private static double y;

    /**
     * Creates an euler solver with given initial value, euler.ODE, and step-size
     * to approximate y(tf)
     * @param t0 initial independent variable value
     * @param y0 initial dependent variable value
     * @param tf independent variable value to approximate the corresponding
     *           dependent variable value
     * @param step is the step size to use in euler's method
     * @param ode represents the euler.ODE
     */
    public Euler(double t0, double y0, double tf, double step, ODE ode) {

        this.t = t0;
        this.y = y0;

        this.tf = tf;

        this.step = step;

        this.ode = ode;

    }

    /**
     * Approximates y(tf) for the given euler.ODE. The final step will be <= the
     * step size, while all previous step sizes will be the one specified.
     * @return an approximation of y(tf) using euler's method
     */
    public double solve() {

        while (t <= tf - step) {
            computeNext();
            t += step;
        }

        step = tf - t;
        t += step;
        computeNext();

        return y;

    }

    /**
     * Computes and sets the next y value for the current value of t
     */
    private void computeNext() {
        y += ode.f(t, y) * step;
    }

}
