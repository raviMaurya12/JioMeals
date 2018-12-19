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
    private ImageView fastFood,southIndian,chinese,healthy,desserts,juices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menu1 );

        searchButton=(Button)findViewById( R.id.main_search_button );
        searchInput=(EditText)findViewById( R.id.main2_search_input );
        fastFood =(ImageView)findViewById( R.id.men1 );
        southIndian =(ImageView)findViewById( R.id.men2 );
        chinese =(ImageView)findViewById( R.id.men3 );
        healthy =(ImageView)findViewById( R.id.men4 );
        desserts =(ImageView)findViewById( R.id.men5 );
        juices =(ImageView)findViewById( R.id.men6 );


        fastFood.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fastIntent=new Intent(menu1.this,SearchResult.class);
                fastIntent.putExtra( "srText","Burger" );
                startActivity(fastIntent);
            }
        } );

        chinese.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chineseIntent=new Intent(menu1.this,SearchResult.class);
                chineseIntent.putExtra( "srText","Chinese" );
                startActivity(chineseIntent);
            }
        } );

        healthy.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent healthyIntent=new Intent(menu1.this,SearchResult.class);
                healthyIntent.putExtra( "srText","Healthy" );
                startActivity(healthyIntent);
            }
        } );

        southIndian.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent southIndianIntent=new Intent(menu1.this,SearchResult.class);
                southIndianIntent.putExtra( "srText","South Indian" );
                startActivity(southIndianIntent);
            }
        } );

        desserts.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertsIntent=new Intent(menu1.this,SearchResult.class);
                dessertsIntent.putExtra( "srText","Desserts" );
                startActivity(dessertsIntent);
            }
        } );

        juices.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent juicesIntent=new Intent(menu1.this,SearchResult.class);
                juicesIntent.putExtra("srText","Juices"  );
                startActivity(juicesIntent);
            }
        } );

        searchButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sr=searchInput.getText().toString();
                String search=searchInput.getText().toString();
                Intent searchIntent=new Intent(menu1.this,SearchResult.class);
                searchIntent.putExtra( "srText",sr );
                startActivity(searchIntent);
            }
        } );

    }
}
