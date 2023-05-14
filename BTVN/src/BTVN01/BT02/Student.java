package BTVN01.BT02;

import java.util.Scanner;

public class Student extends Person {
	public double diemTrungBinh;

	public Student() {
	}

	public Student(String hoTen, String namSinh, String queQuan, double diemTrungBinh) {
		super(hoTen, namSinh, queQuan);
		this.diemTrungBinh = diemTrungBinh;
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
		System.out.println("Moi nhap diem trung binh: ");
		this.diemTrungBinh = scNhap.nextDouble();
	}

	@Override
	public void xuatThongTin() {
		System.out.println("Ten: " + this.hoTen + "\r\nNam sinh: " + this.namSinh + "\r\nQue quan: " + this.queQuan
				+ "\r\nDiem trung binh: " + this.diemTrungBinh);
	}

	public String xepLoai() {
		String rs = "";
		if (this.diemTrungBinh <= 5)
			rs = "Yeu";
		else if (5 <= this.diemTrungBinh && this.diemTrungBinh < 6.5)
			rs = "Trung Binh";
		else if (6.5 <= this.diemTrungBinh && this.diemTrungBinh < 8)
			rs = "Kha";
		else
			rs = "Gioi";

		return rs;
	}

}
