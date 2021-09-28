package com.swufestu.bb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BbActivity extends AppCompatActivity {

    private float dollarRate = 0.1f;
    private float euroRate = 0.1f;
    private float wonRate = 0.1f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bb);

    }public void toRMB(View btn){
        EditText rmb = findViewById(R.id.rmb);
        TextView rmbshow = findViewById(R.id.rmbshow);
        Log.i("BbActivity","toRMB");
        String inp =rmb.getText().toString();
        Log.i("BbActivity","toRMB:inp"+inp);

        float r = 0;
        if(inp.length()>0) {
             r = Float.parseFloat(inp);
        }else{
            Toast.makeText(this,"请输入正确金额",Toast.LENGTH_LONG).show();
        }
            if (btn.getId() == R.id.dollar) {
                rmbshow.setText(String.format("%.2f",r*dollarRate));
            } else if (btn.getId() == R.id.euro) {
                rmbshow.setText(String.format("%.2f",r*euroRate));
            } else if (btn.getId() == R.id.won) {
                rmbshow.setText(String.format("%.2f",r*wonRate));
            }
            Log.i("BbActivity","toRMB:r="+r);


    }
    public void open(View btn){

        Intent mian = new Intent(this,MainActivity.class);
        Intent intentPhone = new Intent(Intent.ACTION_CALL, Uri.parse("tel:3"));

    }
}