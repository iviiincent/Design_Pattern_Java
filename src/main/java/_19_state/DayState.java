package _19_state;

public class DayState implements State {

    private static final DayState singleton = new DayState();

    private DayState() {
    }

    public static DayState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17) {
            context.setState(NightState.getInstance());
        } else if (hour == 12) {
            context.setState(NoonState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("Frame has been used in day time.");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alarm security in day time.");
        context.setState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Regular check in day time.");
    }

    @Override
    public String toString() {
        return "Day Time";
    }
}
