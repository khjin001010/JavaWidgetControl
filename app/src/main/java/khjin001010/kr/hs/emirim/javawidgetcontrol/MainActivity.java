package khjin001010.kr.hs.emirim.javawidgetcontrol;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //객체생성

        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        TextView text3 = (TextView) findViewById(R.id.text3);
        TextView text4 = (TextView) findViewById(R.id.text4);

        text1.setText("First TextView");
        text1.setTextSize(30); //단위 : 픽셀
        text1.setBackgroundColor(Color.rgb(255, 0, 255));
        text1.setTextColor(Color.WHITE);

        text2.setText(R.string.txt_1);
        text2.setTextColor(Color.LTGRAY);
        text2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

        text3.setText("I'm want to go to the my house..");
        text3.setBackgroundColor(Color.BLACK);
        text3.setTextColor(Color.WHITE);
        text3.setTextSize(20);

        text4.setTextColor(Color.argb(200, 100, 0, 20));
        text4.setText("정선이는 이쁘다, 인정? - 네 인정");
        text4.setTextSize(38);
        text4.setBackgroundColor(Color.LTGRAY);

    }
}
