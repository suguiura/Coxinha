package br.com.coxinha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateOrderActivity extends Activity
{
    public final static String CREATE_ORDER = "br.com.coxinha.CREATE_ORDER";
    public final static String ORDER_NAME = "br.com.coxinha.ORDER_NAME";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_order);
    }

    public void createOrder(View view) {
        EditText editText = (EditText) findViewById(R.id.create_order_name);
        Intent intent = new Intent(CREATE_ORDER);
        intent.putExtra(ORDER_NAME, editText.getText().toString());
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
