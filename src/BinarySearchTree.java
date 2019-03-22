import java.text.Collator;
import java.util.Locale;

public class BinarySearchTree {

    Association left;
    Association right;
    Association root;
    Collator usCollator = Collator.getInstance();


    public BinarySearchTree(){
        root = null;
    }
    public void insert(Association item){
        root = insertRec(root,item);
    }

    public Association insertRec(Association root, Association item){
        usCollator.setStrength(Collator.PRIMARY);
        if(root == null){
            root = new Association(item.getKey(),item.getValue());
            return root;
        }
        if(usCollator.compare(item.getKey(),root.getKey())<0){ //means it is less than
            root.setLeft(insertRec(root.getLeft(),item));
        }
        else if(usCollator.compare(item.getKey(),root.getKey())>0){ //means it is gratter than
            root.setRight(insertRec(root.getRight(),item));
        }
        return root;
    }

    public void inOrder(){
        inorderRec(root);
    }
    public void inorderRec(Association root){
        if(root != null){
            inorderRec(root.getLeft());
            System.out.println(root.getKey());
            inorderRec(root.getRight());
        }
    }

}

