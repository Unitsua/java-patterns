package facade_pattern.one_button_backup;

public class Client {
    public static void main (String[] args) {
        OneKeyBackup ok = new OneKeyBackup ();
        ok.backup ();
    }
}
