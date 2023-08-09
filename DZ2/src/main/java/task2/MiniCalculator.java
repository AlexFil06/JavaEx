package task2;



    public class MiniCalculator {


        public double add(double a, double b) {
            Operation operation = new AddOperation(a, b);
            return operation.getResult();
        }

        public double subtract(double a, double b) {
            Operation operation = new SubtractOperation(a, b);
            return operation.getResult();
        }

        public double multiply(double a, double b) {
            Operation operation = new MultiplyOperation(a, b);
            return operation.getResult();
        }

        public double divide(double a, double b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Деление на 0");
            }
            Operation operation = new DivideOperation(a, b);
            return operation.getResult();
        }

        public double power(double a, double b) {
            Operation operation = new PowerOperation(a, b);
            return operation.getResult();
        }


    }


