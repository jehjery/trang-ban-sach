package jobbean;

public class loaibean {
    public loaibean(String maloai, String tenloai, int soluongsanpham) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
		this.soluongsanpham = soluongsanpham;
	}
	@Override
	public String toString() {
		return "loaibean [maloai=" + maloai + ", tenloai=" + tenloai + ", soluongsanpham=" + soluongsanpham + "]";
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public String getTenloai() {
		return tenloai;
	}
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
	public int getsoluongsanpham() {
		return soluongsanpham;
	}
	public void setsoluongsanpham(int soluongsanpham) {
		this.soluongsanpham = soluongsanpham;
	}
	private String maloai;
    private String tenloai;
    private int soluongsanpham;
    //Phat sinh ham tao (ko tham so, day du tham so), cac ham get,set

    
}
