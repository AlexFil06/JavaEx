package task2;

class MultiplyOperation extends Operation {

    public MultiplyOperation(double a, double b) {
        super(a, b);
    }

    public double getResult() {
        result = a * b;
        return result;
    }
}
