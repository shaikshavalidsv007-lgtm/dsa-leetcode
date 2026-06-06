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
