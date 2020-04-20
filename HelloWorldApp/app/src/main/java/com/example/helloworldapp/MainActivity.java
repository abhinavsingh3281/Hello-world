package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonIsClicked(View buttonView){//if we don't use public then the  buttonIsClicked tag won't work.

       // int result = 5 * 7;
        //Log.i("Operation", String.valueOf(result));

     //   TextView textView = findViewById(R.id.tvi1);
        //Log.i("TAG",textView.getText().toString());
//        EditText editText=findViewById(R.id.etname);
//        //Log.i("NAME",editText.getText().toString());
//       EditText etPhone=findViewById(R.id.etphone);
//       // Log.i("NAME",editText.getText().toString());
////      Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity.this,"Your name is:"+editText.getText().toString()
//                +"\n"+"Your phone no is"+etPhone.getText().toString(),Toast.LENGTH_SHORT).show();

        ImageView myIm = findViewById(R.id.imageView);
        myIm.setImageResource(R.drawable.spring);

    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.master_layout_android);
    }


}
