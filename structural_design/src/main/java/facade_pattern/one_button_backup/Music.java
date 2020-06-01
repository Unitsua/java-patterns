package facade_pattern.one_button_backup;

public class Music implements Backup{

    @Override
    public void backup () {
        System.out.println ("备份音乐...");
    }
}
