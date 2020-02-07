package com.example.elsoandroidprojektem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button kiszamolas;
    EditText elsoSzam, masodikSzam;

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

        kiszamolas =  findViewById(R.id.button);
        elsoSzam = findViewById(R.id.szam);
        masodikSzam = findViewById(R.id.szam2);

        kiszamolas.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                int eredmeny = Integer.parseInt(elsoSzam.getText().toString()) + Integer.parseInt(masodikSzam.getText().toString());
                Toast.makeText(this, "Az összeadás eredménye: " + String.valueOf(eredmeny), Toast.LENGTH_LONG).show();
                break;
        }


    }
}
