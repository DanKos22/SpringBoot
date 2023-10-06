package ie.atu.hello;

public class number {
    int num1 = 6, num2 = 2, num3 = 10, num4 = 5, num5 = 4, num6 = 3, num7 = 8, num8 = 2;
    int add = num1 + num2;
    int subtract = num3 - num4;
    int multiply = num5 * num6;
    float division = num7 / num8;

    public number() {
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getSubtract() {
        return subtract;
    }

    public void setSubtract(int subtract) {
        this.subtract = subtract;
    }

    public int getMultiply() {
        return multiply;
    }

    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }

    public float getDivision() {
        return division;
    }

    public void setDivision(float division) {
        this.division = division;
    }
}
