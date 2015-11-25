package captor;

import captor.controller.ControlGroup;
import captor.model.Model;

public class Captor implements Runnable {

    public static void main(String[] argv) {
        javax.swing.SwingUtilities.invokeLater(new Captor());
    }

    public void run() {
        Model model = new Model();
        ControlGroup controler = new ControlGroup(model);
    }

}
