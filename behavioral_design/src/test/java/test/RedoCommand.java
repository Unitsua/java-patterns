package test;

/**
 * 恢复命令实现类
 */
public class RedoCommand implements Command {

    /**
     * 命令接受者对象
     */
    public Document doucment;
    
    /**
     * 构造方法
     * @param document
     */
    public RedoCommand(Document document){
        this.doucment = document;
    }
    
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        this.doucment.redo();
    }

}