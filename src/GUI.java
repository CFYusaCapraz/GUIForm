import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
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
    private JLabel hobbiesLabel;
    private JCheckBox checkBoxFootball;
    private JCheckBox checkBoxMovies;
    private JCheckBox checkBoxNetflix;
    private JCheckBox checkBoxCoding;
    private JButton buttonSubmit;

    public GUI(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(mainPanel);

        //Adding birthdate from 1800 to 2022 to combo box
        for (int i = 1800; i < 2022; i++) {
            comboBoxDate.addItem(i);
        }


        ButtonGroup group = new ButtonGroup();
        group.add(radioButtonFemale);
        group.add(radioButtonMale);

        buttonSubmit.addActionListener(this);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSubmit)
            JOptionPane.showMessageDialog(this,"hello");
    }
}
