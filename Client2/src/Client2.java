public class Client2 {
	public static void main(String[] args) {
		Suuchi s = new Suuchi();
		Observer o1 = new NishinHyouji();
		Observer o2 = new JyuurokushinHyouji();

        s.detach(o1);   // detachをどこに使うのかわかりませんでした。
        s.detach(o2);   // detachをどこに使うのかわかりませんでした。
		s.attach(o1);
        s.attach(o2);
		int i = 0;
		while (i < 100) {
			s.putValue(i);
			i += (int)(Math.random() * 30) - 10;
		}
	}
}
