package _22_command;

import _22_command.command.Command;
import _22_command.command.MacroCommand;
import _22_command.drawer.ColorCommand;
import _22_command.drawer.DrawCanvas;
import _22_command.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    private final MacroCommand history = new MacroCommand();

    private final DrawCanvas canvas = new DrawCanvas(400, 400, history);

    private final JButton clearButton = new JButton("clear");

    private final JButton redButton = new JButton("red");
    private final JButton greenButton = new JButton("green");
    private final JButton blueButton = new JButton("blue");

    private final JButton undoButton = new JButton("undo");

    public Main(String title) {
        super(title);

        addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        undoButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        buttonBox.add(undoButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);

        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source == clearButton) {
            history.clear();
            canvas.repaint();
        } else if (source == redButton) {
            Command command = new ColorCommand(canvas, Color.red);
            history.append(command);
            command.execute();
        } else if (source == greenButton) {
            Command command = new ColorCommand(canvas, Color.green);
            history.append(command);
            command.execute();
        } else if (source == blueButton) {
            Command command = new ColorCommand(canvas, Color.blue);
            history.append(command);
            command.execute();
        } else if (source == undoButton) {
            history.undo();
            canvas.repaint();
        }
    }

    /**
     * Invoked when a mouse button is pressed on a component and then
     * dragged.  {@code MOUSE_DRAGGED} events will continue to be
     * delivered to the component where the drag originated until the
     * mouse button is released (regardless of whether the mouse position
     * is within the bounds of the component).
     * <p>
     * Due to platform-dependent Drag&amp;Drop implementations,
     * {@code MOUSE_DRAGGED} events may not be delivered during a native
     * Drag&amp;Drop operation.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseDragged(MouseEvent e) {
        DrawCommand command = new DrawCommand(canvas, e.getPoint());
        history.append(command);
        command.execute();
    }

    /**
     * Invoked when the mouse cursor has been moved onto a component
     * but no buttons have been pushed.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseMoved(MouseEvent e) {
    }

    /**
     * Invoked the first time a window is made visible.
     *
     * @param e the event to be processed
     */
    @Override
    public void windowOpened(WindowEvent e) {
    }

    /**
     * Invoked when the user attempts to close the window
     * from the window's system menu.
     *
     * @param e the event to be processed
     */
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    /**
     * Invoked when a window has been closed as the result
     * of calling dispose on the window.
     *
     * @param e the event to be processed
     */
    @Override
    public void windowClosed(WindowEvent e) {
    }

    /**
     * Invoked when a window is changed from a normal to a
     * minimized state. For many platforms, a minimized window
     * is displayed as the icon specified in the window's
     * iconImage property.
     *
     * @param e the event to be processed
     * @see Frame#setIconImage
     */
    @Override
    public void windowIconified(WindowEvent e) {
    }

    /**
     * Invoked when a window is changed from a minimized
     * to a normal state.
     *
     * @param e the event to be processed
     */
    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    /**
     * Invoked when the Window is set to be the active Window. Only a Frame or
     * a Dialog can be the active Window. The native windowing system may
     * denote the active Window or its children with special decorations, such
     * as a highlighted title bar. The active Window is always either the
     * focused Window, or the first Frame or Dialog that is an owner of the
     * focused Window.
     *
     * @param e the event to be processed
     */
    @Override
    public void windowActivated(WindowEvent e) {
    }

    /**
     * Invoked when a Window is no longer the active Window. Only a Frame or a
     * Dialog can be the active Window. The native windowing system may denote
     * the active Window or its children with special decorations, such as a
     * highlighted title bar. The active Window is always either the focused
     * Window, or the first Frame or Dialog that is an owner of the focused
     * Window.
     *
     * @param e the event to be processed
     */
    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String[] args) {
        new Main("Command Pattern");
    }
}
