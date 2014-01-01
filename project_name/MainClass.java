package project_name;

import org.powerbot.event.PaintListener;
import org.powerbot.script.Manifest;
import org.powerbot.script.PollingScript;
import project_name.tasks.TaskClass;
import project_name.util.Task;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.util.*;

@Manifest(authors = "",
            name = "",
            description = "",
            topic = 0,
            version = 0)
public class MainClass extends PollingScript implements PaintListener {
    private final ArrayList<Task> taskArrayList = new ArrayList<Task>();
    private final Queue<Task> taskQueue = new ListIterator<Task>();

    @Override
    public void start() {
        // Single Task //
            taskArrayList.add(new TaskClass(ctx));

        // Multiple Tasks //
            taskArrayList.addAll(Arrays.asList(new TaskClass(ctx),
                    new AnotherTaskClass(ctx),
                    new AndAnotherTaskClass(ctx)));
    }

    @Override
    public int poll(){
        for (Task task : taskArrayList) {
            if (task.activate()) {
                task.execute();
                return 0;
            }
        }
        return 0;
    }

    @Override
    public void repaint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        // Example of drawing the tile under your current player.
        graphics2D.drawPolygon(ctx.players.local().getLocation().getMatrix(ctx).getBounds());

        // Example of drawing the player model
        ctx.players.local().draw(graphics2D);

        // Example of drawing an object
        ctx.objects.select().id(-OBJECT ID HERE-).nearest().poll().draw(graphics2D);
    }
}
