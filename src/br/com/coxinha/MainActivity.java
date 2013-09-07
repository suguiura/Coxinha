package br.com.coxinha;

import java.util.LinkedList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity
{
    private ArrayAdapter<String> adapter;
    int counter;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        adapter = new ArrayAdapter<String>(this, R.layout.list_order);

        ListView listView = (ListView) findViewById(R.id.listview_of_orders);
        listView.setAdapter(adapter);

        counter = 0;
    }

    public void createOrder(View view) {
        counter++;
        adapter.add(getString(R.string.order_label) + " " + counter);
        adapter.notifyDataSetChanged();
    }
}
