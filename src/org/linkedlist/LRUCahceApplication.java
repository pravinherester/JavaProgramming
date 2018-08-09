package org.linkedlist;

import java.util.HashMap;

class LRUCahce {
    int capacity;
    HashMap<Integer, DLLNode> map = new HashMap<Integer, DLLNode>();
    DLLNode head = null;

    void insertatfront(int a) {
        DLLNode newNode = new DLLNode(a);
        
        if(head!=null)
        {
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        }
        else
        {
            head=newNode;
   }


    }

    void insetAfter(DLLNode prevNode, int a)
    {
        DLLNode newNode = new DLLNode(a);
        if(prevNode==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=prevNode.next;
            newNode.prev=prevNode;
            prevNode.next=newNode;
        }
    }
    void insertatLast(int a) {
        DLLNode newNode = new DLLNode(a);
        DLLNode last=head;
        
      if(head==null)
      {
        head=newNode;
      
    }
        else
        {
            while(last.next!=null)
            {
                last=last.next;
            }
            
            last.next=newNode;
            newNode.prev=last;
            newNode.next=null;
            
        }
    }
      

    

    void display() {
        while (head != null) {
            System.out.println(head.key);
            head = head.next;
        }
    }
}

class DLLNode {
    DLLNode next;
    DLLNode prev;
    int key;

    public DLLNode(int key) {
        this.key = key;

    }

}

public class LRUCahceApplication {
    public static void main(String[] args) {
        LRUCahce lru = new LRUCahce();
        
        lru.insertatfront(5); lru.insertatfront(6);
          
          lru.insertatfront(7); lru.insertatfront(8);
         

        lru.insertatLast(5);
        lru.insertatLast(6);

        lru.insertatLast(7);
        lru.insertatLast(8);
        lru.display();
    }

}