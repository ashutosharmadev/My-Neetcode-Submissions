class DynamicArray {
    private int[] arr;
    private int length;
    private int capacity;
    public DynamicArray(int capacity) {
        this.capacity= capacity;
        this.length=0;
        this.arr= new int[this.capacity];
    }
    // Get a value based on the ith index
    public int get(int i) {
        return arr[i];
    }
    // Insert value n at ith index
    public void set(int i, int n) {
        arr[i]=n;
    }
    // Insert n in last position of the array 
    public void pushback(int n) {
        if (length==capacity) { // to check whether array is full
            resize();
        } 
        arr[length]=n;
        length++;
    }
    // Remove the last element in the array
    public int popback() {
        if (length>0){
            length--;
        }
        return arr[length];
    }

    private void resize() {
        capacity*=2;
        int[] newArr= new int[capacity];
        for (int i=0;i<length;i++){
            newArr[i]=arr[i]; // this is for copying all the elements from old array into the newer capacity array
        }
        arr= newArr;
    }

    public int getSize() {
        return length;

    }

    public int getCapacity() {
        return capacity;
    }
}
