package SuperClass;

import java.util.Scanner;

public class Nguoi {
    protected String sMa;
    protected String sHoten;
    protected String  sSDT;
    protected boolean bGioitinh;

    public Nguoi() {
    }

    public Nguoi(String sMa,String sHoten, String sDiachi, String sSDT, boolean bGioitinh) {
        this.sMa = sMa;
        this.sHoten = sHoten;
        this.sSDT = sSDT;
        this.bGioitinh = bGioitinh;
    }

    public String getsMa() {
        return sMa;
    }

    public void setsMa(String sMa) {
        this.sMa = sMa;
    }

    public String getsHoten() {
        return sHoten;
    }

    public void setsHoten(String sHoten) {
        this.sHoten = sHoten;
    }


    public String getsSDT() {
        return sSDT;
    }

    public void setsSDT(String sSDT) {
        this.sSDT = sSDT;
    }

    public boolean isbGioitinh() {
        return bGioitinh;
    }

    public void setbGioitinh(boolean bGioitinh) {
        this.bGioitinh = bGioitinh;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã: "); this.sMa = scanner.nextLine();
        System.out.print("Họ Tên: "); this.sHoten = scanner.nextLine();
        System.out.print("Giới tính(Nam | nu): "); this.bGioitinh = scanner.nextLine().compareToIgnoreCase("Nam") == 1;
        System.out.print("SDT: "); this.sSDT = scanner.nextLine();
    }
    public void Xuat(){
        String GT = this.bGioitinh ? "Nam" : "Nu";
        System.out.printf("%-10s%-10s%-5s%-15s",this.sMa, this.sHoten, GT, this.sSDT);
    }
}
