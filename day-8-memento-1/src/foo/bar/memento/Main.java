package foo.bar.memento;

public class Main {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        originator.set("State1");
        caretaker.addMemento(originator.saveToMemento());

        originator.restoreFromMemento(caretaker.getMemento());
    }

}
