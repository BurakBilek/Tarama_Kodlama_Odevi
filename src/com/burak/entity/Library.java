package com.burak.entity;

import java.util.Scanner;

import com.burak.repository.IView;

public class Library implements IView {
	Book book = new Book();

	int boyut = 0;
	Scanner sc = new Scanner(System.in);
	Book[] bookList;

	public void application() {
		int secilen;
		do {

			showAll();
			secilen = choose();
			if (secilen == 0) {
				System.out.println("çıkış yapıldı");
			} else {
				menu(secilen);
			}
		} while (secilen != 0);
	}

	public void menu(int secim) {
		switch (secim) {
		case 1:
			add(create());
			break;
		case 2:
			remove();
			break;
		case 3:
			search();
			book.goruntule();
			break;
		case 4:
			list(bookList);
			goruntule();
			break;
		default:
			System.out.println("Geçersiz seçim yaptınız.");
			break;
		}
	}

	public void showAll() {
		System.out.println("**********************");
		System.out.println("*****LIBRARY APP******");
		System.out.println("**********************");
		System.out.println();
		System.out.println("1- Yeni Kitap Ekleyiniz");
		System.out.println("2- Kitap Çıkartınız");
		System.out.println("3- Kitap Bul");
		System.out.println("4- Kitap İzlenimi");
		System.out.println("0- Çıkış");
	}

	public int choose() {
		System.out.println("Lütfen seçim yapınız: ");
		int secim = sc.nextInt();
		sc.nextLine();
		return secim;

	}

	public Book create() {
		int sayac = 0;
		System.out.println("Lütfen kitap isminizi giriniz");
		String kitapAdi = sc.nextLine();
		System.out.println("Lütfen yazarınızın isminizi giriniz");
		String yazarAdi = sc.nextLine();
		System.out.println("Lütfen ISBN numaranızı giriniz");
		int ısbnNo = sc.nextInt();
		System.out.println("Lütfen yayımlandığı yılı  giriniz");
		int yayimYili = sc.nextInt();

		Book book1 = new Book(kitapAdi, yazarAdi, ısbnNo, yayimYili);
		return book1;

	}

	public void add(Book book) {

		Book[] tmp;
		if (bookList == null) {
			bookList = new Book[1];
			bookList[0] = book;
		} else {
			tmp = new Book[boyut + 1];
			for (int i = 0; i < boyut; i++) {
				tmp[i] = bookList[i];
			}
			tmp[boyut] = book;
			bookList = tmp;
		}
		boyut++;

	}

	public void list(Book[] bookList) {
		for (int i = 0; i < boyut; i++) {
			System.out.println(" Kitabın başlığı: " + bookList[i].getTitle());
			System.out.println(" Kitabın yazarı: " + bookList[i].getAuthor());
			System.out.println(" Kitabın ISBN no: " + bookList[i].getIsbn());
			System.out.println(" Kitabın yayım yılı:" + bookList[i].getPublicationYear());
		}
	}

	public void remove() {
		System.out.print("Lütfen ISBN no giriniz: ");
		int isbnNo = sc.nextInt();
		Book[] tmp = new Book[boyut - 1];
		int j = 0;
		for (int i = 0; i < boyut - 1; i++) {
			if (bookList[i].getIsbn() != isbnNo) {
				tmp[i] = bookList[i + j];
			} else {
				j = 1;
				tmp[i] = bookList[i + j];
			}
		}
		bookList = tmp;
		boyut--;
	}

	public void search() {
		System.out.println("Lütfen kitap adı giriniz: ");
		String kitapAdi = sc.nextLine();
		boolean status = false;
		for (int i = 0; i < boyut; i++) {
			if (bookList[i].getTitle().equalsIgnoreCase(kitapAdi)) {
				status = true;
				System.out.println("*********************************");
				System.out.println("Kitabın başlığı: " + bookList[i].getTitle());
				System.out.println("Kitabın yazarı: " + bookList[i].getAuthor());
				System.out.println("Kitabın ISBN no: " + bookList[i].getIsbn());
				System.out.println("Kitabın yayım yılı: " + bookList[i].getPublicationYear());
				System.out.println();
			}

		}
		if (status == false) {
			System.out.println("Aradığınız kitap stoklarımızda bulunamamıştır.");
		}

	}

	@Override
	public void goruntule() {
		System.out.println("kütüphane görüntülendi.");

	}

}
