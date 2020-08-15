/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minspantree;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class MinSpanTree {

    /**
     * @param args the command line arguments
     */
    static int[][] graph = null;
    static int[][] spanTree = null;

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
        Scanner sc = new Scanner(System.in);
        int path = sc.nextInt();
        int nodes = sc.nextInt();
        graph = new int[nodes][nodes];
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                graph[i][j] = -1;
            }
        }
        spanTree = new int[nodes][nodes];
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                spanTree[i][j] = -1;
            }
        }
        for (int i = 0; i < path; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a][b] = c;
            graph[b][a] = c;
        }
    }

    /**
     * Generate the minimum spanning tree from graph into spanTree.
     */
    private static void generateMinSpanTree() {
        Hashtable<Integer,Integer[]> prepareNodes=new Hashtable() ;    
        int minNode=0;
        while (true) {
            ArrayList<Integer[]> nodes=getPrepareNodes(minNode);
            prepareNodes=mergePrepareNodes(prepareNodes,nodes);
            if (prepareNodes.isEmpty()) break;
            minNode=getMinNode(prepareNodes);
            addToSpanTree(minNode,prepareNodes.get(minNode));
            prepareNodes.remove(minNode);
        }
    }

    /**
     * Get the sum of path lengths of a tree.
     *
     * @param spanTree The tree to be calculated.
     * @return The sum of all path lengths of the tree.
     */
    private static int sumOfTreePaths(int[][] spanTree) {
        int sum=0;
        for(int i=0;i<spanTree.length;i++){
            for(int j=0;j<spanTree[0].length;j++){
               if(spanTree[i][j]>=0){
                    sum+=spanTree[i][j]; 
               }              
            }
        }
        return sum;
    }

    private static ArrayList<Integer[]> getPrepareNodes(int minNode) {
        
    }

    private static Hashtable<Integer, Integer[]> mergePrepareNodes(Hashtable<Integer, Integer[]> prepareNodes, ArrayList<Integer[]> nodes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int getMinNode(Hashtable<Integer, Integer[]> prepareNodes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addToSpanTree(int minNode, Integer[] get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
