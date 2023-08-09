package task2;

class PowerOperation extends Operation {

    public PowerOperation(double a, double b) {
        super(a, b);
    }

    public double getResult() {
        result = Math.pow(a, b);
        return result;
    }
}
