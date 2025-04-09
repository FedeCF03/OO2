package ar.edu.info.unlp.ejer4P2;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private List<String> comments = new ArrayList<>();
    private State state;
    private Temporal inic;
    private Temporal finishedTime;

    /**
     * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
     */
    public ToDoItem(String name) {
    };

    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start() {
        InProgress progress = new InProgress();
        state.start(this);
    };

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */
    public void togglePause() {

    };

    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish() {

    };

    /**
     * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
     * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
     * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
     * genera un error informando la causa específica del mismo.
     */
    public Duration workedTime() {
        return state.workedTime(this);
    };

    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
     * contrario no hace nada."
     */
    public void addComment(String comment) {
    };

    public void setState(State s) {
        this.state = s;
    }

    public void setTimeStart() {
        this.inic = Instant.now();
    }

    public Duration calculateTime(Temporal t) {
        return Duration.between(this.inic, t);
    }

    public void setFinishedTime() {
        this.finishedTime = Instant.now();
    }

    public Temporal getfinishedTime() {
        return this.finishedTime;
    }
}
