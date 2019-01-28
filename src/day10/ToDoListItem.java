package day10;

public class ToDoListItem {

    private State state;
    private String description;

    public ToDoListItem(String description) {
        this.state = State.TODO;
        this.description = description;
    }

    public void startProgress() {
        this.state = State.IN_PROGRESS;
    }

    public void markDone() {
        this.state = State.DONE;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    enum State {TODO, IN_PROGRESS, DONE}
}
