package test3;

public class Television {
    private final int id;
    private boolean power;
    private int volume;
    private int channel;

    //无参数构造
    public Television() {
        this.id = IdManager.generateTelevisionId();
        this.power = false;
        this.volume = 0;
        this.channel = 0;
    }

    //有参数构造
    public Television(boolean power, int volume, int channel){
        this.id = IdManager.generateTelevisionId();
        this.power = power;
        this.volume = volume;
        this.channel = channel;
    }

    public static void main(String[] args) {
        //这是主方法,里面创建了两个Television对象,并调用各种方法
        Television tv1 = new Television( false, 0, 0);
        tv1.printInfo();
        tv1.open();
        tv1.changeChannel(5);
        tv1.increaseVolume();
        tv1.decreaseVolume();
        tv1.printInfo();
        tv1.close();
        tv1.printInfo();

        System.out.println("Total number of televisions: " + IdManager.getTelevisionIdCount());

        Television tv2 = new Television( true, 13, 14);
        tv2.printInfo();

        System.out.println("Total number of televisions: " + IdManager.getTelevisionIdCount());
    }
    //这个是hyw,根本没用上
    public int getId(){
        return id;
    }

    public void open(){
        this.power = true;
        System.out.println("TV is open");
    }

    public void close(){
        this.power = false;
        System.out.println("TV is close");
    }

    public void changeChannel(int channel){
        this.channel = channel;
        System.out.println("Changed channel to " + channel);
    }

    public void increaseVolume(){
        this.volume++;
        System.out.println("Volume is increased,volume now :" + this.volume);
    }

    public void decreaseVolume(){
        this.volume--;
        System.out.println("Volume is decreased,volume now:" + this.volume);
    }

    public void printInfo(){
        System.out.println();
        System.out.println("test3.Television Information:");
        System.out.println("Id:" + this.id);
        System.out.println("Power:" + (this.power ? "On" : "Off"));
        System.out.println("Volume:" + this.volume);
        System.out.println("Channel:" + this.channel);
    }
//有点意思,这个可以管理我的id
    public static class IdManager{
        private static int televisionIdCounter = 0;

        public static int generateTelevisionId(){
            return ++televisionIdCounter;
        }
        public static int getTelevisionIdCount(){
            return televisionIdCounter;
        }

        public static void resetTelevisionId(){
            televisionIdCounter = 0;
        }
    }
}
