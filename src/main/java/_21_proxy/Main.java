package _21_proxy;

public class Main {

    public static void main(String[] args) {
        PrintProxy printProxy = new PrintProxy("Alice");
        System.out.println(printProxy.getPrinterName());

        printProxy.setPrinterName("Bob");
        System.out.println(printProxy.getPrinterName());
        
        printProxy.print("Hello");
    }
    
}
