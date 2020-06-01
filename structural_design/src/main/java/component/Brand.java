package component;

import java.util.ArrayList;

public class Brand extends AbstractBrand {

    private ArrayList<AbstractBrand> list = new ArrayList<AbstractBrand> ( );
    private String name;

    public ArrayList getList () {
        return list;
    }

    public void setList (ArrayList list) {
        this.list = list;
    }

    public String getName () {
        return name;
    }

    public Brand (String name) {
        this.name = name;
    }

    public Brand(){}

    public void setName (String name) {
        this.name = name;
    }

    public void add(AbstractBrand abstractBrand){
        list.add ( abstractBrand );
    }
    @Override
    public void receiveDoc () {
        System.out.println (this.name + "接收文件");
    }
    public void remove(AbstractBrand abstractBrand){
        list.remove ( abstractBrand );
    }

    public AbstractBrand getChild(int i){
        return (AbstractBrand) list.get ( i );
    }

    public void issueDoc(AbstractBrand abstractBrand){

        System.out.println (this.name + "向" + abstractBrand.getName () + "发送文件");

        abstractBrand.receiveDoc ();

    }

    public void printStruct(String preStr) {
        // 先把自己输出
        System.out.println(preStr + "+" + this.name);
        //如果还包含有子组件，那么就输出这些子组件对象
        if(this.list != null){
            //添加两个空格，表示向后缩进两个空格
            preStr += "  ";
            //输出当前对象的子对象
            for(AbstractBrand ab : list){
                //递归输出每个子对象
                ab.printStruct(preStr);
            }
        }

    }

}
