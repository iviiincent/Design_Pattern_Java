package _14_chain_of_responsibility;

public abstract class Support {

    private final String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        Support support = this;
        while (support != null) {
            if (support.resolve(trouble)) {
                support.done(trouble);
                return;
            }
            if (support.next == null) {
                support.fail(trouble);
            }
            
            support = support.next;
        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved by " + this + ".");
    }
}
