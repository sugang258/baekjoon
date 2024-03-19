import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node1 {
    char data;
    Node1 lt, rt;
    public Node1(char val) {
        this.data = val;
        lt = rt = null;
    }
}

public class Main {
    Node1 root;
    public void PRE(Node1 root) {
        if (root == null) return;
        else{
            System.out.print(root.data);
            PRE(root.lt);
            PRE(root.rt);
        }
    }
    public void IN(Node1 root) {
        if (root == null) return;
        else{
            IN(root.lt);
            System.out.print(root.data);
            IN(root.rt);
        }
    }
    public void POST(Node1 root) {
        if (root == null) return;
        else{
            POST(root.lt);
            POST(root.rt);
            System.out.print(root.data);
        }
    }

    public void insert(char thisNode, char left, char right) {
        if(root == null) {
            root = new Node1(thisNode);
            if (left != '.') {
                root.lt = new Node1(left);
            }
            if (right != '.') {
                root.rt = new Node1(right);
            }
        }else{
            search(root,thisNode,left,right);
        }
    }
    
    public void search(Node1 root, char thisNode, char left, char right) {
        if(root == null) {
            return;
        }
        if(root.data == thisNode) {
            if(left != '.') {
                root.lt = new Node1(left);
            }
            if(right != '.') {
                root.rt = new Node1(right);
            }
        } else {
            search(root.lt,thisNode,left,right);
            search(root.rt,thisNode,left,right);
        }
    }

    public static void main(String[] args) throws IOException {
        Main tree = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            tree.insert(root,left,right);
        }

        tree.PRE(tree.root);
        System.out.println();
        tree.IN(tree.root);
        System.out.println();
        tree.POST(tree.root);
    }
}
