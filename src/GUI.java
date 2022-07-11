import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JPanel mainPanel;
    private JLabel headerLabel;
    private JLabel nameLabel;
    private JTextField textFieldName;
    private JLabel surnameLabel;
    private JTextField textFieldSurname;
    private JLabel genderLabel;
    private JRadioButton radioButtonMale;
    private JRadioButton radioButtonFemale;
    private JLabel birthdateLabel;
    private JComboBox comboBoxDate;

    public GUI(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(mainPanel);

        Font font = new Font("Fira Coda", Font.PLAIN, 18);
        mainPanel.setFont(font);
        headerLabel.setFont(font);
        nameLabel.setLabelFor(textFieldName);
        nameLabel.setFont(font);
        surnameLabel.setLabelFor(textFieldSurname);
        surnameLabel.setFont(font);
        genderLabel.setLabelFor(radioButtonMale);
        genderLabel.setFont(font);
        birthdateLabel.setLabelFor(comboBoxDate);
        birthdateLabel.setFont(font);
        comboBoxDate.setFont(font);

        //Adding birthdate from 1800 to 2022 to combo box
        for (int i = 1800; i < 2022; i++) {
            comboBoxDate.addItem(i);
        }


        ButtonGroup group = new ButtonGroup();
        group.add(radioButtonFemale);
        group.add(radioButtonMale);

        this.pack();
    }
}
