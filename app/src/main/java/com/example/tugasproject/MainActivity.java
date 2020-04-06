package com.example.tugasproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasproject.adapters.MainAdapter;
import com.example.tugasproject.models.ShoesPict;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView shoesView = findViewById(R.id.rv_shoes);

        List<ShoesPict> shoes = new ArrayList<>();
        shoes.add(new ShoesPict("https://ecs7.tokopedia.net/img/cache/700/product-1/2020/3/30/28412018/28412018_84784dc8-ecbf-44b2-90aa-95868044bbac_1440_1440", "Patrobas"));
        shoes.add(new ShoesPict("https://ecs7.tokopedia.net/img/cache/700/product-1/2020/3/16/batch-upload/batch-upload_39a0dcd4-87d5-4bf0-8bb8-bfa7c57aa712.jpg", "Compass"));
        shoes.add(new ShoesPict("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/12/30/25293923/25293923_bec67650-f612-4776-bdb1-109ec821685b_2048_2048", "Rafheoo"));
        shoes.add(new ShoesPict("https://topscore.b-cdn.net/wp-content/uploads/2020/02/SEPATU-CANVAS-VENTELA-PUBLIC-LOW-BLACK-3.jpg", "Ventela"));
        shoes.add(new ShoesPict("https://cdn.shopify.com/s/files/1/0256/2398/6281/products/1_8_8b8e9add-5f17-47e7-b000-c93e16a65477_2000x.jpg?v=1585875348", "Brodo"));
        shoes.add(new ShoesPict("https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//87/MTA-3924302/nah_project_nah_project_coraggio_boba_fett_star_wars_sepatu_sneaker_pria_-_cream_green_full02_gzzsbnlq.jpg?output-format=webp", "Nah Project"));
        shoes.add(new ShoesPict("https://cdn.elevenia.co.id/g/3/1/2/7/4/1/23312741_B.jpg", "Kodachi"));
        shoes.add(new ShoesPict("https://s.blanja.com/picspace/954/136122/500.500_ef84f07bf2bc493eb3b1b6d75a159f4d.jpg", "Geoff Max"));
        shoes.add(new ShoesPict("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/5/25/3469336/3469336_ff5b9f9c-b4a8-4b2c-9ab4-82ae68edbe1d_720_722.jpg", "Saint Barkley"));
        shoes.add(new ShoesPict("https://i.pinimg.com/736x/38/94/e0/3894e00fd3a2451212840d2296a252b5.jpg", "Word Division"));

        MainAdapter adapter = new MainAdapter(this, shoes);
        shoesView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        shoesView.setLayoutManager(layoutManager);

        btnExit = (Button) findViewById(R.id.btnExit);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });

    }
}
