package com.hujie.behaviorpra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= (TextView) findViewById(R.id.tv);
        tv.setText("科技时代发挥科技时" +
                "反抗精神的烤红薯的福克斯打开" +
                "撒开绿灯解放独立开发建设路口的角度考虑" +
                "代符号深刻搭街间");

        TextView tv1= (TextView) findViewById(R.id.tv1);
        tv1.setText("科技时代发挥科技时" +
                "反抗精神的烤红薯的福克斯打开" +
                "撒开绿灯解放独立开发建设路口的角度考虑" +
                "代符号深刻搭街间");

        TextView tv2= (TextView) findViewById(R.id.tv2);
        tv2.setText("科技时代发挥科技时" +
                "反抗精神的烤红薯的福克斯打开" +
                "撒开绿灯解放独立开发建设路口的角度考虑" +
                "代符号深刻搭街间");

        TextView tv3= (TextView) findViewById(R.id.tv3);
        tv3.setText("科技时代发挥科技时" +
                "反抗精神的烤红薯的福克斯打开" +
                "撒开绿灯解放独立开发建设路口的角度考虑" +
                "代符号深刻搭街间");
    }
}
