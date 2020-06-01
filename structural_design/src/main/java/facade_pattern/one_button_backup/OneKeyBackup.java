package facade_pattern.one_button_backup;

public class OneKeyBackup implements Backup {
    private AddressBook addressBook = new AddressBook ();
    private Note note = new Note ();
    private Photo photo = new Photo ();
    private Music music = new Music ();

    @Override
    public void backup () {
        addressBook.backup ();
        note.backup ();
        photo.backup ();
        music.backup ();
    }
}
