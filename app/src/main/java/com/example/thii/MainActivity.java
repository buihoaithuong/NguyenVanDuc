package com.example.thii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<hoaqua> hoaquaArrayList;
    Adapter adapter;
    EditText edt1, edt2;
    Button btnUpdate, btnView, btnAdd;
    int vitri = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        hoaquaArrayList = new ArrayList<>();
        hoaquaArrayList.add(new hoaqua(R.drawable.ic_launcher_background,"Táo","táo là một cây ăn quả"));
        hoaquaArrayList.add(new hoaqua(R.drawable.ic_launcher_background,"Cam","táo là một cây ăn quả"));
        hoaquaArrayList.add(new hoaqua(R.drawable.ic_launcher_background,"ĐÀo","táo là một cây ăn quả"));
        adapter = new Adapter(this, R.layout.dong_hoa_qua, hoaquaArrayList);
        lv.setAdapter(adapter);

        update();
        add();

    }

    private void add() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String teuDe = edt1.getText().toString();
                String moTa = edt2.getText().toString();
                hoaquaArrayList.add(new hoaqua(R.drawable.ic_launcher_background,teuDe,moTa));
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void update() {
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                vitri = position;
                edt1.setText(hoaquaArrayList.get(vitri).getTieude());
                edt2.setText(hoaquaArrayList.get(vitri).getMota());
                return false;
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hoaquaArrayList.set(vitri,new hoaqua(
                        R.drawable.ic_launcher_background,
                        edt1.getText().toString(),
                        edt2.getText().toString()
                ));
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void AnhXa() {
        lv = (ListView)findViewById(R.id.listview);
        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        btnUpdate = (Button)findViewById(R.id.btnupdate);
        btnView = (Button)findViewById(R.id.btnview);
        btnAdd = (Button)findViewById(R.id.btnadd);
    }
}