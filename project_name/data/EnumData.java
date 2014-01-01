package project_name.data;

public enum  EnumData {
    COPPER(0, "Copper Ore", 12345),
    IRON(0, "Iron Ore", 123456);

    final int itemId, objectId;
    final String itemName;

    private EnumData(int itemId, String itemName, int objectId){
        this.itemId = itemId;
        this.itemName = itemName;
        this.objectId = objectId;
    }

    public int getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public int getObjectId() { return objectId; }
}
