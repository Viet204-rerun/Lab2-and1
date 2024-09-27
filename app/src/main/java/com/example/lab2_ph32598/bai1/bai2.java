package com.example.lab2_ph32598.bai1;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.lab2_ph32598.R;

public class bai2 extends ComponentActivity {
    EditText ten,mssv,tuoi;
    RadioButton nam,nu;
    CheckBox daBong,choiGame;
    Button luu;
    TextView kq;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        ten=findViewById(R.id.edtten);
        mssv=findViewById(R.id.edtmssv);
        tuoi=findViewById(R.id.edttuoi);
        nam=findViewById(R.id.rdonam);
        nu=findViewById(R.id.rdonu);
        daBong=findViewById(R.id.chkDaBong);
        choiGame=findViewById(R.id.chkChoiGame);
        luu=findViewById(R.id.btnluu);
        kq=findViewById(R.id.txtkq);

    }


    public void tinhToan(View view) {
        String ten1 = ten.getText().toString();
        String mssv1=mssv.getText().toString();
        String tuoi1 = tuoi.getText().toString();
        String gioiTinh="";
        if(nam.isChecked()){
            gioiTinh = nam.getText().toString();
        }else if(nu.isChecked()){
            gioiTinh = nu.getText().toString();
        }else{
            gioiTinh="Chưa chọn giới tính !";
        }
        String soThich="";
        if(daBong.isChecked()&&choiGame.isChecked()){
            soThich="đá bóng và chơi game";
        }else if(daBong.isChecked()){
            soThich=daBong.getText().toString();
        }else if(choiGame.isChecked()){
            soThich=choiGame.getText().toString();
        }else{
            soThich="Không có sở thích !";
        }
        String ketQua="Tên Sinh Viên:"+ten1+"\n"+
                      "Mã Số Sinh Viên:"+mssv1+"\n"+
                      "Tuổi:"+tuoi1+"\n"+
                      "Giới Tính :"+gioiTinh+"\n"+
                      "Sở Thích:"+soThich
                ;
        kq.setText(ketQua);
    }
}