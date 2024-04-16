package SuperClass;

import java.util.Scanner;

public class Sanpham {

    protected String sMaSanPham;
    protected String sTenSanPham;
    protected double dGiaSanPham;

    public Sanpham() {
    }

    public Sanpham(String sMaSanPham, String sTenSanPham, double dGiaSanPham) {
        this.sMaSanPham = sMaSanPham;
        this.sTenSanPham = sTenSanPham;
        this.dGiaSanPham = dGiaSanPham;
    }

    public String getsMaSanPham() {
        return sMaSanPham;
    }

    public void setsMaSanPham(String sMaSanPham) {
        this.sMaSanPham = sMaSanPham;
    }

    public String getsTenSanPham() {
        return sTenSanPham;
    }

    public void setsTenSanPham(String sTenSanPham) {
        this.sTenSanPham = sTenSanPham;
    }

    public double getdGiaSanPham() {
        return dGiaSanPham;
    }

    public void setdGiaSanPham(double dGiaSanPham) {
        this.dGiaSanPham = dGiaSanPham;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã sản phẩm: "); this.sMaSanPham = scanner.nextLine();
        System.out.print("Tên sản phẩm: "); this.sTenSanPham = scanner.nextLine();
        System.out.print("Giá sản phâm: "); this.dGiaSanPham = scanner.nextDouble();
    }

    public void Xuat(){
        System.out.printf("%-5s%-10s%-10f", this.sMaSanPham, this.sTenSanPham, this.dGiaSanPham);
    }
}
