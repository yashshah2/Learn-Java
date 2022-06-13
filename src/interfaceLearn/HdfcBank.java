package interfaceLearn;

public class HdfcBank implements Bank, RbiBank{
    public float calculateRateOfInterest(float rateofInterest) {
        return AMOUNT * TIME * rateofInterest / 100;
    }
    public void printTotalAmount(float totalAmount) {
        System.out.println("Total Amount after Maturity ::" + totalAmount);
    }
    public void printMessage(){
        System.out.println("I am from RBI");
    }
    public static void main(String[] args) {
        HdfcBank hdfcbankObject = new HdfcBank();
        
        System.out.println(hdfcbankObject.printWelcomeMessage("WELCOME TO THE WORLD BANK"));
        float totalInterest = hdfcbankObject.calculateRateOfInterest(4.5f);
        hdfcbankObject.printTotalAmount(totalInterest);

    }
}
