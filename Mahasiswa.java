
public class Mahasiswa {
	String nama;
	String npm;
	
	public Mahasiswa(String nama, String npm) {
		super();
		this.nama = nama;
		this.npm = npm;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNpm() {
		return npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
}