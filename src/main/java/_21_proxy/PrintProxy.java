package _21_proxy;

import java.lang.reflect.InvocationTargetException;

public class PrintProxy implements Printable {

    private String name;

    private final String className;

    private Printable real;

    public PrintProxy(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            try {
                real = Class.forName(className)
                        .asSubclass(Printable.class)
                        .getConstructor(String.class)
                        .newInstance(name);
            } catch (ClassNotFoundException | InvocationTargetException | InstantiationException |
                     IllegalAccessException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }
}
