/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Gyarmati János
 */
public class SimpleLinkedList {
    //a listaelemet reprezentáló belső osztály:

    class Elem {

        Object obj;
        Elem next, prev;

        public Elem(Object obj, Elem next, Elem prev) {
            this.obj = obj;
            this.next = next;
            this.prev = prev;
        }
    }
    private Elem header;
    private int size;

    public SimpleLinkedList() {
        header = new Elem(null, null, null);
        header.next = header.prev = header;
    }

    public Object getFirst() {
        if (size == 0) {
            return null;
        }
        return header.next.obj;
    }

    public Object getLast() {
        if (size == 0) {
            return null;
        }
        return header.prev.obj;
    }
    
    public int size(){
        return size;
    }
    
    public void addFirst(Object obj){
        Elem newElem = new Elem(obj, header.next, header);
        header.next.prev = newElem;
        header.next = newElem;
        size++;
    }
    
    public void addLast(Object obj){
        Elem newElem = new Elem(obj,header,header.prev);
        header.prev.next = newElem;
        header.next = newElem;
        size++;
    }
    
    public void print(){
        Elem pointer = header.next;
        while (pointer != header){
            System.out.println(pointer.obj);
            pointer = pointer.next;
        }
    }
}
