package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button acbtn,zhengfubtn,sinbtn,ninebtn,eightbtn,sevenbtn,sixbtn,fivebtn,fourbtn,threebtn,
            twobtn,onebtn,zerobtn,decbtn,radbtn,divbtn,mulbtn,minbtn,addbtn,equbtn;
    private EditText cal_text;
    private TextView cal_view;
    private boolean Clickequ = false;//点击按钮
    private String strnum1,strnum2="";//操作数strnum1,strnum2
    private double num1,num2=0.0;//存储数值
    private String op = "";//运算符
    private double result;//当前计算结果

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cal_text = findViewById(R.id.cal_text);
        cal_view = findViewById(R.id.cal_view);
        zerobtn = findViewById(R.id.zerobtn);
        onebtn = findViewById(R.id.onebtn);
        twobtn = findViewById(R.id.twobtn);
        threebtn = findViewById(R.id.threebtn);
        fourbtn = findViewById(R.id.fourbtn);
        fivebtn = findViewById(R.id.fivebtn);
        sixbtn = findViewById(R.id.sixbtn);
        sevenbtn = findViewById(R.id.sevenbtn);
        eightbtn = findViewById(R.id.eightbtn);
        ninebtn = findViewById(R.id.ninebtn);
        acbtn = findViewById(R.id.acbtn);
        addbtn = findViewById(R.id.addbtn);
        minbtn = findViewById(R.id.minbtn);
        mulbtn = findViewById(R.id.mulbtn);
        divbtn = findViewById(R.id.divbtn);
        decbtn = findViewById(R.id.decbtn);
        sinbtn = findViewById(R.id.sinbtn);
        radbtn = findViewById(R.id.radbtn);
        zhengfubtn = findViewById(R.id.zhengfubtn);
        equbtn = findViewById(R.id.equbtn);

        zerobtn.setOnClickListener(this);
        onebtn.setOnClickListener(this);
        twobtn.setOnClickListener(this);
        threebtn.setOnClickListener(this);
        fourbtn.setOnClickListener(this);
        fivebtn.setOnClickListener(this);
        sixbtn.setOnClickListener(this);
        sevenbtn.setOnClickListener(this);
        eightbtn.setOnClickListener(this);
        ninebtn.setOnClickListener(this);
        acbtn.setOnClickListener(this);
        addbtn.setOnClickListener(this);
        minbtn.setOnClickListener(this);
        mulbtn.setOnClickListener(this);
        divbtn.setOnClickListener(this);
        decbtn.setOnClickListener(this);
        sinbtn.setOnClickListener(this);
        radbtn.setOnClickListener(this);
        zhengfubtn.setOnClickListener(this);
        equbtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        int id = view.getId();
        if (id == R.id.zerobtn) {//点击了数字"0"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "0");
        } else if (id == R.id.onebtn) {//点击了数字"1"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "1");
        } else if (id == R.id.twobtn) {//点击了数字"2"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "2");
        } else if (id == R.id.threebtn) {//点击了数字"3"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "3");
        } else if (id == R.id.fourbtn) {//点击了数字"4"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "4");
        } else if (id == R.id.fivebtn) {//点击了数字"5"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "5");
        } else if (id == R.id.sixbtn) {//点击了数字"6"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "6");
        } else if (id == R.id.sevenbtn) {//点击了数字"7"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "7");
        } else if (id == R.id.eightbtn) {//点击了数字"8"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "8");
        } else if (id == R.id.ninebtn) {//点击了数字"9"
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + "9");
        } else if (id == R.id.decbtn) {//点击了小数点
            if (Clickequ) {
                cal_text.setText("");
                Clickequ = false;
            }
            cal_text.setText(cal_text.getText().toString() + ".");
        } else if (id == R.id.acbtn) {//点击了归零按键AC
            if (Clickequ) {
                cal_text.setText("");
                cal_view.setText("");
                Clickequ = false;
            }
            cal_text.setText("");
        } else if (id == R.id.zhengfubtn) {//点击了正负号
            strnum1 = cal_text.getText().toString();
            num1 = Double.parseDouble(strnum1);
            if(strnum1.length() > 0){
                cal_text.setText(-num1 + "");
                cal_view.setText(-num1 + "");
            }
        } else if (id == R.id.radbtn) {//点击了根号键“√“

            num1 = Double.parseDouble(cal_text.getText().toString());
            if(num1<0){
                Toast.makeText(this, "不能对负数开平方", Toast.LENGTH_SHORT).show();
            }
            cal_text.setText(Math.sqrt(num1)+"");
            cal_view.setText("√" + num1 + "=");
        } else if (id == R.id.minbtn) {//点击了减法
            strnum1 = cal_text.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            cal_text.setText("");
            op = "-";
            cal_view.setText(num1+op);
            Clickequ = false;
        } else if (id == R.id.addbtn) {//点击了加法
            strnum1 = cal_text.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            cal_text.setText("");
            op = "+";
            cal_view.setText(num1+op);
            Clickequ = false;
        } else if (id == R.id.mulbtn) {//点击了乘法
            strnum1 = cal_text.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            cal_text.setText("");
            op = "×";
            cal_view.setText(num1+op);
            Clickequ = false;
        } else if (id == R.id.divbtn) {//点击了除法
            strnum1 = cal_text.getText().toString();
            if (strnum1.equals("")) {
                return;
            }
            num1 = Double.parseDouble(strnum1);
            cal_text.setText("");
            op = "÷";
            cal_view.setText(num1+op);
            Clickequ = false;
        } else if (id == R.id.equbtn) {//点击了求和
            strnum2 = cal_text.getText().toString();
            if (strnum2.equals("")) {
                return;
            }
            num2 = Double.parseDouble(strnum2);
            cal_text.setText("");
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "×":
                    result = num1 * num2;
                    break;
                case "÷":
                    if (num2 == 0) {
                        Toast.makeText(this, "除数不能为零", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    result = num1 / num2;
                    break;
                default:
                    result = 0.0;
                    break;

            }
            cal_view.setText(cal_view.getText().toString()+strnum2+"=");
            cal_text.setText(result + "");
            op = "";
            Clickequ = true;
        }
    }

}


