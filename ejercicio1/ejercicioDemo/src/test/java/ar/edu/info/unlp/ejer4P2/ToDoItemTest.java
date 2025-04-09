package ar.edu.info.unlp.ejer4P2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
    ToDoItem item;

    @BeforeEach
    void setUp() {
        item = new ToDoItem("Task 1");
        item.start();

    }

    @Test
    void testStartPending() {

        assertTrue(item.getState() instanceof InProgress);
    }

    @Test
    void testTogglePauseInProgress() {

        item.togglePause();
        assertTrue(item.getState() instanceof Paused);
    }

    @Test
    void testAddCommentTerminado() {

        item.finish();
        item.addComment("Test comment");
        assertEquals(0, item.getComments().size());
    }
}