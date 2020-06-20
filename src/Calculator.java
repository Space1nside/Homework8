import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private static JTextField textField;
    private String display = "";

    public Calculator() {
        ButtonPressed buttonPressed = new ButtonPressed(this);
        setBounds(150, 150, 250, 520);
        setTitle("Calculator");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new FlowLayout());
        JPanel panel1 = new JPanel();
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(230, 90));
        panel1.add(textField);

        JPanel panel2 = new JPanel();
        JButton[] buttons = new JButton[15];

        panel2.setLayout(new GridLayout(5, 3, 4, 4));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + (i + 1));
            switch (i) {
                case 9:
                    buttons[i].setText("*");
                    break;
                case 10:
                    buttons[i].setText("0");
                    break;
                case 11:
                    buttons[i].setText("#");
                    break;
                case 12:
                    buttons[i].setText("\u232b");
                    break;
                case 13:
                    buttons[i].setText("+");
                    break;
                case 14:
                    buttons[i].setText("Call");
                    break;
            }

            buttons[i].setPreferredSize(new Dimension(70, 70));
            panel2.add(buttons[i]);
        }

        buttons[0].addActionListener(buttonPressed);
        buttons[0].setActionCommand("one");

        buttons[1].addActionListener(buttonPressed);
        buttons[1].setActionCommand("two");

        buttons[2].addActionListener(buttonPressed);
        buttons[2].setActionCommand("three");

        buttons[3].addActionListener(buttonPressed);
        buttons[3].setActionCommand("four");

        buttons[4].addActionListener(buttonPressed);
        buttons[4].setActionCommand("five");

        buttons[5].addActionListener(buttonPressed);
        buttons[5].setActionCommand("six");

        buttons[6].addActionListener(buttonPressed);
        buttons[6].setActionCommand("seven");

        buttons[7].addActionListener(buttonPressed);
        buttons[7].setActionCommand("eight");

        buttons[8].addActionListener(buttonPressed);
        buttons[8].setActionCommand("nine");

        buttons[9].addActionListener(buttonPressed);
        buttons[9].setActionCommand("*");

        buttons[10].addActionListener(buttonPressed);
        buttons[10].setActionCommand("zero");

        buttons[11].addActionListener(buttonPressed);
        buttons[11].setActionCommand("#");

        buttons[12].addActionListener(buttonPressed);
        buttons[12].setActionCommand("clearOne");

        buttons[13].addActionListener(buttonPressed);
        buttons[13].setActionCommand("+");

        buttons[14].addActionListener(buttonPressed);
        buttons[14].setActionCommand("call");

        add(panel1);
        add(panel2);
        setVisible(true);
    }

    public void doAction(String command) {
        if (command.equals("one")) {
            display += "1";
        } else if (command.equals("two")) {
            display += "2";
        } else if (command.equals("three")) {
            display += "3";
        } else if (command.equals("four")) {
            display += "4";
        } else if (command.equals("five")) {
            display += "5";
        } else if (command.equals("six")) {
            display += "6";
        } else if (command.equals("seven")) {
            display += "7";
        } else if (command.equals("eight")) {
            display += "8";
        } else if (command.equals("nine")) {
            display += "9";
        } else if (command.equals("zero")) {
            display += "0";
        } else if (command.equals("*")) {
            display += "*";
        } else if (command.equals("#")) {
            display += "#";
        } else if (command.equals("clearOne")) {
            display = "";
        } else if (command.equals("+")) {
            if (textField.getText().equals("")) {
                display += "+";
            }
        } else if (command.equals("call")) {
            JFrame callFrame = new JFrame("Call");
            callFrame.setBounds(150, 150, 300, 300);
            callFrame.setLayout(null);
            callFrame.setResizable(false);

            JLabel labelNum = new JLabel("You're calling on number " + textField.getText());
            labelNum.setBounds(10, 1, 250, 250);
            callFrame.add(labelNum);

            callFrame.setVisible(true);
        }
        textField.setText(display);
    }
}
