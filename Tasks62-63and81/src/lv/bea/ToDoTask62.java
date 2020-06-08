package lv.bea;


//uzd 62 todolist samainīt at atsevisku metodi
// Izveidot klasi t odo ar pēc jūsu domām vajadzīgajiem properties. Obligāti ir jābūt property Done (bool). Izveidot klasē metodi MarkAsDone, kura kā parametru saņem bool tipa mainīgo isDone (tā vērtība var būt true vai false). Šī metode MarkAsDone ir vienīgā, kura drīkst samainīt properties Done vērtību.

public class ToDoTask62 {
    private String task;

    @Override
    public String toString() {
        return "ToDo{" +
                "task='" + task + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }

    private String description;
    private boolean done;

    public ToDoTask62(String task, String description) {
        this.task = task;
        this.description = description;
    }

    public boolean MarkAsDone(boolean isDone){
        this.done = isDone;
        return done;
    }

}
