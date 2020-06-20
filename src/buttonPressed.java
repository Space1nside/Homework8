import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonPressed implements ActionListener {
    Calculator calculator;
    ButtonPressed(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        calculator.doAction(command);
    }
}
