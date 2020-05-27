package edu.xatu.skin_library;

public class SummerStyleFactory implements Skin_libraryFactory {
    public Button produceButton () {
        return new SummerStyleButton ();
    }

    public TextBox produceTextBox () {
        return new SummerStyleTextBox ();
    }

    public ComboBox produceComboBox () {
        return new SummerStyleComboBox ();
    }
}
