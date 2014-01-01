package project_name.tasks;

import org.powerbot.script.methods.MethodContext;
import project_name.data.EnumData;
import project_name.util.Task;

public class TaskClassEX2 extends Task{
    final int itemId, objectId;
    final String itemName;

    public TaskClassEX2(MethodContext ctx, EnumData enumData) {
        super(ctx);
        this.itemId = enumData.getItemId();
        this.itemName = enumData.getItemName();
        this.objectId = enumData.getObjectId();
    }

    @Override
    public boolean activate() {
        // Just an example of usage!
        return ctx.backpack.select().id(itemId).count() > 0;
    }

    @Override
    public void execute() {
        System.out.println("Our ItemId = "+itemId);
        System.out.println("Our ObjectId = "+objectId);
        System.out.println("Our ItemName = "+itemName);
    }
}
