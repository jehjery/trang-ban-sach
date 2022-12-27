package jobbean;

public class CartBean {
	public CartBean(String masp, String tensp, long soluong, long gia, String anh) {
		super();
		this.masp = masp;
		this.tensp = tensp;
		this.soluong = soluong;
		Gia = gia;
		Thanhtien = gia*soluong;
		Anh = anh;
	}
	@Override
	public String toString() {
		return "CartBean [masp=" + masp + ", tensp=" + tensp + ", soluong=" + soluong + ", Gia=" + Gia + ", Thanhtien="
				+ Thanhtien + ", Anh=" + Anh + "]";
	}
	public String getMasp() {
		return masp;
	}
	public void setMasp(String masp) {
		this.masp = masp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public long getGia() {
		return Gia;
	}
	public void setGia(long gia) {
		Gia = gia;
	}
	public long getThanhtien() {
		return Gia*soluong;
	}
	public void setThanhtien(long thanhtien) {
		Thanhtien = thanhtien;
	}
	public String getAnh() {
		return Anh;
	}
	public void setAnh(String anh) {
		Anh = anh;
	}
	private String masp;
	private String tensp;	
	private long soluong;
	private long Gia;
	private long Thanhtien;
	private String Anh;
}
