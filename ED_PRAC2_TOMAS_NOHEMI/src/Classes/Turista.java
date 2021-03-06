package Classes;

public class Turista implements Comparable<Turista>{
	private int id;
	private String cognom;
	private String nom;
	
	public Turista (int id, String nom, String cognom) {
		this.id=id;
		this.cognom=cognom;
		this.nom=nom;
	}

	public int getId() {
		return id;
	}

	public String getCognom() {
		return cognom;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Turista [id=" + id + ", cognom=" + cognom + ", nom=" + nom + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return cognom.equals(obj);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public int compareTo(Turista tur) {
		return cognom.compareTo(tur.cognom);
	}
}
