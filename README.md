# SuperHero2

SuperHero2, Jetpack Compose kullanılarak geliştirilmiş bir Android uygulamasıdır. Uygulama, popüler süper kahramanları listeleyerek, tıklanınca kahraman detaylarını gösteren bir arayüze sahiptir.

## ✨ Özellikler
- **Jetpack Compose ile modern UI**
- **Material 3 Design**
- **Listeleme & Detay Sayfası**
- **Navigasyon Desteği**
- **Tema Desteği (Light/Dark Mode)**

## 🛠 Kullanılan Teknolojiler
- **Kotlin** (Modern Android geliştirme dili)
- **Jetpack Compose** (Modern UI oluşturma)
- **Navigation Component** (Sayfalar arası geçiş için)
- **Material 3** (Gelişmiş UI tasarımı)
- **Gson** (JSON formatında veri taşımak için)

## 🛠 Kurulum
Projeyi çalıştırmak için aşağıdaki adımları takip edebilirsiniz:

1. **Projeyi Klonlayın:**
   ```sh
   git clone https://github.com/kullaniciadi/SuperHero2.git
   ```
2. **Android Studio ile Açın**
3. **Bağımlılıkları Güncelleyin**
   ```sh
   File > Sync Project with Gradle Files
   ```
4. **Emülatör veya Fiziksel Cihazda Çalıştırın**
   ```sh
   Run > Run 'app'
   ```

## 💡 Kullanım
1. Uygulama açıldığında **süper kahramanlar listelenir**.
2. Bir kahramana tıklayınca, **detay sayfasına yönlendirilirsiniz**.
3. **Navigasyon (geri dönüş)** kullanarak listeye geri dönebilirsiniz.

## 🔎 Dosya Yapısı
```
SuperHero2/
│-- app/
│   ├── MainActivity.kt  # Ana giriş noktası
│   ├── ListScreen.kt    # Kahramanları listeleyen ekran
│   ├── DetailScreen.kt  # Seçilen kahramanın detaylarını gösteren ekran
│   ├── SuperHero.kt     # Kahraman veri modeli
│   ├── ui/theme/
│       ├── Color.kt     # Renk tanımları
│       ├── Theme.kt     # Temalar
│       ├── Type.kt      # Yazı tipleri
```

## 🛠 Geliştirme
Proje üzerinde geliştirme yapmak istiyorsanız:
- Yeni kahramanlar eklemek için `getData()` metodunu güncelleyebilirsiniz.
- **Farklı bir API ile kahramanları dinamik çekmek için Retrofit entegrasyonu yapabilirsiniz.**
- UI iyileştirmeleri için **Material 3 bileşenlerini genişletebilirsiniz.**

## 🚀 Katkıda Bulunma
Projeye katkı sağlamak için, fork edip değişikliklerinizi **pull request** olarak gönderebilirsiniz.

## 🌟 Lisans
Bu proje, MIT Lisansı ile lisanslanmıştır.

