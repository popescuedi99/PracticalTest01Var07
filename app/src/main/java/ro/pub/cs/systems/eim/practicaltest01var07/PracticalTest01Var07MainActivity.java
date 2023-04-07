package ro.pub.cs.systems.eim.practicaltest01var07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {

    private EditText leftTopEditText;
    private EditText rightTopEditText;
    private EditText leftBotEditText;
    private EditText rightBotEditText;
    private Button setButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_practical_test01_var07_main);

        super.onCreate(savedInstanceState);
        leftTopEditText=(EditText)findViewById(R.id.left_top_edit_text);
        rightTopEditText=(EditText)findViewById(R.id.right_top_edit_text);
        leftBotEditText=(EditText)findViewById(R.id.left_bot_text);
        rightBotEditText=(EditText)findViewById(R.id.right_bot_text);
        setButton = (Button)findViewById(R.id.Set);
        setContentView(R.layout.activity_practical_test01_var07_main);

    }
}