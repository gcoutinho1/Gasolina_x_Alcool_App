package coutinhocompany.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    /** created by Guilherme Coutinho **/

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button  botaoVerificar;
    private TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // localizar componentes na TELA

        precoAlcool = findViewById(R.id.precoAlcoolid);
        precoGasolina = findViewById(R.id.precoGasolinaid);
        botaoVerificar = findViewById(R.id.botaoVerificarid);
        textoResultado = findViewById(R.id.textoResultadoid);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // recuperar valores digitados

                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                // converter valores strings para numeros
                Double valorAlcool = Double.parseDouble( textoPrecoAlcool );
                Double valorGasolina = Double.parseDouble( textoPrecoGasolina );

                // preço alcool dividido pelo preço gasolina

                double resultado = valorAlcool / valorGasolina;

                if ( resultado >= 0.7){
                    //Gasolina
                    textoResultado.setText("é melhor utilizar gasolina");
                }else {
                    //Alcool
                    textoResultado.setText("é melhor utilizar alcool");
                }
            }
        });

    }
}
