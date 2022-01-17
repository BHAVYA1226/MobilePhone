public class Main {
    public static void main(String[]args) throws IllegalAccessException {

        MobilePhone mp1 = new MobilePhone();

        mp1.setModel_("XS MAX");
        mp1.setRam(256);
        mp1.setPrice(1300);

        System.out.println(mp1);
    }

}
