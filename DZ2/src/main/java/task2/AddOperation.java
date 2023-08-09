package task2;

class AddOperation extends Operation {

    public AddOperation(double a, double b) {
        super(a, b);
    }

    public double getResult() {
        result = a + b;
        return result;
    }
}
