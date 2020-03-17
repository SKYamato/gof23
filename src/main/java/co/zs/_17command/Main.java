package co.zs._17command;

/**
 * 命令模式
 * 封装命令的具体实现
 *
 * @author shuai
 * @date 2020/03/17 14:41
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content();
        content.msg = "abcdef";
        InsertCommand insertCommand = new InsertCommand(content, "你好");
        insertCommand.doIt();
        System.out.println(content.msg);
        insertCommand.unDo();
        System.out.println(content.msg);
    }
}

abstract class Command{
    public abstract void doIt();
    public abstract void unDo();
}

class Content{
    String msg;
}

class InsertCommand extends Command{
    Content content;
    String change;

    public InsertCommand(Content content, String change) {
        this.content = content;
        this.change = change;
    }

    @Override
    public void doIt() {
        content.msg = content.msg + change;
    }

    @Override
    public void unDo() {
        content.msg = content.msg.substring(0, content.msg.length() - change.length());
    }
}