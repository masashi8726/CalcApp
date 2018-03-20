package jp.techacademy.masashi.muto.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mEditText;
    EditText mEditText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v){
        String value1 = mEditText.getText().toString();
        String value2 = mEditText2.getText().toString();
        double db1 = Double.parseDouble(value1);
        double db2 = Double.parseDouble(value2);

        Intent intent = new Intent(this, SecondActivity.class);
        if (v.getId() == R.id.button1){
            intent.putExtra("VALUE", db1 + db2);
        } else if (v.getId() == R.id.button2) {
            intent.putExtra("VALUE", db1 - db2);
        } else if (v.getId() == R.id.button3){
            intent.putExtra("VALUE", db1 * db2);
        } else if (v.getId() == R.id.button4){
            intent.putExtra("VALUE", db1 / db2);
        }
        startActivity(intent);
    }
}
