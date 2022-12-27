package jobbean;

import java.util.ArrayList;
import java.util.Date;



public class hoadonbean {
	  @Override
	public String toString() {
		return "hoadonbean [sotien=" + sotien + ", banking=" + banking + ", voucher=" + voucher + ", nguoimua="
				+ nguoimua + ", ngaythanhtoan=" + ngaythanhtoan + ", listsp=" + listsp + "]";
	}
	public hoadonbean(long sotien, String banking, String voucher, String nguoimua, Date ngaythanhtoan,
			ArrayList<CartBean> listsp) {
		super();
		this.sotien = sotien;
		this.banking = banking;
		this.voucher = voucher;
		this.nguoimua = nguoimua;
		this.ngaythanhtoan = ngaythanhtoan;
		this.listsp = listsp;
	}
	/**
	 * @return the sotien
	 */
	public long getSotien() {
		return sotien;
	}
	/**
	 * @param sotien the sotien to set
	 */
	public void setSotien(long sotien) {
		this.sotien = sotien;
	}
	/**
	 * @return the banking
	 */
	public String getBanking() {
		return banking;
	}
	/**
	 * @param banking the banking to set
	 */
	public void setBanking(String banking) {
		this.banking = banking;
	}
	/**
	 * @return the voucher
	 */
	public String getVoucher() {
		return voucher;
	}
	/**
	 * @param voucher the voucher to set
	 */
	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}
	/**
	 * @return the nguoimua
	 */
	public String getNguoimua() {
		return nguoimua;
	}
	/**
	 * @param nguoimua the nguoimua to set
	 */
	public void setNguoimua(String nguoimua) {
		this.nguoimua = nguoimua;
	}
	/**
	 * @return the ngaythanhtoan
	 */
	public Date getNgaythanhtoan() {
		return ngaythanhtoan;
	}
	/**
	 * @param ngaythanhtoan the ngaythanhtoan to set
	 */
	public void setNgaythanhtoan(Date ngaythanhtoan) {
		this.ngaythanhtoan = ngaythanhtoan;
	}
	/**
	 * @return the listsp
	 */
	public ArrayList<CartBean> getListsp() {
		return listsp;
	}
	/**
	 * @param listsp the listsp to set
	 */
	public void setListsp(ArrayList<CartBean> listsp) {
		this.listsp = listsp;
	}
	private long sotien;
	  private String banking;
	  private String voucher;
	  private String nguoimua;
	  public Date ngaythanhtoan;
	  private ArrayList<CartBean> listsp;
}
