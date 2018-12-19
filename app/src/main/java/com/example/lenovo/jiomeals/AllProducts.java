package com.example.lenovo.jiomeals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AllProducts extends AppCompatActivity {

    private String prod;
    private TextView proRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_all_products );

        //prod=getIntent().getStringExtra( "product" );
        //proRes.setText( prod );
    }
}
