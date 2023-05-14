package BTVN01.BT01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		SinhVien sv = new SinhVien();
//		sv.nhap();
//		String xepLoai = sv.xepLoai();
//		sv.xuat();
		Scanner scNhapDsSv = new Scanner(System.in);
		System.out.println("Nhap so sinh vien:");
		int soSv = scNhapDsSv.nextInt();
		ArrayList<SinhVien> lstSinhVien = new ArrayList<SinhVien>();
		for (int i = 0; i < soSv; i++) {
			SinhVien s = new SinhVien();
			System.out.println("Moi nhap sinh vien:" + i + "----\r\n");
			s.nhap();
			lstSinhVien.add(s);
		}
		for (SinhVien sinhVien : lstSinhVien) {
			sinhVien.xuat();
			sinhVien.xepLoai();
		}

	}

}
