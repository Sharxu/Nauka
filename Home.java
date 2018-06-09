public class Home {
    public static void main (String args[])
    {
        TV nosy = new TV(45, "nosy123");
        TV sama = new TV(32,"sama234");

        System.out.println(sama.getname() + " " + sama.getsize());
        System.out.println(nosy.getname() + " " + nosy.getsize());

        sama.getOnOff();
        sama.setoOnOff(true);
        sama.getOnOff();

        Dog Rex = new Dog ();
        Rex.speak();
        Rex.setSize(15);
        System.out.println(Rex.getSize());

    }
}
