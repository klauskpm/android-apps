package br.com.klauskpm.calculator;

import android.os.Bundle;
import android.renderscript.Double2;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;

    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;

    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);

        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);

        textResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 = getOper(operand1);
                double oper2 = getOper(operand2);

                double theResult = oper1 + oper2;

                textResult.setText(Double.toString(theResult));
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 = getOper(operand1);
                double oper2 = getOper(operand2);

                double theResult = oper1 - oper2;

                textResult.setText(Double.toString(theResult));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 = getOper(operand1);
                double oper2 = getOper(operand2);

                if (oper2 == 0f)
                    oper2 = 1f;

                double theResult = oper1 / oper2;

                textResult.setText(Double.toString(theResult));
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 = getOper(operand1);
                double oper2 = getOper(operand2);

                double theResult = oper1 * oper2;

                textResult.setText(Double.toString(theResult));
            }
        });
    }

    private double getOper(EditText operand) {
        String oper = operand.getText().toString();

        if (oper.isEmpty())
            return 0f;
        else
            return Double.parseDouble(oper);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
