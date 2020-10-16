//comment
public class Door
{
    private String name;
    private boolean isOpened;
    public Door(String name,boolean isOpened){
        this.name=name;
        this.isOpened = isOpened;
    }
    public void close(){
        this.isOpened = false;
    }
    public void open(){
        this.isOpened = true;
    }
    public String getName(){
        return this.name;
    }
    public boolean getOpen(){
        return this.isOpened;
    }
    public void setName(String newName)
    {
       this.name = newName;
    }
}
