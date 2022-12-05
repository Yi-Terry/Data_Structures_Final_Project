//package finalProject;
public class BTStrings {
    private BtNode rootNode;

    public void BtStrings(){
        rootNode=null;
    }
    public void insert(String data){
        rootNode = insert(rootNode, data);
    }

    //Method to insert strings into tree
    private BtNode insert(BtNode node, String data){
        if(node == null){
            node = new BtNode(data);
        }else{
            if(node.getLeft()==null){
                node.right = insert(node.right, data);
            }else{
                node.left = insert(node.left, data);
            }
        }
        return node;
    }

    public String search(String data){
        return searchForString(rootNode, data);
    }
    //Method to search for a string;not used but here just in case.
    public String searchForString(BtNode r, String value){
        String something = null;
        if(r.getData() ==null){
           something= "string not found";
        }
        return something;
    }

    public void inorder() {
        inorder(rootNode);
    }
    private void inorder(BtNode r){
        if(r!=null){
            inorder(r.getLeft());
            System.out.println(r.getData()+"");
            inorder(r.getRight());
        }
    }

}
