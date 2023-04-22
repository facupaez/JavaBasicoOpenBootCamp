package desktop;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel taxPanel;
    private JTextPane txt_price;
    private JTextPane txt_tax;
    private JTextPane txt_total;
    private JButton calculateBtn;



    public MainForm() {
        // creando event listener
        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = Double.parseDouble(txt_price.getText());
                double tax = Double.parseDouble(txt_tax.getText());

                double result = price + (price / 100 * tax);
                txt_total.setText(Double.toString(result));
            }
        });
    }

    public static void main(String[] args) {

        // instanciado JFrame
        JFrame frame = new JFrame("SwingTax");

        // visibilizando app
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);


    }
}
