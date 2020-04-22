package chap9.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @auther: hjy
 * @Date: 2020/4/22 16:34
 * @Description:
 */

public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }


    //添加子节点
    public void add(TreeNode node){
        children.add(node);
    }


    //删除子节点
    public void remove(TreeNode node){
        children.remove(node);
    }

    //获取字节点
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }


    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
