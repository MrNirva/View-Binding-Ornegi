package com.harun.viewbindingornegi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.harun.viewbindingornegi.databinding.ActivityMainBinding;

// https://harun.xyz/
public class MainActivity extends AppCompatActivity {

    // Binding Nesnemizi oluşturma
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Binding Nesnemizi bağlama
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Binding nesnemizle activity_main üzerinde dilediğimiz bileşene erişebiliriz
        binding.textViewBagla.setText("View Binding");
        binding.buttonBagla.setText("Merhaba");

        binding.buttonBagla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"Merhaba Dünya",Toast.LENGTH_SHORT).show();

            }
        });

    }

}
