package com.example.tugasproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasproject.adapters.MainAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDetailss = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2020/3/30/28412018/28412018_84784dc8-ecbf-44b2-90aa-95868044bbac_1440_1440");
        mNames.add("Patrobas");
        mDetailss.add("Sepatu Vulcanized Berkualitas Tinggi Harga Terjangkau\n" +
                "Produk Asli Indonesia");

        mImageUrls.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2020/3/16/batch-upload/batch-upload_39a0dcd4-87d5-4bf0-8bb8-bfa7c57aa712.jpg");
        mNames.add("Compass");
        mDetailss.add("Sepatu vulkanisir buatan Indonesia sejak 1998\n" +
                "#banggabuatanindonesia");

        mImageUrls.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/12/30/25293923/25293923_bec67650-f612-4776-bdb1-109ec821685b_2048_2048");
        mNames.add("Rafheoo");
        mDetailss.add("Rafheoo® Footwear\n" +
                "Natural Dyed Footwear on progress");

        mImageUrls.add("https://topscore.b-cdn.net/wp-content/uploads/2020/02/SEPATU-CANVAS-VENTELA-PUBLIC-LOW-BLACK-3.jpg");
        mNames.add("Ventela");
        mDetailss.add("\uD83D\uDC5F | Premium Vulcanized Shoes\n" +
                "\uD83C\uDDEE\uD83C\uDDE9 | Local Product");

        mImageUrls.add("https://cdn.shopify.com/s/files/1/0256/2398/6281/products/1_8_8b8e9add-5f17-47e7-b000-c93e16a65477_2000x.jpg?v=1585875348");
        mNames.add("Brodo");
        mDetailss.add("BRO.DO\n" +
                "GOOD THINGS TAKE TIME");

        mImageUrls.add("https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//87/MTA-3924302/nah_project_nah_project_coraggio_boba_fett_star_wars_sepatu_sneaker_pria_-_cream_green_full02_gzzsbnlq.jpg?output-format=webp");
        mNames.add("Nah Project");
        mDetailss.add("NAH Project #CourageousMe\n" +
                "Democratizing sneakers industry by being the most radically transparent brand");

        mImageUrls.add("https://cdn.elevenia.co.id/g/3/1/2/7/4/1/23312741_B.jpg");
        mNames.add("Kodachi");
        mDetailss.add("Sepatu Kodachi ®\n" +
                "Produk/Layanan");

        mImageUrls.add("https://s.blanja.com/picspace/954/136122/500.500_ef84f07bf2bc493eb3b1b6d75a159f4d.jpg");
        mNames.add("Geoff Max");
        mDetailss.add("GMX | GEOFF MAX Footwear\n" +
                "#ReadyToKick brand from Bandung, Indonesia.");

        mImageUrls.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/5/25/3469336/3469336_ff5b9f9c-b4a8-4b2c-9ab4-82ae68edbe1d_720_722.jpg");
        mNames.add("Saint Barkley");
        mDetailss.add("Saint Barkley\n" +
                "Catalogue: @sbcatalogue");

        mImageUrls.add("https://i.pinimg.com/736x/38/94/e0/3894e00fd3a2451212840d2296a252b5.jpg");
        mNames.add("Word Division");
        mDetailss.add("WORD DIVISION\n" +
                "Merek\n" +
                "D.I.Y PROJECT TO PROGRESS THE FUTURE");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        MainAdapter adapter = new MainAdapter(this, mNames, mImageUrls, mDetailss);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void btnExit(View view) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        MainActivity.this.startActivity(intent);
        finish();
    }
}






















