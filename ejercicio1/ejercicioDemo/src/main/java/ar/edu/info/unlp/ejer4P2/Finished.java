package ar.edu.info.unlp.ejer4P2;

import java.time.Duration;
import java.time.Instant;

public class Finished implements State {

    @Override
    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ya esta finalizo");
    }

    @Override
    public void start(ToDoItem item) {
    }

    @Override
    public void finish(ToDoItem item) {
    }

    @Override
    public Duration workedTime(ToDoItem item) {
        return item.calculateTime(item.getfinishedTime());

    }

}
