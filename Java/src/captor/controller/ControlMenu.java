package captor.controller;

import captor.model.Model;
import captor.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlMenu extends Control implements ActionListener {

    public ControlMenu() {
        super();
        view.setMenuControler(this);
    }

    public void actionPerformed(ActionEvent e) {

    }

}
