package com.tranchau.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCong, btnTru, btnNhan, btnChia, btnBang, btnAC, btnDEL, btnChiaDu;

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;

    private TextView tvInput, tvOutput;

    private int phepToan;

    private String strInp;
    private long so1;
    private long so2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();
    }

    private void initWidget() {
        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);
        tvInput.setText(null);
        tvOutput.setText("0");
        strInp = "";
        so1 = 0;
        so2 = 0;

        btnCong = findViewById(R.id.bnCong);
        btnTru = findViewById(R.id.bnTru);
        btnNhan = findViewById(R.id.bnNhan);
        btnChiaDu = findViewById(R.id.bnChiaDu);
        btnChia = findViewById(R.id.bnChia);
        btnBang = findViewById(R.id.bnBang);
        btnAC = findViewById(R.id.bnAC);
        btnDEL = findViewById(R.id.bnDel);

        btn0 = findViewById(R.id.bn0);
        btn1 = findViewById(R.id.bn1);
        btn2 = findViewById(R.id.bn2);
        btn3 = findViewById(R.id.bn3);
        btn4 = findViewById(R.id.bn4);
        btn5 = findViewById(R.id.bn5);
        btn6 = findViewById(R.id.bn6);
        btn7 = findViewById(R.id.bn7);
        btn8 = findViewById(R.id.bn8);
        btn9 = findViewById(R.id.bn9);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnChiaDu.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnDEL.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.bn0:
                strInp = strInp + btn0.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn1:
                strInp = strInp + btn1.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn2:
                strInp = strInp + btn2.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn3:
                strInp = strInp + btn3.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn4:
                strInp = strInp + btn4.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn5:
                strInp = strInp + btn5.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn6:
                strInp = strInp + btn6.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn7:
                strInp = strInp + btn7.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn8:
                strInp = strInp + btn8.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bn9:
                strInp = strInp + btn9.getText().toString().trim();
                tvInput.setText(strInp);
                break;
            case R.id.bnCong:
                phepToan = 0;
                so1 = Long.parseLong(strInp);
                tvInput.setText(strInp);
                strInp = "";
                //tvOutput.setText(String.valueOf(lInp1));
                break;
            case R.id.bnTru:
                phepToan = 1;
                //tvOutput.setText(String.valueOf(lInp1));
                so1 = Long.parseLong(strInp);
                tvInput.setText(strInp);
                strInp = "";
                break;
            case R.id.bnChia:
                phepToan = 2;
                if (strInp.isEmpty()){
                    strInp = "1";
                }
                so1 = Long.parseLong(strInp);
                tvInput.setText(strInp);
                strInp = "";
               // tvOutput.setText(String.valueOf(lInp1));
                break;
            case R.id.bnChiaDu:
                phepToan = 3;
                if (strInp.isEmpty()){
                    strInp = "1";
                }
                so1 = Long.parseLong(strInp);
                tvInput.setText(strInp);
                strInp = "";
                //tvOutput.setText(String.valueOf(lInp1));
                break;
            case R.id.bnNhan:
                phepToan = 4;
                if (so1 == 0){
                    so1 = 1;
                }
                if (strInp.isEmpty()){
                    strInp = "1";
                }
                so1 = Long.parseLong(strInp);
                tvInput.setText(strInp);
               // tvOutput.setText(String.valueOf(lInp1));
                strInp = "";
                break;
            case R.id.bnAC:
                phepToan = -1;
                tvInput.setText("");
                tvOutput.setText("0");
                so1 = 0;
                so2 = 0;
                strInp = "";
                break;
            case R.id.bnDel:
                if (strInp.length() > 0) {
                    strInp = strInp.substring(0, strInp.length() - 1);
                    tvInput.setText(strInp);
                } else {
                    tvInput.setText("");
                }
                break;
            case R.id.bnBang:
                switch (phepToan) {
                    case 0: //cong
                        so2 = Long.parseLong(strInp);
                        tvInput.setText(strInp);
                        strInp = "";
                        tvOutput.setText(String.valueOf(so1 + so2));
                        break;
                    case 1://tru
                        so2 = Long.parseLong(strInp);
                        tvInput.setText(strInp);
                        strInp = "";
                        tvOutput.setText(String.valueOf(so1 - so2));
                        break;
                    case 2://chia
                        so2 = Long.parseLong(strInp);
                        tvInput.setText(strInp);
                        if (so1 == 0){
                            tvOutput.setText("0");
                        }
                        else if (so2 == 0){
                            Toast.makeText(this, "Giá trị mẫu số bằng 0", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            tvOutput.setText(String.valueOf(so1 / so2));
                        }
                        break;
                    case 3://chia du
                        so2 = Long.parseLong(strInp);
                        tvInput.setText(strInp);
                        if (so1 == 0){
                            tvOutput.setText("0");
                        }
                        else if (so2 == 0){
                            Toast.makeText(this, "Giá trị mẫu số bằng 0", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            tvOutput.setText(String.valueOf(so1 % so2));
                        }
                        break;
                    case 4://nhan
                        so2 = Long.parseLong(strInp);
                        tvInput.setText(strInp);
                        if (so1 == 0 || so2 == 0){
                            tvOutput.setText("0");
                        } else {
                            tvOutput.setText(String.valueOf(so1 * so2));
                        }
                        break;
                }

        }
    }
}
