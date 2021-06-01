/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1234;

/**
 *
 * @author LENOVO IDP 110
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    bt.addRekursif(6);
    bt.addRekursif(4);
    bt.addRekursif(8);
    bt.addRekursif(3);
    bt.addRekursif(5);
    bt.addRekursif(7);
    bt.addRekursif(9);bt.addRekursif(10);
    bt.addRekursif(15);
    bt.traversePreOrder(bt.root);
    System.out.print("");
    bt.traverseInOrder(bt.root);
    System.out.print("");
    bt.traversePostOrder(bt.root);
    System.out.print("");
    System.out.print("Find " + bt.find(5));
    bt.delete(8);
    bt.traversePreOrder(bt.root);
    System.out.print("");
    System.out.println("Nilai terbesar: " + bt.max(bt.root));
    System.out.println("Nilai terkecil: " + bt.min(bt.root));
    bt.dataLeaf(bt.root);
     System.out.println("Jumlah leaf: " + bt.jmlLeaf(bt.root));
}

}
