
class MyHashMap {
    int[] map;
    boolean[] present;

    public MyHashMap() {
        map = new int[1000001];
        present = new boolean[1000001];
    }

    public void put(int key, int value) {
        map[key] = value;
        present[key] = true;
    }

    public int get(int key) {
        if (present[key]) {
            return map[key];
        }
        return -1;
    }

    public void remove(int key) {
        present[key] = false;
    }
}
