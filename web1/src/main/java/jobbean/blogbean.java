package jobbean;

public class blogbean {
	@Override
	public String toString() {
		return "blogbean [mablog=" + mablog + ", tieude=" + tieude + ", phude=" + phude + ", noidung=" + noidung
				+ ", tacgia=" + tacgia + ", hinhanh=" + hinhanh + "]";
	}
	public blogbean(String mablog, String tieude, String phude, String noidung, String tacgia, String hinhanh) {
		super();
		this.mablog = mablog;
		this.tieude = tieude;
		this.phude = phude;
		this.noidung = noidung;
		this.tacgia = tacgia;
		this.hinhanh = hinhanh;
	}
	public String getMablog() {
		return mablog;
	}
	public void setMablog(String mablog) {
		this.mablog = mablog;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getPhude() {
		return phude;
	}
	public void setPhude(String phude) {
		this.phude = phude;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	private String mablog;
	private String tieude;
	private String phude;
	private String noidung;
	private String tacgia;
	private String hinhanh;
}
