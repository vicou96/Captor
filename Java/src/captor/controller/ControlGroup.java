package captor.controller;

import captor.model.Model;
import captor.view.View;

public class ControlGroup extends Control {

    private ControlButton controlButton;
    private ControlMenu controlMenu;

    public ControlGroup(Model newModel)
    {
        super(newModel,new View(newModel));

        controlButton = new ControlButton();
        controlMenu = new ControlMenu();
    }
}
