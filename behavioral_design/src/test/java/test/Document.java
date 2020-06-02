package test;

/**
 * 命令接收者 Receiver
 */
public class Document {

    /**
     * 操作实体对象
     */
    public static StringBuffer sbr = new StringBuffer();
    
    /**
     * 计数器
     */
    public static int count = 0;
    
    /**
     * 撤销实现方法
     */
    public void undo(){
        System.out.println("调用撤销实现方法，字符串递减");
        sbr.deleteCharAt(sbr.length()-1);
        count --;
        System.out.println("当前文本为：" + sbr.toString());
    }
    
    /**
     * 恢复实现方法
     */
    public void redo(){
        System.out.println("调用恢复实现方法，字符串递加");
        this.sbr.append(count);
        count ++;
        System.out.println("当前文本为：" + sbr.toString());
    }
    
    /**
     * 执行实现方法
     */
    public void add(){
        System.out.println("调用执行实现方法，字符串递加");
        this.sbr.append(count);
        count ++;
        System.out.println("当前文本为：" + sbr.toString());
    }
}