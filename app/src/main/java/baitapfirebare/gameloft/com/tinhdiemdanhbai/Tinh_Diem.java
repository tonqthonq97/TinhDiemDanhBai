package baitapfirebare.gameloft.com.tinhdiemdanhbai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Tinh_Diem extends AppCompatActivity {
    private TextView name1, name2, name3, name4,n1,n2,n3,n4,so_van;
    private EditText p1, p2, p3, p4;
    private ListView lv;
    private Button btn_add, btn_kq;
    private static ArrayList<Van> list = new ArrayList<Van>();
    private VanMoiAdapter apt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh__diem);
        name1=(TextView)findViewById(R.id.p1_name);
        name2=(TextView)findViewById(R.id.p2_name);
        name3=(TextView)findViewById(R.id.p3_name);
        name4=(TextView)findViewById(R.id.p4_name);
        so_van=(TextView)findViewById(R.id.so_van);
        n1=(TextView)findViewById(R.id.name1);
        n2=(TextView)findViewById(R.id.name2);
        n3=(TextView)findViewById(R.id.name3);
        n4=(TextView)findViewById(R.id.name4);
        p1 = (EditText)findViewById(R.id.p1_diem);
        p2 = (EditText)findViewById(R.id.p2_diem);
        p3 = (EditText)findViewById(R.id.p3_diem);
        p4 = (EditText)findViewById(R.id.p4_diem);
        lv = (ListView)findViewById(R.id.lv);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_kq = (Button)findViewById(R.id.btn_KQ);
        apt = new VanMoiAdapter(this,R.layout.item,list);
        //----------------------
        name1.setText(MainActivity.player1);
        name2.setText(MainActivity.player2);
        name3.setText(MainActivity.player3);
        name4.setText(MainActivity.player4);
        n1.setText(MainActivity.player1);
        n2.setText(MainActivity.player2);
        n3.setText(MainActivity.player3);
        n4.setText(MainActivity.player4);
        so_van.setText("Số ván: "+String.valueOf(MainActivity.so_van));
        lv.setAdapter(apt);
        //--------------------------
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int d1, d2, d3, d4;
                if(p1.getText().toString().isEmpty()||p2.getText().toString().isEmpty()||
                        p3.getText().toString().isEmpty()||p4.getText().toString().isEmpty()){
                    Toast.makeText(Tinh_Diem.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                d1 = Integer.parseInt(p1.getText().toString());
                d2 = Integer.parseInt(p2.getText().toString());
                d3 = Integer.parseInt(p3.getText().toString());
                d4 = Integer.parseInt(p4.getText().toString());
                MainActivity.sum_p1+=d1;
                MainActivity.sum_p2+=d2;
                MainActivity.sum_p3+=d3;
                MainActivity.sum_p4+=d4;
                MainActivity.so_van++;
                p1.setText("");
                p2.setText("");
                p3.setText("");
                p4.setText("");
                so_van.setText("Số ván: "+String.valueOf(MainActivity.so_van));
                list.add(new Van(d1, d2, d3, d4));
                try {
                    lv.setAdapter(apt);

                } catch (Exception e){
                    Toast.makeText(Tinh_Diem.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_kq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tinh_Diem.this, Kq.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Đừng có Back lại, mất hết dữ liệu. !!", Toast.LENGTH_LONG).show();
    }
}
