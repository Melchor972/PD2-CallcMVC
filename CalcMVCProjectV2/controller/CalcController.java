package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CalcModel;
import view.CalcView;

public class CalcController {
    private CalcModel m_model;
    private CalcView m_view;

    public CalcController(CalcModel model, CalcView view) {
        m_model = model;
        m_view = view;

        m_view.addMultiplyListener(new MultiplyListener());
        m_view.addAddListener(new AddListener());
        m_view.addClearListener(new ClearListener());
    }

    class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                userInput = m_view.getUserInput();
                m_model.multiplyBy(userInput);
                m_view.setTotal(m_model.getValue());
            } catch (NumberFormatException nfex) {
                m_view.showError("Entrada inválida (usa enteros o formato a/b): '" + userInput + "'");
            } catch (ArithmeticException aex) {
                m_view.showError("Error aritmético: " + aex.getMessage());
            }
        }
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                userInput = m_view.getUserInput();
                m_model.add(userInput);
                m_view.setTotal(m_model.getValue());
            } catch (NumberFormatException nfex) {
                m_view.showError("Entrada inválida (usa enteros o formato a/b): '" + userInput + "'");
            } catch (ArithmeticException aex) {
                m_view.showError("Error aritmético: " + aex.getMessage());
            }
        }
    }

    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.reset();
            m_view.reset();
        }
    }
}