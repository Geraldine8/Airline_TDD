public enum PlaneType {
    BOEING747(4, 80 ),
    AIRBUS(10, 100),
    BIPLANE(2, 20),
    PRIVATE(10, 100),
    SEAPLANE(8, 80 );

    public int capacity;
    public int weight;


    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
