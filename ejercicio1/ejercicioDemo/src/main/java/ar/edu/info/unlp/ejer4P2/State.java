package ar.edu.info.unlp.ejer4P2;

import java.time.Duration;

public interface State {
    public void togglePause(ToDoItem item);

    public void start(ToDoItem item);

    public void finish(ToDoItem item);

    public Duration workedTime(ToDoItem item);

}
