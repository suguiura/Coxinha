package br.com.coxinha;

import java.util.LinkedList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity
{
    private ArrayAdapter<String> adapter;
    private final static int ACTIVITY_CREATE_ORDER = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        adapter = new ArrayAdapter<String>(this, R.layout.list_order);

        ListView listView = (ListView) findViewById(R.id.listview_of_orders);
        listView.setAdapter(adapter);
    }

    public void createOrder(View view) {
        Intent intent = new Intent(this, CreateOrderActivity.class);
        
        startActivityForResult(intent, ACTIVITY_CREATE_ORDER);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case (ACTIVITY_CREATE_ORDER):
                if (resultCode == Activity.RESULT_OK) {
                    String name = data.getStringExtra(CreateOrderActivity.ORDER_NAME);
                    adapter.add(getString(R.string.order_label) + " name: " + name);
                    adapter.notifyDataSetChanged();
                }
                break;
        }
    }

}
