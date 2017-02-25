package com.examle.yogeshkumar.calcio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,bequal,b2,b3,b4,b5,b6,b7,b8,b9,b0,bback,bac,bpoint,badd,bsub,bmul,bdivide,bper;
    TextView tt;
    Integer b,c,d;
    double r;
    String a="",aa,string="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bper = (Button) findViewById(R.id.bper);
        bequal = (Button) findViewById(R.id.bequal);
        badd = (Button) findViewById(R.id.bplus);
        bmul = (Button) findViewById(R.id.bmul);
        bdivide = (Button) findViewById(R.id.bdivide);
        bpoint = (Button) findViewById(R.id.bpoint);
        bback = (Button) findViewById(R.id.bback);
        bac = (Button) findViewById(R.id.bac);
        bsub = (Button) findViewById(R.id.bsub);

        tt = (TextView) findViewById(R.id.textView);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    public void onclick1(View v) {
        a = tt.getText().toString();
        a = a + 1;

        tt.setText(a);
    }

    public void onclick2(View v) {
        a = tt.getText().toString();
        a = a + 2;

        tt.setText(a);
    }

    public void onclick3(View v) {
        a = tt.getText().toString();
        a = a + 3;
        tt.setText(a);
    }

    public void onclick4(View v) {
        a = tt.getText().toString();
        a = a + 4;
        tt.setText(a);
    }

    public void onclick5(View v) {
        a = tt.getText().toString();
        a = a + 5;
        tt.setText(a);
    }

    public void onclick6(View v) {
        a = tt.getText().toString();
        a = a + 6;
        tt.setText(a);
    }

    public void onclick7(View v) {
        a = tt.getText().toString();
        a = a + 7;
        tt.setText(a);
    }

    public void onclick8(View v) {
        a = tt.getText().toString();
        a = a + 8;
        tt.setText(a);
    }

    public void onclick9(View v) {
        a = tt.getText().toString();
        a = a + 9;
        tt.setText(a);
    }

    public void onclick0(View v) {
        a = tt.getText().toString();
        a = a + 0;
        tt.setText(a);
    }

    public void onclickback(View v) {

    }

    public void onclickac(View v) {
        a="";
        aa="";
        tt.setText("");

    }

    public void onclickpoint(View v) {

    }

    public void onclickper(View v) {

    }

    public void onclickplus(View v) {
        aa = a;
        b = 1;
        a = "";

        tt.setText("+");
        tt.setText("");
    }

    public void onclicksub(View v) {
        aa = a;
        b = 2;
        a = "";

        tt.setText("-");
        tt.setText("");
    }

    public void onclickmul(View v) {
        aa = a;
        b = 3;
        a = "";
        tt.setText("*");
        tt.setText("");
    }

    public void onclickdivide(View v) {
        aa = a;
        b = 4;
        a = "";
        tt.setText("/");
        tt.setText("");
    }

    public void onclickequal(View v) {

        if (b == 1) {
            c = Integer.parseInt(aa);
            d = Integer.parseInt(a);
            r = c + d;

        } else if (b == 2) {
            c = Integer.parseInt(aa);
            d = Integer.parseInt(a);
            r = c - d;

        } else if (b == 3) {
            c = Integer.parseInt(aa);
            d = Integer.parseInt(a);
            r = c * d;

        } else if (b == 4) {
            c = Integer.parseInt(aa);
            d = Integer.parseInt(a);
            r = c / d;

        }



        Toast.makeText(MainActivity.this, "Result is::" + r, Toast.LENGTH_LONG).show();
        c = 0;
        b = 0;
        d = 0;
        a = "";
        aa = "";
        tt.setText("");
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
