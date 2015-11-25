package captor.controller;

import captor.model.Model;
import captor.view.View;

public abstract class Control {

    protected static Model model;
    protected static View view;

    public Control() {}

    public Control(Model myModel, View myView) {
        model = myModel;
        view = myView;
    }
}
