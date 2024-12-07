public class Financing {
    private double total;
    private double income;
    private int months;

    public Financing(double total, double income, int months) {
       if (total < 0 || income < 0 || months < 0) {
            throw new IllegalArgumentException("Invalid input: numbers must be positive.");
        }
        this.total = total;
        this.income = income;
        this.months = months;
    }

    public double calculateMonthlyPayment() {
        if (total / months > income * 0.5) {
            throw new RuntimeException("The monthly payment is too high.");
        }
        return total / months;
    }
}
