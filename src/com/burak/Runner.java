package com.burak;

import com.burak.entity.Library;

/*Bir kitaplık uygulaması geliştirmek istiyorsunuz. Uygulamanın şu özellikleri içermesini sağlayın
 * 
 * Kitap Sınıfı (Book Class): Her kitap için başlık, yazar, ISBN numarası ve yayın yılı gibi bilgileri içermelidir.
 * Kitaplık Sınıfı (Library Class): Kitapları içinde barındırmalı ve kitap eklemek, silmek, aramak gibi işlemleri yapabilmelidir.
 * Polimorfizm: Bir "Görüntüle" interface'i tanımlayın ve bu interface'i kullanarak farklı görüntüleme şekilleri (örneğin, konsola yazdırma veya dosyaya yazdırma) sağlayın.
 * Encapsulation: Kitap detaylarına erişimi sınırlayın ve bunlara erişmek için uygun metotlar sağlayın.
 * Constructor Kullanımı: Kitap ve Kitaplık sınıfları için uygun yapıcı metotlar tanımlayın.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Runner {

	public static void main(String[] args) {
		Library library = new Library();
		library.application();

	}

}
