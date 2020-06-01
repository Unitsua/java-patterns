package component;

public class AaOffice extends AbstractBrand {

    private String name;

    public String getName () {
        return name;
    }

    @Override
    protected void printStruct (String preStr) {
        System.out.println(preStr + "-" + name);
    }

    public void setName (String name) {
        this.name = name;
    }

    public AaOffice (String name) {
        this.name = name;
    }

    public AaOffice () { }

    public void receiveDoc () {
        System.out.println (this.name+"接收文件");
    }
}
