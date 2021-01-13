package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.script.*;

public class GUI_Main extends JPanel{
    JTextField texCalculator = new JTextField();

    ScriptEngineManager scriptManager = new ScriptEngineManager();
    ScriptEngine scriptControl = scriptManager.getEngineByName("JavaScript");

    public void GUIMain(){
        JFrame frame = new JFrame("Java Calaculator");
        frame.setSize(420,410);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(245, 245, 245));
        frame.setLayout(null);

        texCalculator.setText("");
        texCalculator.setFont(new Font("Arial",Font.BOLD, 40));
        texCalculator.setHorizontalAlignment(SwingConstants.RIGHT);
        texCalculator.setBounds(2, 4, 400, 60);
        texCalculator.setBackground(new Color(218, 218, 217));
        frame.add(texCalculator);

        JButton buttonC = new JButton("C");
        buttonC.setFont(new Font("Arial",Font.BOLD, 32));
        buttonC.setBounds(2, 60, 100, 60);
        buttonC.setFocusable(false);
        buttonC.setBackground(new Color(230, 51, 42));
        buttonC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                texCalculator.setText("");            }
        });
        frame.add(buttonC);

        JButton buttonDivision = new JButton("/");
        buttonDivision.setFont(new Font("Arial",Font.BOLD, 32));
        buttonDivision.setBounds(100, 60, 100, 60);
        buttonDivision.setFocusable(false);
        buttonDivision.setBackground(new Color(230, 51, 42));
        buttonDivision.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("/");            }
        });
        frame.add(buttonDivision);

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setFont(new Font("Arial",Font.BOLD, 32));
        buttonMultiplication.setBounds(200, 60, 100, 60);
        buttonMultiplication.setFocusable(false);
        buttonMultiplication.setBackground(new Color(230, 51, 42));
        buttonMultiplication.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("*");            }
        });
        frame.add(buttonMultiplication);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setFont(new Font("Arial",Font.BOLD, 32));
        buttonMinus.setBounds(300, 60, 100, 60);
        buttonMinus.setFocusable(false);
        buttonMinus.setBackground(new Color(230, 51, 42));
        buttonMinus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("-");            }
        });
        frame.add(buttonMinus);

        JButton button7 = new JButton("7");
        button7.setFont(new Font("Arial",Font.BOLD, 32));
        button7.setBounds(2, 120, 100, 60);
        button7.setFocusable(false);
        button7.setBackground(new Color(230, 51, 42));
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("7");            }
        });
        frame.add(button7);

        JButton button8 = new JButton("8");
        button8.setFont(new Font("Arial",Font.BOLD, 32));
        button8.setBounds(100, 120, 100, 60);
        button8.setFocusable(false);
        button8.setBackground(new Color(230, 51, 42));
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("8");            }
        });
        frame.add(button8);

        JButton button9 = new JButton("9");
        button9.setFont(new Font("Arial",Font.BOLD, 32));
        button9.setBounds(200, 120, 100, 60);
        button9.setFocusable(false);
        button9.setBackground(new Color(230, 51, 42));
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("9");            }
        });
        frame.add(button9);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setFont(new Font("Arial",Font.BOLD, 32));
        buttonPlus.setBounds(300, 120, 100, 120);
        buttonPlus.setFocusable(false);
        buttonPlus.setBackground(new Color(230, 51, 42));
        buttonPlus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("+");            }
        });
        frame.add(buttonPlus);

        JButton button4 = new JButton("4");
        button4.setFont(new Font("Arial",Font.BOLD, 32));
        button4.setBounds(2, 180, 100, 60);
        button4.setFocusable(false);
        button4.setBackground(new Color(230, 51, 42));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("4");            }
        });
        frame.add(button4);

        JButton button5 = new JButton("5");
        button5.setFont(new Font("Arial",Font.BOLD, 32));
        button5.setBounds(100, 180, 100, 60);
        button5.setFocusable(false);
        button5.setBackground(new Color(230, 51, 42));
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("5");            }
        });
        frame.add(button5);

        JButton button6 = new JButton("6");
        button6.setFont(new Font("Arial",Font.BOLD, 32));
        button6.setBounds(200, 180, 100, 60);
        button6.setFocusable(false);
        button6.setBackground(new Color(230, 51, 42));
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("6");            }
        });
        frame.add(button6);

        JButton button1 = new JButton("1");
        button1.setFont(new Font("Arial",Font.BOLD, 32));
        button1.setBounds(2, 240, 100, 60);
        button1.setFocusable(false);
        button1.setBackground(new Color(230, 51, 42));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("1");            }
        });
        frame.add(button1);

        JButton button2 = new JButton("2");
        button2.setFont(new Font("Arial",Font.BOLD, 32));
        button2.setBounds(100, 240, 100, 60);
        button2.setFocusable(false);
        button2.setBackground(new Color(230, 51, 42));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("2");            }
        });
        frame.add(button2);

        JButton button3 = new JButton("3");
        button3.setFont(new Font("Arial",Font.BOLD, 32));
        button3.setBounds(200, 240, 100, 60);
        button3.setFocusable(false);
        button3.setBackground(new Color(230, 51, 42));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("3");
            }
        });
        frame.add(button3);

        JButton buttonEquals = new JButton("=");
        buttonEquals.setFont(new Font("Arial",Font.BOLD, 32));
        buttonEquals.setBounds(300, 240, 100, 120);
        buttonEquals.setFocusable(false);
        buttonEquals.setBackground(new Color(230, 51, 42));
        buttonEquals.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    String result = scriptControl.eval(texCalculator.getText()).toString();
                    texCalculator.setText(result);
                }catch (Exception exeptionError){
                    addNumber("Error");
                }
            }
        });
        frame.add(buttonEquals);

        JButton button0 = new JButton("0");
        button0.setFont(new Font("Arial",Font.BOLD, 32));
        button0.setBounds(2, 300, 200, 60);
        button0.setFocusable(false);
        button0.setBackground(new Color(230, 51, 42));
        button0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber("0");
            }
        });
        frame.add(button0);

        JButton buttonDot = new JButton(".");
        buttonDot.setFont(new Font("Arial",Font.BOLD, 32));
        buttonDot.setBounds(200, 300, 100, 60);
        buttonDot.setFocusable(false);
        buttonDot.setBackground(new Color(230, 51, 42));
        buttonDot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addNumber(".");
            }
        });
        frame.add(buttonDot);

        frame.setVisible(true);
    }
    public void addNumber(String digit){
        texCalculator.setText(texCalculator.getText()+digit);
    }
}
