package baitapfirebare.gameloft.com.tinhdiemdanhbai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String player1, player2, player3, player4;
    public static int sum_p1 =0, sum_p2 =0, sum_p3=0, sum_p4=0, so_van=0;
    private EditText edt1, edt2, edt3, edt4;
    private Button btn_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        edt3 = (EditText)findViewById(R.id.edt3);
        edt4 = (EditText)findViewById(R.id.edt4);
        btn_play = (Button)findViewById(R.id.btn_play);
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1.getText().toString().isEmpty()||edt2.getText().toString().isEmpty()||
                        edt4.getText().toString().isEmpty()||edt4.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui Lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                MainActivity.player1=edt1.getText().toString();
                MainActivity.player2=edt2.getText().toString();
                MainActivity.player3=edt3.getText().toString();
                MainActivity.player4=edt4.getText().toString();
                Intent intent = new Intent(MainActivity.this,Tinh_Diem.class);
                startActivity(intent);

            }
        });
    }
}
