package edu.xatu.skin_library;

public class SpringStyleFactory implements Skin_libraryFactory {
    public Button produceButton () {
        return new SpringStyleButton ();
    }

    public TextBox produceTextBox () {
        return new SpringStyleTextBox ();
    }

    public ComboBox produceComboBox () {
        return new SpringStyleComboBox ();
    }
}
