/**
 * Manuel Diaz
 */
public class EvaluateTree{
    private Node root;
     
    public EvaluateTree(){
    }
    public EvaluateTree(Node root){
        this.root = root;
    }
    public String about(){
        return "Assignment 2 by Manuel Diaz\nP.S. I love candy.";
    }
    public void print(){
        root.print(0);
    }
    public double evaluate(){
        return root.evaluate();
    }
}