package com.example.trocadepalavra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button buttonSalvar;
Button buttonLocalizar;
Button buttonSubstituir;
EditText editTextNomear;
EditText editTextRenomear;
EditText editTextNomeNovo;
EditText edPalavra;
TextView textViewLocal;

String palavraescolhida, palavralocalizada, novapalavra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSalvar = findViewById(R.id.buttonSalvar);
        buttonLocalizar = findViewById(R.id.buttonLocalizar);
        buttonSubstituir = findViewById(R.id.buttonSubstituir);
        editTextNomear = findViewById(R.id.editTextNomear);
        editTextRenomear = findViewById(R.id.editTextRenomear);
        editTextNomeNovo = findViewById(R.id.editTextNomeNovo);
        textViewLocal = findViewById(R.id.textViewLocal);
        edPalavra = findViewById(R.id.edPalavra);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                palavraescolhida = editTextNomear.getText().toString().toLowerCase();
            }
        });
      buttonLocalizar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
               palavralocalizada = edPalavra.getText().toString().toLowerCase();
               textViewLocal.setText(String.valueOf(palavraescolhida.indexOf(palavralocalizada)));
          }
      });
      buttonSubstituir.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              palavralocalizada = editTextRenomear.getText().toString().toLowerCase();
              novapalavra = editTextNomeNovo.getText().toString();
              editTextNomear.setText(palavraescolhida.replace(palavralocalizada, novapalavra));
          }
      });
    }
}