package baitapfirebare.gameloft.com.tinhdiemdanhbai;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tonqt Thonq on 10/31/2017.
 */

public class VanMoiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Van> List;

    public VanMoiAdapter(Context context, int layout, List<Van> thongTinList) {
        this.context = context;
        this.layout = layout;
        this.List = thongTinList;
    }

    @Override
    public int getCount() {
        return List.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, final ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        TextView p1 = (TextView)view.findViewById(R.id.t1);
        TextView p2 = (TextView)view.findViewById(R.id.t2);
        TextView p3 = (TextView)view.findViewById(R.id.t3);
        TextView p4 = (TextView)view.findViewById(R.id.t4);
        final Van v = List.get(i);
        p1.setTextColor(Color.parseColor(v.c1));
        p2.setTextColor(Color.parseColor(v.c2));
        p3.setTextColor(Color.parseColor(v.c3));
        p4.setTextColor(Color.parseColor(v.c4));
        p1.setText(Integer.toString(v.getP1()));
        p2.setText(Integer.toString(v.getP2()));
        p3.setText(Integer.toString(v.getP3()));
        p4.setText(Integer.toString(v.getP4()));
        return view;
    }
}
