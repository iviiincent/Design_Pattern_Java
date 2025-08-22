package _19_state;

public class UrgentState implements State {

    private static final UrgentState singleton = new UrgentState();

    private UrgentState() {
    }

    public static UrgentState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Alarm: frame is used during urgent status.");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alarm security during urgent status.");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Regular check during urgent status.");
    }
}
