package BTVN01.BT02;

import java.util.Scanner;

public class Teacher extends Person {
	public double soGioDay, luongCoBan, phuCap;

	public double getSoGioDay() {
		return soGioDay;
	}

	public void setSoGioDay(double soGioDay) {
		this.soGioDay = soGioDay;
	}

	public Teacher() {
	}

	public Teacher(String hoTen, String namSinh, String queQuan, double soGioDay, double luongCoBan, double phuCap) {
		super(hoTen, namSinh, queQuan);
		this.soGioDay = soGioDay;
		this.luongCoBan = luongCoBan;
		this.phuCap = phuCap;
	}

	@Override
	public void nhapThongTin() {
		Scanner scNhap = new Scanner(System.in);
		System.out.println("Moi nhap ho ten:");
		this.hoTen = scNhap.nextLine();
		System.out.println("Moi nhap nam sinh: ");
		this.namSinh = scNhap.nextLine();
		System.out.println("Moi nhap que quan: ");
		this.queQuan = scNhap.nextLine();
		System.out.println("Moi nhap so gio day: ");
		this.soGioDay = scNhap.nextDouble();
		System.out.println("Moi nhap luong co ban: ");
		this.luongCoBan = scNhap.nextDouble();
		System.out.println("Moi nhap phu cap: ");
		this.phuCap = scNhap.nextDouble();
	}

	@Override
	public void xuatThongTin() {
		System.out.println("Ten: " + this.hoTen + "\r\nNam sinh: " + this.namSinh + "\r\nQue quan: " + this.queQuan
				+ "\r\nSo gio day: " + this.soGioDay + "\r\nLuong co ban: " + this.luongCoBan + "\r\nPhu cap: "
				+ this.phuCap);
	}

	public double tinhThuNhap() {
		return this.luongCoBan + this.phuCap;
	}
}
