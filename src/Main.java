/*
*Universidad del Valle de Guatemala
* Hoja 7 Algoritmos y estructuras de datos
* Roberto Figueroa 18306
* Michael Chan 18
*
* */

public class Main {

    public static void main(String[] args){
    //little dictionary
    BinarySearchTree myTree =  new BinarySearchTree();
    Association<String,String> objeto = new Association<>("dog","perro");
    Association<String,String> objeto1 = new Association<>("star","estrella");
    Association<String,String> objeto2 = new Association<>("door","puerta");
    myTree.inOrder();

    

    }
}
