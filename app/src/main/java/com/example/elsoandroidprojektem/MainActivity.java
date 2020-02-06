package com.example.elsoandroidprojektem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Elindítva", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "Leállítva", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "Megsemmisítvee", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "Lepillanatályozva", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "Folytatva", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "Újraindítva", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
