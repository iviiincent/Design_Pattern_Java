package _19_state;

public class NoonState implements State {

    private static final NoonState singleton = new NoonState();

    private NoonState() {
    }

    public static NoonState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17) {
            context.setState(NightState.getInstance());
        } else if (hour != 12) {
            context.setState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Frame has been used at noon.");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alarm security at noon.");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Regular check at noon.");
    }

    @Override
    public String toString() {
        return "Noon";
    }
}
