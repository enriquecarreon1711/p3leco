package mx.edu.tesoem.isc.leco.p3leco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent kik=new Intent(MainActivity.this,frm2delay.class);
                startActivity(kik);
                finish();
            }
        },5000);
    }
}
