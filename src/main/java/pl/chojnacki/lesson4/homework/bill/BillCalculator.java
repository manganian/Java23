package pl.chojnacki.lesson4.homework.bill;

public class BillCalculator {
    public static double calculate(double billValue, double serviceCharge) {
        return billValue + serviceCharge;
    }

    public static double calculate(double billValue, double serviceCharge, double discount) {
        return billValue + serviceCharge - discount;
    }

    public static double calculate(double billValue, double serviceCharge, int packagingFee) {
        return billValue + serviceCharge + packagingFee;
    }
}
