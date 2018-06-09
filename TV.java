public class TV
{
    private int size;
    private String name;
    private boolean onOff;

//    public TV ()
//    {
//
//    }
    public TV(int size, String name)
    {
        this.size = size;
        this.name = name;
    }

    public int getsize()
    {
        return size;
    }

    public String getname()
    {
        return name;
    }

    public void setoOnOff (boolean a)
    {
        onOff = a;
    }

    public void getOnOff()
    {
        if (onOff) /*onOff == true */ {
            System.out.println("TV is on");
        }
        else
            System.out.println("Tv is off");
    }
}
