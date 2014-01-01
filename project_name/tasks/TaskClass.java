package project_name.tasks;

import org.powerbot.script.methods.MethodContext;
import project_name.util.Task;

public class TaskClass extends Task {

    public TaskClass(MethodContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return false;
    }

    @Override
    public void execute() {
    }
}
