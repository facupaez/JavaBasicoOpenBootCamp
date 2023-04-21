package desktop;

import javax.swing.*;

public class MainForm {
    private JPanel taxPanel;
    private JTextPane txt_price;
    private JTextPane txt_tax;
    private JTextPane txt_total;
    private JButton calculateBtn;

    public static void main(String[] args) {

        // instanciado JFrame
        JFrame frame = new JFrame("SwingTax");

        // visibilizando app
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);


    }
}
