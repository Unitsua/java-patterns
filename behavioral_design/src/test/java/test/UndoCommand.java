package test;

/**
 * 撤销命令实现类
 */
public class UndoCommand implements Command {

    /**
     * 命令接受者对象
     */
    public Document doucment;
    
    /**
     * 构造方法
     * @param document
     */
    public UndoCommand(Document document){
        this.doucment = document;
    }
    
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        this.doucment.undo();
    }
}