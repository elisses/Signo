package com.example.elisvieira.signos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.security.Principal;

public class MainActivityPrincipal extends AppCompatActivity {

    private Spinner spinnerDia = null;
    private Spinner spinnerMes = null;

      private void validarData() {
        int dia = spinnerDia.getSelectedItemPosition();
        int mes = spinnerMes.getSelectedItemPosition();

        //contador
        dia++;
        mes++;

        if (dia > 29 && mes == 2) {
            spinnerDia.setSelection(28);
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) {
            spinnerDia.setSelection(29);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        spinnerDia = (Spinner) findViewById(R.id.spinnerDia);
        spinnerMes = (Spinner) findViewById(R.id.spinnerMes);

        ArrayAdapter<CharSequence> adapter_dia = ArrayAdapter.createFromResource(this, R.array.dias,
                android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_mes = ArrayAdapter.createFromResource(this, R.array.meses,
                android.R.layout.simple_spinner_item);


        adapter_dia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDia.setAdapter(adapter_dia);
        spinnerMes.setAdapter(adapter_mes);


        Button enviar = (Button) findViewById(R.id.buttonEnviar);

        //tratando o click do botão

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int posicaoDia = spinnerDia.getSelectedItemPosition();
                int posicaoMes = spinnerMes.getSelectedItemPosition();

                //contador
                posicaoDia++;
                posicaoMes++;

                //intanciando
                InterpretadorSigno interpretador = new InterpretadorSigno();

                // recebe a chamada do metodo
                Signo signoResultado = interpretador.interpretar(posicaoDia, posicaoMes);

                Bundle args = new Bundle();

                args.putSerializable("resultado", signoResultado);

                //trafega os dados em tela
                Intent intent = new Intent(MainActivityPrincipal.this, Resultado.class);
                intent.putExtra("signo", args);

                startActivity(intent);

            }
        });

    }
}
