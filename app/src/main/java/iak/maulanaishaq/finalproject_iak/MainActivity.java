package iak.maulanaishaq.finalproject_iak;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rbJava;
    CheckBox cbString, cbInt, cbFloat, cbDollar;
    RadioButton rbAndroidStudio;
    EditText edtButton;
    EditText edtCheckBox;
    String cekSatu, cekDua, cekTiga, cekEmpat, cekLima;
    int nilai = 0;
    Button btHasil ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbJava = (RadioButton) findViewById(R.id.rb_java);
        cbString = (CheckBox) findViewById(R.id.cb_string);
        cbInt = (CheckBox) findViewById(R.id.cb_int);
        cbFloat = (CheckBox) findViewById(R.id.cb_float);
        cbDollar = (CheckBox) findViewById(R.id.cb_dollar);
        rbAndroidStudio = (RadioButton) findViewById(R.id.androidStudio);
        edtButton = (EditText) findViewById(R.id.edt_button);
        edtCheckBox = (EditText) findViewById(R.id.edt_cb);
    }

    public void hasil(View view) {
        if (rbJava.isChecked()) {
            nilai = nilai + 1;
        } else {
            cekSatu = "1.Salah\n";
        }

        if (cbString.isChecked() && cbInt.isChecked() && cbFloat.isChecked()) {
            nilai = nilai + 1;
        } else {
            cekDua = "2.Salah\n";
        }
        if (rbAndroidStudio.isChecked()) {
            nilai = nilai + 1;
        } else {
            cekTiga = "3.Salah\n";
        }

        if (edtButton.getText().toString().equalsIgnoreCase("Button")) {
            nilai = nilai + 1;
        } else {
            cekEmpat = "4.Salah\n";
        }

        if (edtCheckBox.getText().toString().equalsIgnoreCase("CheckBox")) {
            nilai = nilai + 1;
        } else {
            cekLima = "5.Salah\n";
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Nilai kamu adalah " + nilai + "\n" + cekSatu + cekDua + cekTiga + cekEmpat + cekLima)
                .setTitle("Nilai").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
            cekSatu = "1.benar\n";
            cekDua = "2.benar\n";
            cekTiga = "3.benar\n";
            cekEmpat = "4.benar\n";
            cekLima = "5.benar\n";
            nilai = 0;

    }
}