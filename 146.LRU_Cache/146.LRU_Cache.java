import java.util.*;
class LRUCache {
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode post;
    }
    private void addNode(DLinkedNode node){
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }
    private void removeNode(DLinkedNode node){
        DLinkedNode pre = node.pre;
        DLinkedNode post = node.post;
        pre.post = post;
        post.pre = pre;
    }
    private void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }
    private DLinkedNode popTail(){
        DLinkedNode res = tail.pre;
        removeNode(res);
        return res;
    }
    private int capacity;
    private int count;
    private Hashtable<Integer,DLinkedNode> ht = new Hashtable<>();
    private DLinkedNode tail,head;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        head = new DLinkedNode();
        head.pre = null;
        tail = new DLinkedNode();
        tail.post = null;
        tail.pre = head;
        head.post = tail;
    }
    
    public int get(int key) {
        DLinkedNode node = ht.get(key);
        if(node==null) return -1;
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        DLinkedNode node = ht.get(key);
        if(node==null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            ht.put(key,newNode);
            addNode(newNode);
            count++;
            if(count>capacity){
                DLinkedNode tailNode = popTail();
                ht.remove(tailNode.key);
                --count;
            }
        }
        else{
            node.value = value;
            moveToHead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */