package facade_pattern.one_button_backup;

public class Photo implements Backup {
    @Override
    public void backup () {
        System.out.println ("备份照片...");
    }
}
