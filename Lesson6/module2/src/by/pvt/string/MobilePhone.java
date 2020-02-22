package by.pvt.string;




public final class MobilePhone {
    private static MobilePhone mobilePhone;

    private  final int weght;

    private final int width;

    private final int height;

    private MobilePhone(int weght, int width, int height) {
        this.weght = weght;
        this.width = width;
        this.height = height;
    }

    public int getWeght() {
        return weght;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return weght+" "+width+" "+height;
    }

    public static MobilePhone getInstance(int weght, int width, int height){
        if(mobilePhone==null){
            mobilePhone=new MobilePhone(weght, width, height);
        }

        return mobilePhone;
    }
}
