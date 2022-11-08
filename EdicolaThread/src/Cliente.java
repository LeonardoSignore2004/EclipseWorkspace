
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
				System.out.println("Le scorte sono finite ");
			}
		}
	}
	
	public void run () {
		acquistaEdicola();
	}
}
