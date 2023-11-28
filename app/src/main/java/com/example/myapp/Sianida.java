package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.TextView;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Sianida extends AppCompatActivity {

    TextView textView;

    String Scroll="Sianida adalah senyawa kimia yang dikenal karena toksisitasnya yang sangat tinggi. Ini adalah senyawa beracun yang terdiri dari ion sianida (CN⁻). Sianida dapat ditemukan secara alami dalam beberapa tumbuhan, seperti tanaman apel, pisang, dan almond, tetapi dapat juga dihasilkan secara sintetis. Sianida sering digunakan dalam industri kimia untuk berbagai aplikasi, seperti pembuatan plastik, tekstil, dan pengolahan logam.\n" +
            "\n" +
            "Berikut adalah beberapa poin penjelasan tentang racun sianida:\n" +
            "\n" +
            "1. Toksisitas Tinggi:\n" +
            "Sianida dikenal karena keampuhannya sebagai racun yang sangat kuat. Ini dapat menyebabkan kematian dalam waktu singkat, bahkan dalam jumlah kecil.\n" +
            "\n" +
            "2. Cara Kerja:\n" +
            "Sianida bekerja dengan menghambat sistem transportasi elektron dalam mitokondria sel. Ini menghentikan produksi adenosin trifosfat (ATP), yang penting untuk menyediakan energi bagi sel. Kehilangan kemampuan untuk menghasilkan energi mengakibatkan kegagalan organ vital seperti jantung dan otak.\n" +
            "\n" +
            "3. Gejala Keracunan:\n" +
            "Keracunan sianida dapat menyebabkan gejala seperti sesak napas, pusing, mual, muntah, kebingungan, dan akhirnya kematian. Gejala muncul dengan cepat setelah paparan.\n" +
            "\n" +
            "4. Sumber Paparan:\n" +
            "Paparan sianida dapat terjadi melalui inhalasi, penetrasi kulit, atau konsumsi makanan atau minuman yang terkontaminasi. Industri, seperti pertambangan, pengolahan logam, dan produksi tekstil, adalah beberapa tempat di mana sianida dapat ditemukan.\n" +
            "\n" +
            "5. Penggunaan Potensial:\n" +
            "Meskipun sianida memiliki sifat yang sangat beracun, dalam beberapa kasus, senyawa ini digunakan dalam dosis yang sangat kecil dalam bidang medis (misalnya, dalam pengobatan kanker tertentu) atau dalam analisis laboratorium.\n" +
            "\n" +
            "6. Pencegahan dan Keamanan:\n" +
            "Karena toksisitasnya, tindakan pencegahan sangat penting untuk menghindari paparan sianida. Ini melibatkan penggunaan peralatan pelindung diri di tempat kerja, kehati-hatian dalam penggunaan senyawa yang mengandung sianida, dan kepatuhan terhadap pedoman keamanan.\n" +
            "\n" +
            "7. Deteksi dan Pengobatan:\n" +
            "Deteksi dini paparan sianida sangat penting. Pengobatan harus segera diberikan jika terjadi keracunan. Antidot sianida yang umum digunakan adalah hidroksikobalamin, yang dapat membentuk senyawa kurang beracun dengan sianida.\n" +
            "\n" +
            "8. Aspek Hukum:\n" +
            "Penggunaan sianida untuk tujuan jahat atau kriminal dapat menjadi pelanggaran hukum yang serius. Karena sifatnya yang sangat beracun, penggunaan sianida sering kali terkait dengan kejahatan atau pembunuhan yang direncanakan.\n" +
            "\n" +
            "Penting untuk diingat bahwa sianida adalah zat yang sangat berbahaya dan penggunaannya harus diatur dengan ketat untuk melindungi keselamatan manusia dan lingkungan.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sianida);

        textView = findViewById(R.id.scrollableTextview);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(Scroll);
        textView.setTextIsSelectable(true);

    }
}