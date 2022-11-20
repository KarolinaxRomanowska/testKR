/*
Stwórz drzewo binarne liczb w którym liczby większe są po prawej stronie, a mniejsze po lewej.
 Należy stworzyć klasę Tree która posiada referencję do węzła będącego korzeniem.
 Do reprezentacji węzła stwórz klasę Node. Klasa Tree powinna mieć metody add(int value),
 która dodaje element do drzewa, contains(int value), która sprawdza czy w drzewie znajduje się dana wartość,
 max(), która zwraca największą liczbę w drzewie oraz min(), która zwraca najmniejszą liczbę w drzewie.
 Klasa Node może zawierać dowolne metody potrzebne do rozwiązania, można tworzyć dowolną ilość innych klas w ramach potrzeb.
*/

public class Tree {

    private Node node = new Node();

    public void add (int value) {
        if (node == null){
            node.setValue(value);
        } else {
            addNode(value,node);
        }

    }

    public boolean contains(int value){
        return containsNode(value,node);
    }

    public int min(){
        return minNode(node);
    }

    public int max(){
        return maxNode(node);
    }

    public void addNode(int value, Node node){
        if (node.getValue() < value){
            if (node.getNodeUP()==null){
                node.setNodeUP(new Node());
                node.getNodeUP().setValue(value);
            } else{
                addNode(value,node.getNodeUP());
            }
        } else if (node.getValue() > value){
            if (node.getNodeDown()==null){
                node.setNodeDown(new Node());
                node.getNodeDown().setValue(value);
            } else{
                addNode(value,node.getNodeDown());
            }
        }

    }

    boolean b;
    public boolean containsNode(int value,Node node) {
        if (node == null){
            b = false;
        } else if (node.getValue() == value){
            b = true;
        }else if (node.getValue() < value){
            b = containsNode(value,node.getNodeUP());
        }else if (node.getValue() > value){
            b = containsNode(value,node.getNodeDown());
        }
        return b;
    }

    public int maxNode (Node node) {
        if (node.getNodeUP()==null){
            return node.getValue();
        }
        return maxNode(node.getNodeUP());
    }

    public int minNode(Node node) {
        if (node.getNodeDown()==null){
            return node.getValue();
        }
        return minNode(node.getNodeDown());

    }
}
