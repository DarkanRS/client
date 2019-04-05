import java.awt.Point;

public class Node {

    public long data;

    public Node next;

    public Node prev;

    public void remove() {
        if (this.prev != null) {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
    }

    public boolean isLinked() {
        return this.prev != null;
    }
}
