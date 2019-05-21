import java.util.List;

public class Node {

    private int n;
    private List<Node> nodes;

    public Node(int n, List<Node> nodes) {
        this.n = n;
        this.nodes = nodes;
    }

    public int getN() {
        return n;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void addChild(int n) {

    }

    public void listNodes(Node n) {
        for(Node node : nodes) {
            System.out.println(node);
        }
    }
}
