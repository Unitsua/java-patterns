package test;

/**
 * 提供给客户端的命令调用方法
 * @author feng
 *
 */
public class Invoker {

    /**
     * 命令对象
     */
    public Command command;
    
    /**
     * 命令设置方法
     * @param
     */
    public void setCommand(Command cmd){
        this.command = cmd;
    }
    
    /**
     * 命令执行方法
     */
    public void execute(){
        this.command.execute();
    }
}