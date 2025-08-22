package _21_proxy;

public class Printer implements Printable {

    private String name;

    public Printer(String name) {
        heavyJob("Creating instance of Printer:");
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("-> I'm " + name + " <-");
        System.out.println(string);
    }

    public void heavyJob(String message) {
        System.out.println(message);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println(" <- end");
    }
}
