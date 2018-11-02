# 146.LRU_Cache
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.


# Example :
```
LRUCache cache = new LRUCache( 2 /* capacity */ );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4

```



# My Solution :
```
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

```
