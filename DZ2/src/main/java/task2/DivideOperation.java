package task2;

class DivideOperation extends Operation {

    public DivideOperation(double a, double b) {
        super(a, b);
    }

    public double getResult() {
        result = a / b;
        return result;
    }
}
