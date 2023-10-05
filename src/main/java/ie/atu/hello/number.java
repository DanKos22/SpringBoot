package ie.atu.hello;

public class number {
    int num1 = 6;
    int num2 = 2;
    int total = num1 + num2;
    int operation = num1 + num2;


    public number() {
    }

    /*public number(double operation) {
        this.operation = operation;
    }*/
    public int add() {
        int total = num1 + num2;
        return total;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
