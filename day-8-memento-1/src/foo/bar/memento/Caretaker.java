package foo.bar.memento;

public class Caretaker {

    private Memento savedStates;

    public void addMemento(Memento m) {
        savedStates = m;
    }

    public Memento getMemento() {
        return savedStates;
    }
}
