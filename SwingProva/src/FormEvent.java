import java.util.EventObject;

public class FormEvent extends EventObject {
	
	private String marca;
	private String modello;

	public FormEvent(Object source) {
		super(source);
		
	}

	public FormEvent(Object source, String marca, String modello) {
		super(source);
		this.marca = marca;
		this.modello = modello;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	
}
