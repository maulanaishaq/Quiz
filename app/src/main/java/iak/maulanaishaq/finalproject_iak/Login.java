package iak.maulanaishaq.finalproject_iak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by A-Havid on 8/2/2017.
 */

public class Login extends AppCompatActivity {

    Button btnOk;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk = (Button) findViewById(R.id.button_ok);
    }
}
