package com.br.guaira.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        chamaMenuPrincipal();
    }

    public void chamaCadastro() {
        setContentView(R.layout.cadastro);
        Button btMenuPrincipal = (Button) findViewById(R.id.btMenuPrincipal);
        btMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaMenuPrincipal();
            }
        });


    }

    public void chamaConsulta() {
        setContentView(R.layout.consulta);
        Button btVoltar= (Button) findViewById(R.id.btVoltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaMenuPrincipal();
            }
        });
    }

    public void chamaMenuPrincipal() {
        setContentView(R.layout.activity_main);

        Button btCadastro = (Button) findViewById(R.id.btTelaCadastro);
        Button btConsulta = (Button) findViewById(R.id.btTelaConsulta);


        btConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaConsulta();
            }
        });

        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaCadastro();
            }
        });
//https://github.com/pablo123456/TesteApp.git

    }

}