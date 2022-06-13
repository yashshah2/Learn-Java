package interfaceLearn;
interface Bank {
    int AMOUNT = 10000; 
    int TIME = 2;
    default String printWelcomeMessage(String welcomeMessage) {
        return welcomeMessage;
    }
    float calculateRateOfInterest(float rateofInterest);
    void printTotalAmount(float totalAmount);
   
}
