package com.example.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int count=0;
    public void convert(View view){

        EditText newedit= (EditText) findViewById(R.id.editTextTextPersonName);
        String curr= newedit.getText().toString();
        Float f=Float.parseFloat(curr);
        f=f*70;
        String curr2=Float.toString(f);
        if(count==0){
            ImageView img=(ImageView) findViewById(R.id.imageView);
            img.setImageResource(R.drawable.curr23);
            count=1;
        }
        else{
            ImageView img=(ImageView) findViewById(R.id.imageView);
            img.setImageResource(R.drawable.curr);
            count=0;
        }


        Toast.makeText(this,curr +"$ Dollars is  Rs."+ curr2 + "Rupees",Toast.LENGTH_LONG ).show();
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}