def main():
    print("Name goes here")
    node1 = EvaluateTree(Node('+', Node('2.5'), Node('+', Node('7'), Node('3'))))
    print(node1.about())

    node1.printtree()
    print(node1.evaluatetree())

    


class Node():

    def __init__(self, string, left = None, right = None):
        self.value = string
        self.left = left
        self.right = right
    
    def printTree(self, indent):
        x = 0
        while x < indent:
            print("  ", end = "")
            x+=1

        print(f"+--{self.value}")
        if self.left != None:
            self.left.printTree(indent+1)
        if self.right != None:
            self.right.printTree(indent+1)
    def evaluate(self):
        try :  
            float(self.value) 
            num = True
        except : 
            num = False
        if num:
            return float(self.value)
        else:
            if self.value == '+':
                return float(self.left.evaluate()) + float(self.right.evaluate())
            elif self.value == '-':
                return float(self.left.evaluate()) - float(self.right.evaluate())
            elif self.value == '*':
                return float(self.left.evaluate()) * float(self.right.evaluate())
            elif self.value == '/':
                return float(self.left.evaluate()) / float(self.right.evaluate())
            elif self.value == '^':
                return float(self.left.evaluate()) ** float(self.right.evaluate())
            elif self.value == '%':
                return float(self.left.evaluate()) % float(self.right.evaluate())
    

class EvaluateTree():

    def __init__(self, root = None):
        self.root = root
    def about(self):
        return "Description"
    def printtree(self):
        self.root.printTree(0)
    def evaluatetree(self):
        return self.root.evaluate()

main()