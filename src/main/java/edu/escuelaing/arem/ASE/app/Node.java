package edu.escuelaing.arem.ASE.app;
/**
 *
 * @author Verbo Camacho Villamarin
 */
public class Node {
    private float valor;
    private Node next;
    /**
     * Builder of Node with value and next (null)
     * @param value
     */
    public Node(float value){
        this.next= null;
        this.valor= value;

    }

    /**
     * Method to return the Node's value
     * @return value float
     */
    public float getValue(){
        return valor;
    }

    /**
     * Method to return the next node of the head
     * @return next node
     */
    public Node getNext(){
        return next;
    }

    /**
     * Method to set the next node
     * @param next node
     * @return next node
     */
    public Node setNext(Node next){
        return this.next=next;
    }
}