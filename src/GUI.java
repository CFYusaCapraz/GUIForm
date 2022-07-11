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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSubmit) {
            String msg = "";
            String name = textFieldName.getText();
            String surname = textFieldSurname.getText();
            String gender;
            if (radioButtonMale.isSelected()) {
                gender = "Mr. ";
            } else {
                gender = "Ms. ";
            }
            String date = comboBoxDate.getSelectedItem().toString();
            int age = 2022 - (Integer.parseInt(date));
            msg += "Hello " + gender + name + " " + surname + ".\n" + "It seem like you are " + age + " years old.\n" + "You like ";

            if (checkBoxFootball.isSelected()) {
                msg += "playing football, ";
            }
            if (checkBoxMovies.isSelected()) {
                msg += "going to movies, ";
            }
            if (checkBoxNetflix.isSelected()) {
                msg += "watching netflix, ";
            }
            if (checkBoxCoding.isSelected()) {
                msg += "coding, ";
            }
            msg += "just like me :)\n" + "See you later...";

            JOptionPane.showMessageDialog(this, msg, "Information Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
