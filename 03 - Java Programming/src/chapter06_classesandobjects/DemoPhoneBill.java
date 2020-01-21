package chapter06_classesandobjects;

public class DemoPhoneBill {

    public static void main(String[] args) {

        PhoneBill phoneBill = new PhoneBill("123456", 90, 900, 300);
        phoneBill.printItemizedBill();

    }
}
