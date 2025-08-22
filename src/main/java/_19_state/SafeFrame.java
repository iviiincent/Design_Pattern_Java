package _19_state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {

    private final TextField textClock = new TextField(60);

    private final TextArea textScreen = new TextArea(10, 60);

    private final Button buttonUse = new Button("Use frame");

    private final Button buttonAlarm = new Button("Alarm");

    private final Button buttonPhone = new Button("Regular check");

    private final Button buttonExit = new Button("Exit");

    private State state = DayState.getInstance();

    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("Invalid action");
        }
    }

    @Override
    public void setClock(int hour) {
        StringBuffer buffer = new StringBuffer("Now: ");
        if (hour < 10) {
            buffer.append("0");
        }
        buffer.append(hour).append(":00");

        textClock.setText(buffer.toString());
        state.doClock(this, hour);
    }

    @Override
    public void setState(State state) {
        System.out.println("State changed: " + this.state + " -> " + state);
        this.state = state;
    }

    @Override
    public void recordLog(String message) {
        textScreen.append("Log: " + message + "\n");
    }

    @Override
    public void callSecurityCenter(String message) {
        textScreen.append("Call: " + message + "\n");
    }
}
