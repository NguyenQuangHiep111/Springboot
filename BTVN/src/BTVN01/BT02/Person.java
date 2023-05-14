package BTVN01.BT02;

import java.util.Scanner;

public class Person {
	public String hoTen, namSinh, queQuan;

	public Person() {
	}

	public Person(String hoTen, String namSinh, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public void nhapThongTin() {
		Scanner scNhap = new Scanner(System.in);
		System.out.println("Moi nhap ho ten:");
		this.hoTen = scNhap.nextLine();
		System.out.println("Moi nhap nam sinh: ");
		this.namSinh = scNhap.nextLine();
		System.out.println("Moi nhap que quan: ");
		this.queQuan = scNhap.nextLine();
	}

	public void xuatThongTin() {
		System.out.println("Ten: " + this.hoTen + "\r\nNam sinh: " + this.namSinh + "\r\nQue quan: " + this.queQuan);
	}
}
