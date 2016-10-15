package id.sch.smktelkom_mlg.tugas01.xiirpl4031.letshike;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    Spinner spTools;
    EditText etcustomer, etphone, etquantity;
    RadioGroup rgSize;
    RadioButton small;
    TextView tvResult;
    CheckBox cbBinoculars, cbBoots, cbCompass, cbFlashlight, cbMagnifier, cbSleepingbag, cbStove;
    int nAdditional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spTools = (Spinner) findViewById(R.id.spinnerTools);
        etcustomer = (EditText) findViewById(R.id.editTextCustomer);
        etphone = (EditText) findViewById(R.id.editTextPhone);
        etquantity = (EditText) findViewById(R.id.editTextquantity);
        rgSize = (RadioGroup) findViewById(R.id.radioGroupSize);
        small = (RadioButton) findViewById(R.id.small);
        cbBinoculars = (CheckBox) findViewById(R.id.binoculars);
        cbBoots = (CheckBox) findViewById(R.id.boots);
        cbCompass = (CheckBox) findViewById(R.id.compass);
        cbFlashlight = (CheckBox) findViewById(R.id.flashlight);
        cbMagnifier = (CheckBox) findViewById(R.id.magnifier);
        cbSleepingbag = (CheckBox) findViewById(R.id.sleepingbag);
        cbStove = (CheckBox) findViewById(R.id.compass);
        tvResult = (TextView) findViewById(R.id.tvResult);

        cbBinoculars.setOnCheckedChangeListener(this);
        cbBoots.setOnCheckedChangeListener(this);
        cbCompass.setOnCheckedChangeListener(this);
        cbFlashlight.setOnCheckedChangeListener(this);
        cbMagnifier.setOnCheckedChangeListener(this);
        cbSleepingbag.setOnCheckedChangeListener(this);
        cbStove.setOnCheckedChangeListener(this);

        findViewById(R.id.buttonOrder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {

        if (isValid()) {
            String nama, phonenumber, category;
            int tools, additional, size, jumlah, total;
            tools = 0;
            additional = 0;
            size = 0;
            nama = etcustomer.getText().toString();
            phonenumber = etphone.getText().toString();
            jumlah = Integer.parseInt(etquantity.getText().toString());

            if (spTools.getSelectedItem().toString().equals("Carrier")) {
                tools = 3000;
                category = "amazing";
            } else if (spTools.getSelectedItem().toString().equals("Bagpack")) {
                tools = 2000;
                category = "wonderful";
            }

            if (cbBinoculars.isChecked()) additional += 20000;
            if (cbBoots.isChecked()) additional += 15000;
            if (cbCompass.isChecked()) additional += 10000;
            if (cbMagnifier.isChecked()) additional += 10000;
            if (cbSleepingbag.isChecked()) additional += 50000;
            if (cbStove.isChecked()) additional += 25000;

            if (rgSize.getCheckedRadioButtonId() != -1) {
                RadioButton rb = (RadioButton)
                        findViewById(rgSize.getCheckedRadioButtonId());

                if (rb.getText().toString().equals("Small")) {
                    size = 5000;
                } else if (rb.getText().toString().equals("Big")) {
                    size = 10000;
                }
            }

            total = (tools + additional + size) * jumlah;

            tvResult.setText("Your name   : " + nama + "with phone number : " + phonenumber + "\n\nBuy   : " + jumlah + size + tools + " Bag " + " with " + nAdditional + " additional. \n\nPrice    : ");


        }
    }

    private boolean isValid() {

        boolean valid = true;
        String customer = etcustomer.getText().toString();
        String amount = etquantity.getText().toString();

        if (customer.isEmpty()) {
            etcustomer.setError("What is your name?");
            valid = false;
        } else if (customer.length() < 3) {
            etcustomer.setError("Please insert minimum 3 character from your name!");
            valid = false;
        } else {
            etcustomer.setError(null);
        }


        if (amount.isEmpty()) {
            etquantity.setError("Insert your quantity of your Lets Hiking Tools order!");
            valid = false;
        } else {
            etcustomer.setError(null);
        }

        if (!cbFlashlight.isChecked() || !cbFlashlight.isChecked() || !cbFlashlight.isChecked()) {
            cbFlashlight.setError("Choose your ice cream topping for make some happy!");
            valid = false;
        } else {
            cbFlashlight.setError(null);
        }

        if (rgSize.getCheckedRadioButtonId() == -1) {
            small.setError("Do you wanna some glass?");
            valid = false;
        } else {
            small.setError(null);
        }


        return valid;

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) nAdditional += 1;
        else nAdditional -= 1;
    }
}
