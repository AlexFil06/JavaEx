package task2;

class SubtractOperation extends Operation {

    public SubtractOperation(double a, double b) {
        super(a, b);
    }

    public double getResult() {
        result = a - b;
        return result;
    }
}
