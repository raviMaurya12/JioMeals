package com.example.lenovo.jiomeals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class menu1 extends AppCompatActivity {

    private Button searchButton;
    private EditText searchInput;
    private ImageView imgIndian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menu1 );

        searchButton=(Button)findViewById( R.id.main_search_button );
        searchInput=(EditText)findViewById( R.id.main2_search_input );
        imgIndian=(ImageView)findViewById( R.id.main2_image1 );

        imgIndian.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu2Intent=new Intent(menu1.this,menu2.class);
                startActivity(menu2Intent);
            }
        } );

        searchButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search=searchInput.getText().toString();
                Intent searchIntent=new Intent(menu1.this,SearchResult.class);
                startActivity(searchIntent);
            }
        } );

    }
}
