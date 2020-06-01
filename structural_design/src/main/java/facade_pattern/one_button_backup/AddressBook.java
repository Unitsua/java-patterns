package facade_pattern.one_button_backup;

public class AddressBook implements Backup {
    @Override
    public void backup () {
        System.out.println ("备份通信录...");
    }
}
