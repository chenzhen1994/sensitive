package visahall.cn.xiaoxin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private TextView textView;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SensitivewordFilter filter = new SensitivewordFilter();
                String a = String.valueOf(editText.getText());
                List<String> set = filter.getSensitiveWord(a, 1);
                String b=("语句中包含敏感词的个数为：" + set.size() + "。包含：" + set);
                /*SensitiveWordInit init = new SensitiveWordInit();
                Map b = init.initKeyWord();
                String c=("语句中包含敏感词的个数为："  + "。包含：" + b);*/
                textView.setText(b);
            }
        });

    }

    private void init() {
        button = (Button) findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.edit);
        textView = (TextView) findViewById(R.id.text);
        ;
    }

    //得到"*"的数量，然后进行替换相应的字符串

}
