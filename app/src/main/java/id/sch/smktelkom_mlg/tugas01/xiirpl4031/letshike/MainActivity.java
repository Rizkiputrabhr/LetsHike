package id.sch.smktelkom_mlg.tugas01.xiirpl4031.letshike;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Customer, Phone;
    Spinner spTools;
    CheckBox cbBinoculars, cbBoots, cbCompass, cbFlashlight, cbMagnifier, cbSleepingbag, Stove;
    RadioGroup rgSize;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spTools = (Spinner) findViewById(R.id.spinnerTools);

        findViewById(R.id.buttonOrder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
    }
}



