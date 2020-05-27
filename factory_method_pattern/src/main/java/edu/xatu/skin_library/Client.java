package edu.xatu.skin_library;

public class Client {

    public static void main (String[] args) {
        try {
            Skin_libraryFactory factory;
            Button button;
            TextBox textBox;
            ComboBox comboBox;

            factory = (Skin_libraryFactory) XMLUtil.getBean ();

            button = factory.produceButton ();
            button.display ();

            textBox = factory.produceTextBox ();
            textBox.display ();

            comboBox = factory.produceComboBox ();
            comboBox.display ();

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

}
