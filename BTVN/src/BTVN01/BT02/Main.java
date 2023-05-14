package BTVN01.BT02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scNhapDs = new Scanner(System.in);
		
		// nhap so sinh vien
		System.out.println("Nhap so sinh vien:");
		int soSv = scNhapDs.nextInt();
		ArrayList<Student> lstStudent = new ArrayList<Student>();
		for (int i = 1; i <= soSv; i++) {
			Student s = new Student();
			System.out.println("Moi nhap sinh vien:" + i + "----\r\n");
			s.nhapThongTin();
			lstStudent.add(s);
		}
		// nhap so giao vien
		ArrayList<Teacher> lstTeacher = new ArrayList<Teacher>();
		System.out.println("Nhap so giao vien:");
		int soGv = scNhapDs.nextInt();
		for (int i = 1; i <= soGv; i++) {
			Teacher s = new Teacher();
			System.out.println("Moi nhap giao vien:" + i + "----\r\n");
			s.nhapThongTin();
			lstTeacher.add(s);
		}
		System.out.println("Danh sach sinh vien:");
		for (Student student : lstStudent) {
			System.out.println("--------------");
			student.xuatThongTin();
		}
		System.out.println("********************");
		System.out.println("Danh sach giao vien:");
		for (Teacher teacher : lstTeacher) {
			System.out.println("--------------");
			teacher.xuatThongTin();
		}
	}

}
