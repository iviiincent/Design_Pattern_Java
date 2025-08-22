package _19_state;

public interface Context {

    void setClock(int hour);

    void setState(State state);

    void recordLog(String message);

    void callSecurityCenter(String message);
}
