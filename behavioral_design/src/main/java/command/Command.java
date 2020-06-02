package command;

import javax.swing.*;

public interface Command {

    void excute(JPanel jPanel,Circle circle);
    void undo(JPanel jPanel);

}
