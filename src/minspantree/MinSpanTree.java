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

    /**
     * Get all neighbour of a node which are not included in the spanTree.
     * A neighbour node should contain 2 information: the incoming node id and the path length from the incoming node.
     * @param node the node to process 
     * @return a list of neighbour nodes which are not included in the spanTree.
     * 
     */
    private static ArrayList<Integer[]> getPrepareNodes(int node) {
        
    }

    /**
     * Merge the new neighbour nodes into the prepareNodes. 
     * If a neighbour node is already in the prepareNodes, the new path value should be updated if smaller and 
     * the incoming node id should also be updated.
     * @param prepareNodes The old prepareNodes
     * @param nodes the new neighbour nodes.
     * @return the new prepareNodes.
     */
    private static Hashtable<Integer, Integer[]> mergePrepareNodes(Hashtable<Integer, Integer[]> prepareNodes, ArrayList<Integer[]> nodes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the node that has the minimum path length towards the spanTree.
     * @param prepareNodes The nodes to be considered(compared). 
     * @return the id of the node that has the minimum path length towards the spanTree.
     */
    private static int getMinNode(Hashtable<Integer, Integer[]> prepareNodes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Add a new node to the spanTree.
     * @param node the node to be added to the spanTree
     * @param nodeInfo the information of the node. 
     * Contains the incoming node id and the path length from the incoming node. 
     */
    private static void addToSpanTree(int node, Integer[] nodeInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
