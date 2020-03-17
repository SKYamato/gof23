package co.zs._17command.v2;

/**
 * @author shuai
 * @date 2020/03/17 14:57
 */
public class ContinueCommand {
    public static void main(String[] args) {
        Content content = new Content("你好");
        InsertChain chain = new InsertChain(new InsertCommand(content, "-嗨-"));
        chain.doIt();
        chain.doIt();
        chain.doIt();
        chain.doIt();
        chain.doIt();
        System.out.println(content.msg);
        chain.undo();
        chain.undo();
        chain.undo();
        chain.undo();
        System.out.println(content.msg);
    }
}

class Content {
    String msg;

    public Content(String msg) {
        this.msg = msg;
    }
}

abstract class Command {
    public abstract void doIt();

    public abstract void unDo();
}

class InsertCommand extends Command {
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

class InsertChain {
    int index = 0;
    Command command;

    public InsertChain(Command command) {
        this.command = command;
    }

    public void doIt(){
        command.doIt();
        index++;
    }

    public void undo(){
        if(index > 0){
            command.unDo();
            index --;
        }
        return;
    }
}