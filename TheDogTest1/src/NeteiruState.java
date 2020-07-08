class NeteiruState extends DogState{
    private static NeteiruState s = new NeteiruState();

    private NeteiruState(){}

    public static DogState getInstance() {
        return s;
    }

    public void tukareta(Dog moto) {
        //何もしない
    }

    public void tabeta(Dog moto) {
        moto.changeState(TanoshiiState.getInstance());
    }

    public String toString() {
        return "寝ている状態";
    }
}