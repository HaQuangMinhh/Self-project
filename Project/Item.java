package Nhap1;

abstract class Item {
    private int ItemId ; 
    private String ItemTitle ; 
    private String ItemStatus ;
    
    
    public Item(int itemId, String itemTitle) {
        ItemId = itemId;
        ItemTitle = itemTitle;
        ItemStatus = "available"; 
    }


    public int getItemId() {
        return ItemId;
    }
    public void setItemId(int itemId) {
        ItemId = itemId;
    }
    public String getItemTitle() {
        return ItemTitle;
    }
    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }
    public String getItemStatus() {
        return ItemStatus;
    }
    public void setItemStatus(String itemStatus) {
        ItemStatus = itemStatus;
    } 

    


}
