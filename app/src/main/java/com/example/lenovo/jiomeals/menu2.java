package com.example.lenovo.jiomeals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menu2 extends AppCompatActivity {

    private ImageView menu2Image1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menu2 );

        menu2Image1=(ImageView)findViewById( R.id.main2_image1 );

        menu2Image1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent srIntent=new Intent(menu2.this,SearchResult.class);
                startActivity(srIntent);
            }
        } );
    }
}
