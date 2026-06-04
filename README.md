# Java Stream API & Functional Programming ⚡

Bu depo, Java 8 ve sonraki versiyonlarla gelen fonksiyonel programlama (Functional Programming) yeteneklerini, lambda ifadelerini ve Stream API mimarisini kavramak amacıyla yazdığım pratiklerden oluşmaktadır.

## 🛠️ Uygulanan Fonksiyonlar ve Filtreleme Teknikleri

Geleneksel for ve while döngüleri (Imperative style) yerine, daha okunabilir ve yan etkisiz (Declarative style) kod yazım tarzı tercih edilerek şu metotlar uygulanmıştır:

### 1. Matematiksel ve Sayısal Analizler (JavaStreamFunctionalPractices.java)
* **.filter():** Belirli matematiksel koşullara uyan sayıları ayıklar (Örn: n % 10 == 0 ile 10'un katlarını bulma veya negatif sayıları filtreleme).
* **.map():** Veri akışındaki her elemanı dönüştürür (Örn: Math.abs(n) ile dizideki tüm sayıları mutlak değere çevirme).
* **.reduce():** Tüm veri akışını kümülatif bir şekilde işleyerek tek bir sonuca indirger (Örn: Custom toplama veya sayaç mekanizmaları kurma).

### 2. String Manipülasyonları (StreamStringManipulations.java)
* **Metin Ters Çevirme (String Reversing):** Karakterlerin bit düzeyindeki akışını (chars()) yakalayarak, .reduce("", (s1,s2) -> s2+s1) mantığıyla metni tersine çevirme simülasyonu.
* **Boşluk Temizleme (Space Removing):** Karakter akışı içerisinden boşluk (' ') karakterlerini filtreleyip kalanları fonksiyonel olarak birleştirme.
* **En Uzun Kelimeyi Bulma:** Bir string dizisi içerisindeki kelimeleri .reduce() kullanarak uzunluk kıyasına sokma ve en uzun kelimeyi dinamik seçme.

### 3. Fonksiyonel Döngüler ve Akış Üretimi
* IntStream.range() ve IntStream.rangeClosed() ile belirli aralıklarda hızlı veri setleri üretip toplama işlemleri yapma.
* IntStream.iterate() kullanarak belirli bir adıma ve kurala göre sonsuz/sınırlı sayı dizileri oluşturma.

## 🎯 Amacım

Yazılım geliştirme süreçlerinde kod karmaşıklığını azaltmak, daha temiz, sürdürülebilir ve mülakatlarda sıkça sorgulanan modern Java standartlarına (Clean Code) uyum sağlama becerisi kazanmak.
