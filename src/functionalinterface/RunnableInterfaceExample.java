package functionalinterface;
public class RunnableInterfaceExample {
    public static void main(String[] args) {
        Runnable runnableLambda = () -> {
            System.out.println("I am implementing  Rennable Interface using Lambda Expression!!!!");
        };

        new Thread(runnableLambda).start();
    }   

}
