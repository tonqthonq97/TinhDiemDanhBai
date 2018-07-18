package baitapfirebare.gameloft.com.tinhdiemdanhbai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Kq extends AppCompatActivity {
    TextView name1, name2, name3, name4, d1, d2,d3,d4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kq);
        name1=(TextView) findViewById(R.id.name1);
        name2=(TextView) findViewById(R.id.name2);
        name3=(TextView) findViewById(R.id.name3);
        name4=(TextView) findViewById(R.id.name4);
        d1=(TextView) findViewById(R.id.d1);
        d2=(TextView) findViewById(R.id.d2);
        d3=(TextView) findViewById(R.id.d3);
        d4=(TextView) findViewById(R.id.d4);
        name1.setText(MainActivity.player1+":");
        name2.setText(MainActivity.player2+":");
        name3.setText(MainActivity.player3+":");
        name4.setText(MainActivity.player4+":");
        d1.setText(MainActivity.sum_p1+" điểm");
        d2.setText(MainActivity.sum_p2+" điểm");
        d3.setText(MainActivity.sum_p3+" điểm");
        d4.setText(MainActivity.sum_p4+" điểm");
    }
}
