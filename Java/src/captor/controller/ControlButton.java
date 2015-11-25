package captor.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButton extends Control implements ActionListener {

    public ControlButton() {
        super();
        view.setButtonControler(this);
    }

    public void actionPerformed(ActionEvent e) {
        // TODO
    }
}
