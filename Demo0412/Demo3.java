
 class Node {
    int data;   //�ڵ�����
    Node leftChild; //���ӽڵ������
    Node rightChild; //���ӽڵ������
    boolean isDelete;//��ʾ�ڵ��Ƿ�ɾ��
     
    public Node(int data){
        this.data = data;
    }
    //��ӡ�ڵ�����
    public void display(){
        System.out.println(data);
    }
 
}
 interface Tree {
    //���ҽڵ�
    public Node find(int key);
    //�����½ڵ�
    public boolean insert(int data);
     
    //�������
    public void infixOrder(Node current);
    //ǰ�����
    public void preOrder(Node current);
    //�������
    public void postOrder(Node current);
     
    //�������ֵ
    public Node findMax();
    //������Сֵ
    public Node findMin();
     
    //ɾ���ڵ�
    public boolean delete(int key);
     
    //Other Method......
}
 class BinaryTree implements Tree {
    //��ʾ���ڵ�
    private Node root;
 
    //���ҽڵ�
    public Node find(int key) {
        Node current = root;
        while(current != null){
            if(current.data > key){//��ǰֵ�Ȳ���ֵ������������
                current = current.leftChild;
            }else if(current.data < key){//��ǰֵ�Ȳ���ֵС������������
                current = current.rightChild;
            }else{
                return current;
            }
        }
        return null;//������������û�ҵ�������null
    }
 
    //����ڵ�
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(root == null){//��ǰ��Ϊ������û���κνڵ�
            root = newNode;
            return true;
        }else{
            Node current = root;
            Node parentNode = null;
            while(current != null){
                parentNode = current;
                if(current.data > data){//��ǰֵ�Ȳ���ֵ���������ӽڵ�
                    current = current.leftChild;
                    if(current == null){//���ӽڵ�Ϊ�գ�ֱ�ӽ���ֵ���뵽�ýڵ�
                        parentNode.leftChild = newNode;
                        return true;
                    }
                }else{
                    current = current.rightChild;
                    if(current == null){//���ӽڵ�Ϊ�գ�ֱ�ӽ���ֵ���뵽�ýڵ�
                        parentNode.rightChild = newNode;
                        return true;
                    }
                }
            }
        }
        return false;
    }
     
    //�������
    public void infixOrder(Node current){
        if(current != null){
            infixOrder(current.leftChild);
            System.out.print(current.data+" ");
            infixOrder(current.rightChild);
        }
    }
     
    //ǰ�����
    public void preOrder(Node current){
        if(current != null){
            System.out.print(current.data+" ");
            infixOrder(current.leftChild);
            infixOrder(current.rightChild);
        }
    }
     
    //�������
    public void postOrder(Node current){
        if(current != null){
            infixOrder(current.leftChild);
            infixOrder(current.rightChild);
            System.out.print(current.data+" ");
        }
    }
    //�ҵ����ֵ
    public Node findMax(){
        Node current = root;
        Node maxNode = current;
        while(current != null){
            maxNode = current;
            current = current.rightChild;
        }
        return maxNode;
    }
    //�ҵ���Сֵ
    public Node findMin(){
        Node current = root;
        Node minNode = current;
        while(current != null){
            minNode = current;
            current = current.leftChild;
        }
        return minNode;
    }
     
    @Override
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = false;
        //����ɾ��ֵ���Ҳ���ֱ�ӷ���false
        while(current.data != key){
            parent = current;
            if(current.data > key){
                isLeftChild = true;
                current = current.leftChild;
            }else{
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null){
                return false;
            }
        }
        //�����ǰ�ڵ�û���ӽڵ�
        if(current.leftChild == null && current.rightChild == null){
            if(current == root){
                root = null;
            }else if(isLeftChild){
                parent.leftChild = null;
            }else{
                parent.rightChild = null;
            }
            return true;
             
            //��ǰ�ڵ���һ���ӽڵ㣬���ӽڵ�
        }else if(current.leftChild == null && current.rightChild != null){
            if(current == root){
                root = current.rightChild;
            }else if(isLeftChild){
                parent.leftChild = current.rightChild;
            }else{
                parent.rightChild = current.rightChild;
            }
            return true;
            //��ǰ�ڵ���һ���ӽڵ㣬���ӽڵ�
        }else if(current.leftChild != null && current.rightChild == null){
            if(current == root){
                root = current.leftChild;
            }else if(isLeftChild){
                parent.leftChild = current.leftChild;
            }else{
                parent.rightChild = current.leftChild;
            }
            return true;
        }else{
            //��ǰ�ڵ���������ӽڵ�
            Node successor = getSuccessor(current);
            if(current == root){
                root= successor;
            }else if(isLeftChild){
                parent.leftChild = successor;
            }else{
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return false;
         
    }
 
    public Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while(current != null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        //��̽ڵ㲻��ɾ���ڵ�����ӽڵ㣬����̽ڵ��滻ɾ���ڵ�
        if(successor != delNode.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
         
        return successor;
    }
     
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(50);
        bt.insert(20);
        bt.insert(80);
        bt.insert(10);
        bt.insert(30);
        bt.insert(60);
        bt.insert(90);
        bt.insert(25);
        bt.insert(85);
        bt.insert(100);
        bt.delete(10);//ɾ��û���ӽڵ�Ľڵ�
        bt.delete(30);//ɾ����һ���ӽڵ�Ľڵ�
        bt.delete(80);//ɾ���������ӽڵ�Ľڵ�
        System.out.println(bt.findMax().data);
        System.out.println(bt.findMin().data);
        System.out.println(bt.find(100));
        System.out.println(bt.find(200));
         
    }
 
}