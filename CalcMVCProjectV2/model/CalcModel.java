package model;

public class CalcModel {
    private static final String INITIAL_VALUE = "0";
    private long num; // Numerador
    private long den; // Denominador

    public CalcModel() {
        reset();
    }

    public void reset() {
        this.num = 0;
        this.den = 1; // Representa 0/1 (valor inicial 0)
    }

    // Método para multiplicar fracciones (Fracción A * Fracción B)
    public void multiplyBy(String operand) {
        long oNum;
        long oDen = 1;

        if (operand.contains("/")) {
            String[] parts = operand.split("/");
            oNum = Long.parseLong(parts[0].trim());
            oDen = Long.parseLong(parts[1].trim());
            if (oDen == 0) {
                throw new ArithmeticException("División entre cero en el denominador.");
            }
        } else {
            oNum = Long.parseLong(operand.trim());
        }

        if (this.num == 0) {
            this.num = oNum;
            this.den = oDen;
        } else {
            this.num = this.num * oNum;
            this.den = this.den * oDen;
            simplificar();
        }
    }

    // Método para sumar fracciones (Fracción Actual + Fracción Ingresada)
    public void add(String operand) {
        long oNum;
        long oDen = 1;

        if (operand.contains("/")) {
            String[] parts = operand.split("/");
            oNum = Long.parseLong(parts[0].trim());
            oDen = Long.parseLong(parts[1].trim());
            if (oDen == 0) {
                throw new ArithmeticException("División entre cero en el denominador.");
            }
        } else {
            oNum = Long.parseLong(operand.trim());
        }

        if (this.num == 0 && this.den == 1) {
            this.num = oNum;
            this.den = oDen;
        } else {
            long nuevoNum = (this.num * oDen) + (this.den * oNum);
            long nuevoDen = this.den * oDen;
            this.num = nuevoNum;
            this.den = nuevoDen;
            simplificar();
        }
    }

    private void simplificar() {
        long mcd = mcd(Math.abs(num), Math.abs(den));
        num /= mcd;
        den /= mcd;
        if (den < 0) { 
            num = -num;
            den = -den;
        }
    }

    private long mcd(long a, long b) {
        return b == 0 ? a : mcd(b, a % b);
    }

    public void setValue(String value) {
        multiplyBy(value);
    }

    public String getValue() {
        if (den == 1 || den == 0) {
            return Long.toString(num);
        }
        return num + "/" + den;
    }
}