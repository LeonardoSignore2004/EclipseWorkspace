
public class Cliente extends Thread {
	private int quaderni;
	private int matite;
	
	public Cliente (int quaderni, int matite) {
		this.quaderni = quaderni;
		this.matite = matite;
	}
	
	public void acquistaEdicola () {
		synchronized (Cliente.class) {
			if (Edicola.matite>matite&&Edicola.quaderni>quaderni) {
				Edicola.matite-=matite;
				Edicola.quaderni-=quaderni;
			} else {
				System.out.println("Scorte non sufficienti per " + Thread.currentThread().getName());
			}
		}
	}
	
	public void run () {
		acquistaEdicola();
	}
}
