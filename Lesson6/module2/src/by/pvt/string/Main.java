package by.pvt.string;




public class Main {

    public static void main(String[] args) {
        String str="I love Java";
        System.out.println(str);
        str = "I love BMW";
        System.out.println(str);


        MobilePhone mobilePhone=MobilePhone.getInstance(55,150,200);
        System.out.println(mobilePhone);

        MobilePhone temp=mobilePhone;

        mobilePhone=MobilePhone.getInstance(43,121,199);
        System.out.println(mobilePhone);

        System.out.println(temp);
    }

}
