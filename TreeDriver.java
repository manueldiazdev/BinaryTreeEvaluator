/**
 * Manuel Diaz
 */
public class TreeDriver{
    public static void main(String[] args) {
        
        //First test [5+7%2]
        Node firstTest = new Node("+", new Node("5"), new Node("%", new Node("7"), new Node("2")));
        EvaluateTree testTree = new EvaluateTree(firstTest);
        testTree.print();
        System.out.printf("The answer to 5+7%%2 is %.2f\n\n", testTree.evaluate());
        
        //Second Test [((5 * 26) + ((20 - 12) / 2))]
        Node secondTest = new Node("+", new Node("*", new Node("5"), new Node("26")), new Node("/", new Node("-", new Node("20"), new Node("12")), new Node("2")));
        testTree = new EvaluateTree(secondTest);
        testTree.print();
        System.out.printf("The answer to ((5 * 26) + ((20 - 12) / 2)) is %.2f\n\n", testTree.evaluate());
        
        //Third Test [2.5^(1+4)]
        Node thirdTest = new Node("^", new Node("2.5"), new Node("+", new Node("1"), new Node("4")));
        testTree = new EvaluateTree(thirdTest);
        testTree.print();
        System.out.printf("The answer to 2.5^(1+4) is %.2f\n\n", testTree.evaluate());
        
        //About me
        System.out.printf(testTree.about());
        

    }

} 
