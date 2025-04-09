package ar.edu.info.unlp.ejer4P2;

import java.time.Duration;

public class Pending implements State {

    @Override
    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra iniciado");

    }

    @Override
    public void start(ToDoItem item) {
        item.setState(new InProgress());
        item.setTimeStart();
    }

    @Override
    public void finish(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra iniciado");

    }

    @Override
    public Duration workedTime(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra iniciado");

    }

}
