package _19_state;

public class NightState implements State {

    private static final NightState singleton = new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour < 17 && hour != 13) {
            context.setState(DayState.getInstance());
        } else if (hour == 13) {
            context.setState(NoonState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Alarm: frame is used at night.");
        context.setState(UrgentState.getInstance());
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alarm security at night.");
        context.setState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Regular check at night.");
    }

    @Override
    public String toString() {
        return "Night";
    }
}
