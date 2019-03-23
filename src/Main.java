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
        Association<String,String> objeto3 = new Association<>("chair","silla");
        Association<String,String> objeto4 = new Association<>("car","carro");
        Association<String,String> objeto5 = new Association<>("table","mesa");
    myTree.insert(objeto);
    myTree.insert(objeto1);
        myTree.insert(objeto3);
    myTree.insert(objeto2);
        myTree.insert(objeto4);
        myTree.insert(objeto5);

    //System.out.println(myTree.search(myTree.getRoot(),"table").getValue());
    System.out.println(myTree.inOrder("car"));
    }
}
