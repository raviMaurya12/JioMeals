//This Page Is Isolated because It has some bugs.

package com.example.lenovo.jiomeals;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductList extends AppCompatActivity {

    private Button homeBtn;
    private ListView mListView;
    DatabaseHelper mDatabaseHelper;
    private String product;
    private ArrayList<String> titleList;
    //private ArrayList<String> RestaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_product_list );
        product=getIntent().getStringExtra( "product" );

        mDatabaseHelper = new DatabaseHelper(this,null,null,1);

        homeBtn=(Button)findViewById( R.id.product_homeBtn );
        homeBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(ProductList.this,menu1.class);
                startActivity(i2);
            }
        } );

        mListView=(ListView)findViewById( R.id.product_list );

        populateListView();

    }

    private void populateListView() {

        Cursor data = mDatabaseHelper.getProduct(product);

        while(data.moveToNext()){
            //get the value from the database in column 1
            //then add it to the ArrayList
            titleList.add(data.getString(1));
            //RestaurantList.add(data.getString(2));
        }
        //create the list adapter and set the adapter
        Log.d("Here2", titleList.toString());
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titleList);
        mListView.setAdapter(adapter);
        Log.d("Here3", mListView.toString());
        mListView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ProductList.this,Product.class);
                startActivity(i);
            }
        } );

    }


}
