/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minspantree;

/**
 *
 * @author zhuan
 */
public class MinSpanTree {

    /**
     * @param args the command line arguments
     */
    static int[][] graph=null;
    static int[][] spanTree=null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        readInput();
        generateMinSpanTree();
        System.out.println(sumOfTreePaths(spanTree));
    }

    /**
     * The method to read input into graph.
     */
    private static void readInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Generate the minimum spanning tree from graph into spanTree.
     */
    private static void generateMinSpanTree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the sum of path lengths of a tree.
     * @param spanTree The tree to be calculated.
     * @return The sum of all path lengths of the tree.
     */
    private static boolean sumOfTreePaths(int[][] spanTree) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
