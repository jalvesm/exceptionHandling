public class Main {
    public static void main(String[] args) {
        try {
            double total = -1;
            double income = 2000;
            int months = 20;
            Financing financing = new Financing(total, income, months);
            System.out.println("Monthly payment is: R$" + financing.calculateMonthlyPayment());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Just keep swimming!");
        }
    }
}