public class singletontest {
    public static void main(String[] args) {
        Renban renbanA = Renban.getInstance();
        Renban renbanB = Renban.getInstance();

        System.out.println(renbanA.getNumber());
        System.out.println(renbanB.getNumber());
        System.out.println(renbanB.getNumber());
        System.out.println(renbanA.getNumber());
        System.out.println(renbanB.getNumber());
    }
}

class Renban{
    private static Renban renban = new Renban();

    private int number;

    private Renban(){
        number = 0;
    }

    public static Renban getInstance() {
        return renban;
    }

    public String getNumber(){
        number += 1;
        String str = String.format("%04d", number);
        return str;
    }
}