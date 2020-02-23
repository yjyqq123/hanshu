package FunctionalInterance;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;

/**
 * @ClassName $(Name)
 * @Description TODO
 * @Author Qin jian
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class ChangeListenerTest {
    public static void main(String args[]) {

        JFrame jFrame = new JFrame("");

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("按钮");

        ChangeListener changeListener = event -> {

            AbstractButton aButton = (AbstractButton) event.getSource();

            ButtonModel aModel = aButton.getModel();

            boolean armed = aModel.isArmed();

            boolean pressed = aModel.isPressed();

            boolean selected = aModel.isSelected();

            System.out.println("Armed :" + armed + " - Pressed :" + pressed + " - Selected :" + selected);

        };

        button.addChangeListener(changeListener);

        Container cPane = jFrame.getContentPane();

        cPane.add(button, BorderLayout.CENTER);

        jFrame.setSize(800, 500);

        jFrame.setVisible(true);
    }
}
