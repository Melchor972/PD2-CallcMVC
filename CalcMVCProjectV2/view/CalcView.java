package view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.CalcModel;

public class CalcView extends JFrame {
    private static final String INITIAL_VALUE = "0";
    private JTextField m_userInputTf = new JTextField(5);
    private JTextField m_totalTf = new JTextField(20);
    private JButton m_multiplyBtn = new JButton("Multiply");
    private JButton m_addBtn = new JButton("Add");
    private JButton m_clearBtn = new JButton("Clear");
    private CalcModel m_model;

    public CalcView(CalcModel model) {
        m_model = model;
        m_totalTf.setText(m_model.getValue());
        m_totalTf.setEditable(false);

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_userInputTf);
        content.add(m_multiplyBtn);
        content.add(m_addBtn);
        content.add(new JLabel("Total"));
        content.add(m_totalTf);
        content.add(m_clearBtn);

        this.setContentPane(content);
        this.pack();
        this.setTitle("Simple Calc MVC - Fracciones");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getUserInput() {
        return m_userInputTf.getText();
    }

    public void setTotal(String newTotal) {
        m_totalTf.setText(newTotal);
    }

    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    public void reset() {
        m_totalTf.setText(INITIAL_VALUE);
        m_userInputTf.setText("");
    }

    public void addMultiplyListener(ActionListener mal) {
        m_multiplyBtn.addActionListener(mal);
    }

    public void addAddListener(ActionListener aal) {
        m_addBtn.addActionListener(aal);
    }

    public void addClearListener(ActionListener cal) {
        m_clearBtn.addActionListener(cal);
    }
}