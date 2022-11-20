public class Node {
    private int value;
    private Node nodeUP;
    private Node nodeDown;

    public Node() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNodeUP() {
        return nodeUP;
    }

    public void setNodeUP(Node nodeUP) {
        this.nodeUP = nodeUP;
    }

    public Node getNodeDown() {
        return nodeDown;
    }

    public void setNodeDown(Node nodeDown) {
        this.nodeDown = nodeDown;
    }
}
