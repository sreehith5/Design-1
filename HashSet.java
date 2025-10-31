class MyHashSet {

    int n;
    boolean[][] stor;

    public MyHashSet() {
        n = 1000;
        stor = new boolean[1001][];
    }
    
    public void add(int key) {
        int h1 = hash1(key), h2 = hash2(key);
        if(stor[h1]==null){
            stor[h1] = new boolean[n];
        }
        stor[h1][h2] = true;
    }
    
    public void remove(int key) {
        int h1 = hash1(key), h2 = hash2(key);
        if(stor[h1]!=null){
            stor[h1][h2] = false;
        }
    }
    
    public boolean contains(int key) {
        int h1 = hash1(key), h2 = hash2(key);
        if(stor[h1]==null) return false;
        return stor[h1][h2];
    }

    private int hash1(int k){
        return k/n;
    }

    private int hash2(int k){
        return k%n;
    }
}