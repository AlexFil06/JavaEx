package task2;

abstract class Operation {

    protected double a;
    protected double b;
    protected double result;

    public Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getResult();
}
