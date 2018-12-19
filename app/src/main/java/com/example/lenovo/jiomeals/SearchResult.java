package com.example.lenovo.jiomeals;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchResult extends AppCompatActivity {

    private Button homeButton;
    private TextView storesFound;
    private ListView srList;
    DatabaseHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_search_result );

        mDatabaseHelper = new DatabaseHelper(this,null,null,1);

        homeButton=(Button)findViewById( R.id.sr_home_button );
        storesFound=(TextView)findViewById( R.id.sr_stores_found );
        srList=(ListView) findViewById( R.id.sr_listview );

        populateListView();

    }

    private void populateListView() {

        ArrayList<String> listData = new ArrayList<>();

        Cursor data = mDatabaseHelper.getData();

        while(data.moveToNext()){
            //get the value from the database in column 1
            //then add it to the ArrayList
            listData.add(data.getString(2));
        }
        //create the list adapter and set the adapter
        Log.d("Here2", listData.toString());
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listData);
        srList.setAdapter(adapter);
        Log.d("Here3", srList.toString());
        srList.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(SearchResult.this,innerSR.class);
                startActivity(i);
            }
        } );



    }

}
