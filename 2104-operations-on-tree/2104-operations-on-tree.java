class LockingTree {
    private int  parent[];
    private Map<Integer,Integer> locked;
    private List<List<Integer>> child;
    public LockingTree(int[] parent) {
        this.parent = parent;
        this.locked = new HashMap<>();
        int n = parent.length;
        this.child = new ArrayList<>();
        for(int i =0;i<n;i++){
            child.add(new ArrayList<>());
        }
        for(int i =1;i<n;i++){
            child.get(parent[i]).add(i);
        }
    }
    
    public boolean lock(int num, int user) {
        if(locked.containsKey(num)) return false;
        locked.put(num,user);
        return true;
    }
    
    public boolean unlock(int num, int user) {
        if(!locked.containsKey(num)) return false;
        if(locked.get(num) != user) return false;
        locked.remove(num);
        return true;
    }
    
    public boolean upgrade(int num, int user ){
        if(locked.containsKey(num)) return false;
        int curr = parent[num];
        while(curr != -1){
                if(locked.containsKey(curr)) return false;
                curr = parent[curr];
        }
        if(!hasLockedDescendant(num)) return false;
        
        unlockAllDescendants(num);
        locked.put(num,user);
        return true;
    }
    private boolean hasLockedDescendant(int num){
        for(int c : child.get(num)){
            if(locked.containsKey(c)) return true;
            if(hasLockedDescendant(c)) return true;
            
        }
        return false;
    }
    private void unlockAllDescendants(int num){
        for(int c : child.get(num)){
            
            locked.remove(c);
            unlockAllDescendants(c);
        }
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */