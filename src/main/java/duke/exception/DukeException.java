package duke.exception;

/**
 * Class for exception from user input.
 */
public class DukeException {
    /**
     * Error message for exception.
     */
    private String message;
    /**
     * Constructor for DukeException.
     * @param message
     */
    public DukeException(String message) {
        this.message = message;
    }

    /**
     * Print error message to user.
     */
    public String throwDukeException() {
        return this.message;
    }
    /**
     * Prints error message for invalid input from user.
     */
    public static class InvalidInputException extends DukeException {
        public InvalidInputException() {
            super("Oh no!!! I'm sorry, but I don't know what that means!");
        }
    }

    /**
     * Prints error message for To-do command without description.
     */
    public static class EmptyTodoException extends DukeException {
        public EmptyTodoException() {
            super("Oh no!!! The description of a todo cannot be empty.");
        }
    }

    /**
     * Prints error message for Deadline command without description.
     */
    public static class EmptyDeadlineException extends DukeException {
        public EmptyDeadlineException() {
            super("Oh no!!! The description of a deadline cannot be empty.");
        }
    }

    /**
     * Prints error message for Deadline command without time.
     */
    public static class DeadlineWithoutByException extends DukeException {
        public DeadlineWithoutByException() {
            super("Oh no!!! A deadline must have a /by ");
        }
    }

    /**
     * Prints error message for Event command without description.
     */
    public static class EmptyEventException extends DukeException {
        public EmptyEventException() {
            super("Oh no!!! The description of a event cannot be empty.");
        }
    }

    /**
     * Prints error message for Event command without date.
     */
    public static class EventWithoutAtException extends DukeException {
        public EventWithoutAtException() {
            super("Oh no!!! An event must have a /at ");
        }
    }

    /**
     * Prints error message for mark command without index of the task.
     */
    public static class EmptyMarkingException extends DukeException {
        public EmptyMarkingException() {
            super("Oh no!!! Mark/Unmark must follow by a index of selected item.");
        }
    }

    /**
     * Prints error message for delete commanf without index of the task.
     */
    public static class EmptyDeleteException extends DukeException {
        public EmptyDeleteException() {
            super("Oh no!!! Delete must follow by a index of selected item.");
        }
    }

    /**
     * Prints error message for Deadline command without time.
     */
    public static class WrongDateFormat extends DukeException {
        public WrongDateFormat() {
            super("Oh no!!! Format for date should be yyyy-mm-dd without any spacings.");
        }
    }
}
