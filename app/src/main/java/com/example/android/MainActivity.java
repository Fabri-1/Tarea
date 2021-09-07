package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ToggleButton;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView vehiculo;
    private ToggleButton btnEquipo;
    private TextInputLayout marca;
    private RadioButton bencina,diesel;
    private EditText objetoMostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bencina = findViewById(R.id.rbBencina);
        diesel = findViewById(R.id.rbDiesel);

        vehiculo = findViewById(R.id.actxVehiculo);
        btnEquipo = findViewById(R.id.toggleButton);
        marca = findViewById(R.id.textInputLayout);

        objetoMostrar = findViewById(R.id.txtMostrar);
    }

    public void mostrar(View button){
        String textVehiculo = "";
        String tglbutton = "";
        String txtMarca="";
        String rdbtn ="";

        textVehiculo = vehiculo.getText().toString();
        tglbutton = btnEquipo.getText().toString();
        txtMarca = marca.getEditText().getText().toString();
        if(bencina.isChecked()==true){
            rdbtn = bencina.getText().toString();
        }
        if(diesel.isChecked()==true){
            rdbtn = bencina.getText().toString();
        }

        objetoMostrar.setText("");
        objetoMostrar.append(textVehiculo+"\n");
        objetoMostrar.append(tglbutton+"\n");
        objetoMostrar.append(txtMarca+"\n");
        objetoMostrar.append(rdbtn);




    }
}