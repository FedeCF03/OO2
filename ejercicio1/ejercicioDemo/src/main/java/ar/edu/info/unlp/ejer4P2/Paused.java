package ar.edu.info.unlp.ejer4P2;

import java.time.Duration;
import java.time.Instant;

public class Paused implements State {

    @Override
    public void togglePause(ToDoItem item) {
        item.setState(new InProgress());
    }

    @Override
    public void start(ToDoItem item) {
        throw new RuntimeException("El objeto ya esta iniciado");
    }

    @Override
    public void finish(ToDoItem item) {
        item.setState(new Finished());
        item.setFinishedTime();

    }

    @Override
    public Duration workedTime(ToDoItem item) {
        return item.calculateTime(Instant.now());
    }

}
