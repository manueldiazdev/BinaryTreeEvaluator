/**
 * Manuel Diaz
 */
public class Node {
    String value;
    Node left;
    Node right;

    public Node(String data){
        this.value = data;
    } 
    public Node(String data, Node left, Node right){
        this.value = data;
        this.left = left;
        this.right = right;
    }
    public void print(int indent){
        for(int i =0; i < indent; i++){
            System.out.print("  ");
        }
        System.out.print("^->");
        System.out.print(value + "\n");
        if(left != null){
            left.print(indent+1);
        }
        if(right != null){
            right.print(indent+1);
        }
    }
    public double evaluate(){
        boolean isOperator = false;
        double valueDouble = 0.0;
        try{
            valueDouble = Double.parseDouble(value);
        }catch(NumberFormatException e){
            isOperator = true;
        }
        if(isOperator){
            //a switch statement with operators
            switch(value){
                case "+":
                    return left.evaluate() + right.evaluate(); 
                case "-":
                    return left.evaluate() - right.evaluate();
                case "*":
                    return left.evaluate() * right.evaluate();
                case "/":
                    return left.evaluate() / right.evaluate();
                case "%":
                    return left.evaluate() % right.evaluate();
                case "^":
                    return Math.pow(left.evaluate(), right.evaluate());
                default:
                    return 0.0;
            }
        }else{
            return valueDouble;
        }
    }
}
