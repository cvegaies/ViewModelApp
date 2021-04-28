package org.izv.ad.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        tvText = findViewById(R.id.tvText);
        tvText.setText("");
        ModeloVista modeloVista = new ViewModelProvider(this).get(ModeloVista.class);
        modeloVista.getString().observe(this, new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> strings) {
                tvText.append(strings.size() + ": " + strings.get(strings.size() - 1) + "\n");
            }
        });
    }

}