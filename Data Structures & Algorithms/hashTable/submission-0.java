// We implement a Singly Linked List to address collision that may occur
class Node {
    int key;
    int value;
    Node next;
//Constructor to help fill in the values in the linked list
    public Node(int key, int value) {
        this.key=key;
        this.value=value;
        this.next=null; // when creating node the next node is null
    }
}

class HashTable {
    private int capacity;
    private int size;
    private Node[] table;

    public HashTable(int capacity) {
        this.capacity=capacity;
        this.size=0;
        this.table= new Node[this.capacity];
    }
    private int hashFunction(int key){
        return key%this.capacity; //Maps any key to a bucket index; eg. 9%4=1
    }
    public void insert(int key, int value) {
        int index = this.hashFunction(key);
        Node node= this.table[index];
        // Case 1: If bucket is empty 
        if (node==null){
            this.table[index]=new Node(key,value);
                this.size++;
        } else{
            // Case 2: If bucket has a chain, search for the key and update it
                Node prev= null;
                while (node!= null){
                    if(node.key==key){
                        //Key exists and update the value without incrementing size
                        node.value=value;
                        return;
                    }
                    prev=node;
                    node= node.next;
                }
                // Case 3: Key not found, add at the end of the chain
                prev.next=new Node(key,value);
                this.size++;
        }
        // Check load factor and resize if necessary
        if ((double) this.size/this.capacity>=0.5){
            this.resize();
        }
    }

    public int get(int key) {
        int index=this.hashFunction(key);
        Node node = this.table[index]; // Start at the head of the bucket
        // Traverse the linked list at this bucket 
        while(node!=null){
            if (node.key==key){
                return node.value;
            }
            node=node.next;
        }
        return -1; // Key not found
    }

    public boolean remove(int key) {
        int index= this.hashFunction(key);
        Node node= this.table[index];
        Node prev=null;
        // Traverse the chain
        while (node!=null){
            if(node.key==key){
                // If key is found, Remove by updating the previous node's pointer
                if(prev!=null){
                    prev.next=node.next; // Skip the current node
                } else{
                    // Current node is at the head of the bucket
                    this.table[index]=node.next;
                }
                this.size--;
                return true;
            }
            prev=node;
            node=node.next;
        }
        return false; //Key not found
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
    // We have to resize the array the moment it becomes half full
    public void resize() {
        int newCapacity=this.capacity*2;
        Node[] newTable= new Node[newCapacity];

    //Rehash all existing entries
    for (Node node: this.table){
        // Compute new index with new capacity
        while (node!=null){
            int index= node.key%newCapacity;
            // Insert into new Table
            if (newTable[index]==null){
                newTable[index]=new Node(node.key,node.value);
            } else{
                // Find the end of the chain and append 
                Node newNode= newTable[index];
                while (newNode.next!=null){
                    newNode=newNode.next;
                }
                newNode.next=new Node(node.key,node.value);
           }
            node=node.next;
        }
    }
    // Update the table and capacity
    this.capacity=newCapacity;
    this.table=newTable;   
    }
}
