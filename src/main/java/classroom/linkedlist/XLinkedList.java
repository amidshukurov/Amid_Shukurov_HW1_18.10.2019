package classroom.linkedlist;

import javax.swing.*;
import javax.transaction.xa.Xid;
import java.util.LinkedList;
import java.util.StringJoiner;

public class XLinkedList {

  public void revert() {
    XItem previous = null;
    XItem current = head;
    XItem next;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    head = previous;
  }
  public XItem recursiveReverse(XItem head) {
    XItem first;
    if (head.next == null){
      return head;
    }
    first = recursiveReverse(head.next);
    head.next.next = head;
    head.next = null;
    return first;
  }
  public void recursiveReverse() {
    head = recursiveReverse(head);
  }


  public class XItem {
    public int value;
    public XItem next;

    public XItem(int value) {
      this.value = value;
    }
  }

  public void setHead(XItem head) {
    this.head = head;
  }

  private XItem head;

  public XItem getHead() {
    return head;
  }

  public void add(int value) {
    XItem item = new XItem(value);
    if (head == null) {
      head = item;
    } else {
      XItem current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = item;
    }
  }

  public void remove(int value) {
    XItem curr = head;
    XItem prev = null;
    while (curr != null) {
      if (curr.value == value) {
        if (prev == null) {
          head = head.next;
          break;
        }
        prev.next = curr.next;
        break;
      }
      prev = curr;
      curr = curr.next;
    }
  }

  boolean contains(int value){
    XItem current = head;
    while (current!=null){
     if (current.value==value) return true;
      current = current.next;
    }
    return false;
  }
  boolean contains_for(int value){
    for (XItem current = head; current!=null;current=current.next){
      if (current.value==value) return true;
    }
    return false;
  }

  @Override
  public String toString() {
    StringJoiner sj = new StringJoiner(",","[","]");
    String s ="";
    for (XItem current = head; current!=null;current=current.next){
      sj.add(String.valueOf(current.value));
    }
    return  sj.toString();
  }

  public int lenght(){
    int l =0;
    for (XItem current = head; current!=null;current=current.next){
      l++;
    }
    return l;
  }
  public int lenght_recurtion(XItem current){
    if(current==null) return 0;
    return 1+lenght_recurtion(current.next);
  }
  public int lenght_recurtion(){
      return lenght_recurtion(head);
  }

  private int lengthr2(XItem current, int i) {
    if (current == null) return i;
    //i=i+1;
    return lengthr2(current.next, i+1);

  }

  public int lengthr2() {
    return lengthr2(head,0);
  }


}
