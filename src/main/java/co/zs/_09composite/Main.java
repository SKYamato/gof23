package co.zs._09composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 *
 * @author shuai
 * @date 2020/03/16 14:50
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node c1 = new LeafNode("c1");
        Node r1 = new LeafNode("r1");
        Node c11 = new LeafNode("c11");
        BranchNode a1 = new BranchNode("a1");
        Node f1 = new LeafNode("f1");
        Node g1 = new LeafNode("g1");
        root.add(chapter1).add(chapter2);
        chapter1.add(c1).add(r1);
        chapter2.add(c11).add(a1);
        a1.add(f1).add(g1);
        tree(root, 0);
    }

    private static void tree(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("--");
        }
        node.print();
        if(node instanceof BranchNode){
            for(Node n : ((BranchNode) node).nodes){
                tree(n, depth + 1);
            }
        }
    }
}

abstract class Node {
    abstract public void print();
}

class LeafNode extends Node {
    String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}

class BranchNode extends Node {
    String content;
    List<Node> nodes = new ArrayList<>();

    public BranchNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }

    public BranchNode add(Node node) {
        nodes.add(node);
        return this;
    }
}