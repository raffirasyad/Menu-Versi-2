package com.example.myapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;

public class Maps extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Inisialisasi peta
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        // Menambahkan marker atau melakukan operasi lain terkait peta
        // Misalnya, menambahkan marker di lokasi tertentu
        // LatLng location = new LatLng(latitude, longitude);
        // googleMap.addMarker(new MarkerOptions().position(location).title("Marker di Lokasi"));
        // googleMap.moveCamera(CameraUpdateFactory.newLatLng(location));

        // Contoh pemanggilan aplikasi Google Maps dengan koordinat lokasi tertentu
        double latitude = 37.7749;
        double longitude = -122.4194;

        // Uri untuk membentuk intent
        Uri gmmIntentUri = Uri.parse("geo:" + latitude + "," + longitude + "?z=15&q=" + latitude + "," + longitude + "(Label+Location)");

        // Membuat intent untuk memanggil aplikasi peta
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps"); // Spesifikasikan aplikasi Google Maps

        // Memeriksa apakah terdapat aplikasi yang bisa menangani intent
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        } else {
            // Jika tidak ada aplikasi Google Maps terpasang, Anda bisa menangani kasus ini di sini
            // Misalnya, menampilkan pesan kepada pengguna bahwa aplikasi Google Maps tidak tersedia
        }
    }
}
