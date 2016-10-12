package coml.example.administrator.exercise3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sex = (TextView)findViewById(R.id.sex);
        final TextView course = (TextView)findViewById(R.id.course);
        Button btnOne = (Button)findViewById(R.id.buttonOne);
        RadioButton rbt = (RadioButton)findViewById(R.id.Male);
        CheckBox cbC = (CheckBox)findViewById(R.id.C);
        CheckBox cbJAVA = (CheckBox)findViewById(R.id.JAVA);
        CheckBox cbPython = (CheckBox)findViewById(R.id.Python);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt = (EditText)findViewById(R.id.checking);
                edt.setText("确认按钮被单击了！");
            }
        });

        rbt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged (CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    sex.setText("男");
                else
                    sex.setText("女");
            }
        });

        cbC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged (CompoundButton buttonView, boolean isChecked) {
                    if(isChecked)
                        course.setText("C");
                    else
                        course.setText("");
            }
        });

        cbJAVA.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged (CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    course.setText("JAVA");
                else
                    course.setText("");
            }
        });

        cbPython.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged (CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    course.setText("Python");
                else
                    course.setText("");
            }
        });


    }

}
