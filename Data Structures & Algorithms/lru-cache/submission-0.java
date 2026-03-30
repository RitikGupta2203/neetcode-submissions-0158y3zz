class LRUCache {

    class Pair {
        int key;
        int value;

        Pair(int k, int v){
            key = k;
            value = v;
        }
    }

    ArrayList<Pair> cache = new ArrayList<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {

        for(int i = 0; i < cache.size(); i++){

            Pair entry = cache.get(i);

            if(entry.key == key){

                int val = entry.value;

                cache.remove(i);
                cache.add(entry);

                return val;
            }
        }

        return -1;
    }

    public void put(int key, int value) {

        for(int i = 0; i < cache.size(); i++){

            Pair entry = cache.get(i);

            if(entry.key == key){

                cache.remove(i);
                cache.add(new Pair(key,value));

                return;
            }
        }

        if(cache.size() == capacity){
            cache.remove(0);
        }

        cache.add(new Pair(key,value));
    }
}