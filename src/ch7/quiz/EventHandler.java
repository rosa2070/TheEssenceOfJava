package ch7.quiz;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventHandler extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
