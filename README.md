# Training — Java Starter

Project Maven + Java 17.

## Buka project di VS Code

1. Pasang ekstensi **Extension Pack for Java** (Microsoft) kalau belum.
2. **File → Open Folder** (atau `Ctrl+K Ctrl+O`).
3. Pilih folder project ini (yang ada `pom.xml`-nya).
4. Tunggu VS Code / Maven selesai load (bawah kanan: "Loading..." hilang).

## Cara run di VS Code

**Opsi A — Run file yang punya `main`**

- Buka file `.java` yang ada method `public static void main(String[] args)`.
- Klik **Run** di atas `main`, atau klik kanan file → **Run Java**.
- Bisa juga **Run and Debug** (F5) lalu pilih "Run current file".

**Opsi B — Via terminal (Maven)**

```bash
# Compile
mvn compile

# Run class tertentu (ganti dengan package + nama class)
mvn exec:java -Dexec.mainClass="com.training.oop.DemoRunner"
```

Ganti `com.training.oop.DemoRunner` dengan class yang punya `main` yang mau dijalankan.

## Requirement

- JDK 17
- Maven 3.x (atau pakai Maven wrapper / ekstensi Java di VS Code)
