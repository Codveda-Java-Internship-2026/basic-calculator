public class BasicCalculator {

    //Addition method
        public int addition(int a , int b) {
            return a+b;
        }

        //Subtraction method
        public int subtraction(int a, int b) {
            return a - b;
        }

        //Multiplication method
        public int multiplication(int a, int b) {
            return a * b;
        }

        //Division method
        public double division(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide b zero!");
            }
            return (double) a / b;
        }
}