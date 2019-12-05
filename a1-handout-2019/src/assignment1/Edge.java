package assignment1;

public class Edge {
    private Warehouse w;
    private ItemType type;
    public Edge(Warehouse w,ItemType type){
        this.w = w;
        this.type = type;
    }
    public Warehouse getWarehouse() {return w;}
    public ItemType getType() {return type;}

    @Override
    public String toString() {
        return w.getName() + " " + type.toString();
    }
}
