package com.cursoandroid.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sortearNumero(View view){ // classe de ação OnClick, quando usuário clicar no botão
        TextView texto = findViewById(R.id.textoResultado); // vincula o ID do textview de resultado para dentro da classe
        int x = new Random().nextInt(11); // inicialização de parâmetro randomizado
        texto.setText("Número: "+ x); // altera o texto e sorteia o numero
    }
}