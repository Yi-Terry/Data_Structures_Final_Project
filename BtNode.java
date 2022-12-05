//package finalProject;
public class BtNode {
    BtNode left, right;
    String data;

    //default constructor
    public BtNode(){
        left = null;
        right = null;
        data ="";
    }
    //Constructor
    public BtNode(String string){
        left = null;
        right = null;
        data = string;
    }

    public void setLeft(BtNode string){
        left = string;
    }

    public void setRight(BtNode string){
        right = string;
    }

    public BtNode getLeft(){
        return left;

    }



    public BtNode getRight() {
        return right;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData(){
        return data;
    }
}
