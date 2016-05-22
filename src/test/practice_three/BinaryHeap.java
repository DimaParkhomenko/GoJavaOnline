package test.practice_three;
import java.util.Arrays;
/**
 Реалізуйте структуру даних  - Бінарна Купа (Binary Heap).
 Конструктор проймає один параметр size.
 Методи insert(int) що працює за O(logN) і poll(),
 який видаляє і повертає максимальне число з купи і також працює за O(logN).
 */
public class BinaryHeap {
    private int[] heap;
    private int heapSize;

    public BinaryHeap(int size){
        heap = new int[size];
        heapSize = 0;
        Arrays.fill(heap, -1);
    }

    public int insert(int val){
        int tmp;
        int insertPoint = heapSize;

        if(this.isFull() || val < 0){
            throw new HeapException();
        }

        heap[heapSize] = val;

        for(int i = getHeapSize(); getParent(i) >= 0; i = insertPoint) {
            if (val < heap[getParent(i)]) {
                tmp = heap[getParent(i)];
                heap[getParent(i)] = heap[i];
                heap[i] = tmp;
                insertPoint = getParent(i);
            }else if(val == heap[getParent(i)]){
                throw new HeapException();
            }
            else{
                insertPoint = i;
                break;
            }
        }
        heapSize++;
        return insertPoint;
    }

    public int poll(){
        if(this.isEmpty()){
            throw new HeapException();
        }
        int result = heap[0];
        int key = heap[heapSize - 1];
        int tmp;
        int insertPoint;

        heap[0] = key;
        heap[heapSize - 1] = -1;
        heapSize--;

        for(int i = 0; i < this.getHeapSize() - 1; i = insertPoint){
            if(key > getLeftChild(key)){
                tmp = getLeftChild(key);
                heap[i] = tmp;
                heap[2 * i + 1] = key;
                insertPoint = 2 * i + 1;
            }else if(key > getRightChild(key)){
                tmp = getRightChild(key);
                heap[i] = tmp;
                heap[2 * i + 2] = key;
                insertPoint = 2 * i + 2;
            }else{
                break;
            }
        }

        return result;
    }

    public int peek(){
        if(this.isEmpty()){
            throw new HeapException();
        }
        return heap[0];
    }

    public boolean contains(int key){
        for(int i = 0; i < this.heapSize; i++){
            if(heap[i] == key){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        if(this.heapSize == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.heapSize == heap.length){
            return true;
        }
        return false;
    }

    public int getParent(int key){
        int parent = -1;
        if(key > 0){
            parent = (key - 1) / 2;
        }
        return parent;
    }

    public int getLeftChild(int key){
        for(int i = 0; (2 * i + 1) < this.heapSize; i++){
            if(heap[i] == key){
                return heap[2 * i + 1];
            }
        }
        return -1;
    }

    public int getRightChild(int key){
        for(int i = 0; (2 * i + 2) < this.heapSize; i++){
            if(heap[i] == key){
                return heap[2 * i + 2];
            }
        }
        return -1;
    }

    public int getHeapSize(){
        return this.heapSize;
    }

    public int[] getHeap(){
        return this.heap;
    }
}

class HeapException extends RuntimeException{
}