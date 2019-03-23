import java.text.Collator;
import java.util.Locale;

public class BinarySearchTree{

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
        usCollator.setStrength(Collator.SECONDARY);
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

    public String inOrder(String key){
        return (String)inorderRec(root, key);
    }
   /* public void inorderRec(Association root){
        if(root != null){
            inorderRec(root.getLeft());
            System.out.println(root.getKey());
            inorderRec(root.getRight());
        }
    }*/

    public Object inorderRec(Association root,String key){
        Object word = "";
        if(root != null){
            inorderRec(root.getLeft(),key);
            if(root.getKey().equals(key)){
                word = root.getValue();
            }
            inorderRec(root.getRight(),key);
        }
        else{
            word = "*" + key + "*";
        }
        System.out.println(word);
        return word;
    }



    public Association search(Association root, String key){

        if(root ==null || root.getKey().equals(key)) {
            return root;
        }
        if (usCollator.compare(root.getKey(),key)>0){
            System.out.print("hola");
            return search(root.getRight(),key);
        }


        System.out.print("adios");
        return search(root.getLeft(),key);

    }


    public Association getRoot(){
        return this.root;
    }




}

