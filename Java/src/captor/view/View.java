package captor.view;

import captor.model.Model;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * MVC maze.view.View
 * @author Aredhele, Xarkes, Coqui, Lyter, Chlorodatafile
 * @version 1.0
 */
public class View extends JFrame {

    public View(Model model)
    {
        setSize(500, 500);
        setTitle("Captor");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display();
    }

    /**
     * Display the UI
     */
    public void display() {
        setVisible(true);
    }


    public void setMenuControler(ActionListener listener) {
        // TODO
    }

    public void setButtonControler(ActionListener listener) {
        // TODO
    }
}
