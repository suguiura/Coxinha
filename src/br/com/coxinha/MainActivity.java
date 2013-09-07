package br.com.coxinha;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity
{
    private ArrayAdapter<String> adapter;

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
}
