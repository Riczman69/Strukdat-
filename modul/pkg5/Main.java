/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg5;

/**
 *
 * @author 62813
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.println("\npreOrder  : ");
        pohon.preOrder(pohon.root);
        System.out.println("\ninOrder   : ");
        pohon.inOrder(pohon.root);
        System.out.println("\npostOrder : ");
        pohon.postOrder(pohon.root);

    }

}

