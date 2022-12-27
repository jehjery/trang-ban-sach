package jobbean;

public class voucherBean {
	@Override
	public String toString() {
		return "voucherBean [mavoucher=" + mavoucher + ", tenvoucher=" + tenvoucher + ", giatri=" + giatri + "]";
	}
	public voucherBean(String mavoucher, String tenvoucher, double giatri) {
		super();
		this.mavoucher = mavoucher;
		this.tenvoucher = tenvoucher;
		this.giatri = giatri;
	}
	public String getMavoucher() {
		return mavoucher;
	}
	public void setMavoucher(String mavoucher) {
		this.mavoucher = mavoucher;
	}
	public String getTenvoucher() {
		return tenvoucher;
	}
	public void setTenvoucher(String tenvoucher) {
		this.tenvoucher = tenvoucher;
	}
	public double getGiatri() {
		return giatri;
	}
	public void setGiatri(double giatri) {
		this.giatri = giatri;
	}
	private String mavoucher;
	private String tenvoucher;
	private double giatri;
}
