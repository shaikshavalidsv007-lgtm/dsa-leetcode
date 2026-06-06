LL

LL understanding :

class Node {
        int data; 
        Node next;
        
        Node (int data1, Node next1){
            this.data  = data1;
            this.next  = next1;
        }
        
        Node (int data2) {
            this.data = data2;
            this.next = null;
        }
    }
class Main {
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        Node y = new Node(arr[0]);
        System.out.println(y.data);
        
    }
}




Converting Array to LL

class Node {
        int data; 
        Node next;
        
        Node (int data1, Node next1){
            this.data  = data1;
            this.next  = next1;
        }
        
        Node (int data2) {
            this.data = data2;
            this.next = null;
        }
    }
class Main {
    
    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover  = head;
        for(int i =1; i<arr.length; i++) {
           Node temp = new Node(arr[i]);
           mover.next =temp;
           mover = temp;
           
        }
        return head;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        
        Node head = convertArrToLL(arr);
        System.out.println(head.data);
     
        
    }
}




Traverse through LL


class Node {
        int data; 
        Node next;
        
        Node (int data1, Node next1){
            this.data  = data1;
            this.next  = next1;
        }
        
        Node (int data2) {
            this.data = data2;
            this.next = null;
        }
    }
class Main {
    
    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover  = head;
        for(int i =1; i<arr.length; i++) {
           Node temp = new Node(arr[i]);
           mover.next =temp;
           mover = temp;
           
        }
        return head;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        
        Node head = convertArrToLL(arr);
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp =temp.next;
        }
    }
}






Length Of LL




class Node {
        int data; 
        Node next;
        
        Node (int data1, Node next1){
            this.data  = data1;
            this.next  = next1;
        }
        
        Node (int data2) {
            this.data = data2;
            this.next = null;
        }
    }
class Main {
    
    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover  = head;
        for(int i =1; i<arr.length; i++) {
           Node temp = new Node(arr[i]);
           mover.next =temp;
           mover = temp;
           
        }
        return head;
    }
    
    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        
        Node head = convertArrToLL(arr);
        System.out.println(lengthOfLL(head));
    }
}








Search value in LL  class Node {
        int data; 
        Node next;
        
        Node (int data1, Node next1){
            this.data  = data1;
            this.next  = next1;
        }
        
        Node (int data2) {
            this.data = data2;
            this.next = null;
        }
    }
class Main {
    
    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover  = head;
        for(int i =1; i<arr.length; i++) {
           Node temp = new Node(arr[i]);
           mover.next =temp;
           mover = temp;
           
        }
        return head;
    }
    
    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    private static boolean checkIfPresent(Node head, int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) {
                return true;
            } 
            temp = temp.next;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        
        Node head = convertArrToLL(arr);
        System.out.println(lengthOfLL(head));
        System.out.println(checkIfPresent(head, 14));
        
    }
}     remove head  class Node {
        int data; 
        Node next;
        
        Node (int data1, Node next1){
            this.data  = data1;
            this.next  = next1;
        }
        
        Node (int data2) {
            this.data = data2;
            this.next = null;
        }
    }
class Main {
    
    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover  = head;
        for(int i =1; i<arr.length; i++) {
           Node temp = new Node(arr[i]);
           mover.next =temp;
           mover = temp;
           
        }
        return head;
    }
    
    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    private static boolean checkIfPresent(Node head, int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) {
                return true;
            } 
            temp = temp.next;
        }
        return false;
    }
    
    private static Node removeHead (Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
        
    }
    private static void print(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        
        Node head = convertArrToLL(arr);
        System.out.println(lengthOfLL(head));
        System.out.println(checkIfPresent(head, 14));
        print(head);
        head = removeHead(head);
        print(head);
        
        
    }
}






Remove Tail




class Node {
        int data; 
        Node next;
        
        Node (int data1, Node next1){
            this.data  = data1;
            this.next  = next1;
        }
        
        Node (int data2) {
            this.data = data2;
            this.next = null;
        }
    }
class Main {
    
    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover  = head;
        for(int i =1; i<arr.length; i++) {
           Node temp = new Node(arr[i]);
           mover.next =temp;
           mover = temp;
           
        }
        return head;
    }
    
    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    private static boolean checkIfPresent(Node head, int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) {
                return true;
            } 
            temp = temp.next;
        }
        return false;
    }
    
    private static Node removeHead (Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }
    
    private static Node removeTail (Node head){
        
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp =temp.next;
        }
        temp.next = null;
        return head;
        
    } 
    
    private static void print(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        
        Node head = convertArrToLL(arr);
        System.out.println(lengthOfLL(head));
        System.out.println(checkIfPresent(head, 14));
        print(head);
        head = removeHead(head);
        print(head);
        head = removeTail(head);
        print(head);
        
        
    }
}





Delete head in LL

class Solution {
    public ListNode deleteHead(ListNode head) {

        if(head == null) return head;

        ListNode temp = head;
        head = head.next;
        return head;
         
    }
}

Delete tail in LL


class Solution {
    public ListNode deleteTail(ListNode head) {

        if( head == null || head.next == null) {
            return null;
        }
        ListNode temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}


Delete Kth element in LL

class Solution {
    public ListNode deleteKthNode(ListNode head, int k) {
       if(head == null) return head;

       if(k==1) {
        ListNode temp = head;
        head = head.next;
        return head;
       }

       int count = 0;  ListNode prev = null;
       ListNode temp = head;
    while(temp!=null) {
         count++;
         if(count == k) {
            prev.next = prev.next.next;
            break;
         }
         prev = temp;
         temp = temp.next;
    }
    return head;
       
    }
}


Delete the value with X

class Solution {
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if(head == null) return head;

       if(head.data == X) {
        ListNode temp = head;
        head = head.next;
        return head;
       }

       ListNode prev = null;
       ListNode temp = head;
    while(temp!=null) {

         if(temp.data == X) {
            prev.next = prev.next.next;
            break;
         }
         prev = temp;
         temp = temp.next;
    }
    return head;
    }
}


Insertion at the head of Linked List

class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode temp = new ListNode(X, head);
        return temp;
    }
}



Insertion at the tail of Linked List

class Solution {
    public ListNode insertAtTail(ListNode head, int X) {
       if(head == null) return new ListNode(X);

       ListNode temp = head;

       while(temp.next!= null) {
        temp = temp.next;
       }
       ListNode newNode = new ListNode(X);
       temp.next = newNode;
       return head;
    }
}



Insertion at the Kth position of Linked List


class Solution {
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
       if(head == null) {
        return new ListNode(X);
       }

       if(K==1) {
        ListNode temp = new ListNode(X, head);
        return temp;
       }

       int count =0; ListNode temp = head;
       while (temp != null) {
        count++;
        if(count == K-1) {
            ListNode n = new ListNode(X);

            n.next = temp.next;
            temp.next = n;
            break;
        }
        temp = temp.next;
       }
       return head;
    }
}



Insertion before the value X in Linked List


class Solution {
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if(head == null) {
        return null;
       }

       if(head.data == X) {
        
        return new ListNode(val, head);
       }

        ListNode temp = head;
       while (temp.next != null) {
        
        if(temp.next.data == X) {
            ListNode n = new ListNode(val, temp.next);
            temp.next = n;
            return head;
        }
        temp = temp.next;
       }
       return head;
    }
}





Double LL


class Node {
    // Value of the node
    int data;        
    // Pointer to the next node
    Node next;      
    // Pointer to the previous node
    Node back;      

    // Constructor to initialize a node with data
    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}


Convert array to DLL



public class DLinkedList {

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2DLL(arr);
        print(head);
    }
}







Convert Array to Doubly Linked List



class Solution {
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
	
	if (arr == null || arr.size() == 0) {
            return null;
        }

       ListNode head = new ListNode(arr.get(0));
       ListNode prev = head;
       for(int i =1; i<arr.size(); i++) {
        ListNode temp = new ListNode(arr.get(i), prev, null);
        prev.next = temp;
        prev =temp;

       }
       return head;
    }
}




Delete head of Doubly Linked List



class Solution {
    public ListNode deleteHead(ListNode head) {

        if(head == null || head.next == null) {

            return null;
        }

        ListNode bef = head;
        head = head.next;
        head.prev = null;
        bef.next = null;

        return head;
	}
}


Delete Tail of Doubly Linked List


class Solution {
    public ListNode deleteTail(ListNode head) {
        
        if(head == null || head.next == null) {

            return null;
        }

        ListNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        ListNode prevTail = tail.prev;

        prevTail.next = null;
        tail.prev = null;
        return head;

    }
}



