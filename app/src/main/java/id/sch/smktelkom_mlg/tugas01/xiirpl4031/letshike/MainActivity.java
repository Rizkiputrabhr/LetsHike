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
    RadioButton small, big;
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
        big = (RadioButton) findViewById(R.id.big);
        cbBinoculars = (CheckBox) findViewById(R.id.binoculars);
        cbBoots = (CheckBox) findViewById(R.id.boots);
        cbCompass = (CheckBox) findViewById(R.id.compass);
        cbFlashlight = (CheckBox) findViewById(R.id.flashlight);
        cbMagnifier = (CheckBox) findViewById(R.id.magnifier);
        cbSleepingbag = (CheckBox) findViewById(R.id.sleepingbag);
        cbStove = (CheckBox) findViewById(R.id.stove);
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

        findViewById(R.id.binoculars).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbBinoculars.setError(null);
                cbBoots.setError(null);
                cbCompass.setError(null);
                cbFlashlight.setError(null);
                cbMagnifier.setError(null);
                cbSleepingbag.setError(null);
                cbStove.setError(null);
            }
        });

        findViewById(R.id.boots).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbBinoculars.setError(null);
                cbBoots.setError(null);
                cbCompass.setError(null);
                cbFlashlight.setError(null);
                cbMagnifier.setError(null);
                cbSleepingbag.setError(null);
                cbStove.setError(null);
            }
        });

        findViewById(R.id.compass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbBinoculars.setError(null);
                cbBoots.setError(null);
                cbCompass.setError(null);
                cbFlashlight.setError(null);
                cbMagnifier.setError(null);
                cbSleepingbag.setError(null);
                cbStove.setError(null);
            }
        });

        findViewById(R.id.flashlight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbBinoculars.setError(null);
                cbBoots.setError(null);
                cbCompass.setError(null);
                cbFlashlight.setError(null);
                cbMagnifier.setError(null);
                cbSleepingbag.setError(null);
                cbStove.setError(null);
            }
        });

        findViewById(R.id.magnifier).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbBinoculars.setError(null);
                cbBoots.setError(null);
                cbCompass.setError(null);
                cbFlashlight.setError(null);
                cbMagnifier.setError(null);
                cbSleepingbag.setError(null);
                cbStove.setError(null);
            }
        });

        findViewById(R.id.sleepingbag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbBinoculars.setError(null);
                cbBoots.setError(null);
                cbCompass.setError(null);
                cbFlashlight.setError(null);
                cbMagnifier.setError(null);
                cbSleepingbag.setError(null);
                cbStove.setError(null);
            }
        });

        findViewById(R.id.stove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbBinoculars.setError(null);
                cbBoots.setError(null);
                cbCompass.setError(null);
                cbFlashlight.setError(null);
                cbMagnifier.setError(null);
                cbSleepingbag.setError(null);
                cbStove.setError(null);
            }
        });

        findViewById(R.id.small).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                small.setError(null);
                big.setError(null);
            }
        });
        findViewById(R.id.big).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                small.setError(null);
                big.setError(null);
            }
        });


    }

    private void doClick() {

        if (isValid()) {
            String nama, phonenumber, category, size3;
            int tools, additional, size, jumlah, total;
            tools = 0;
            additional = 0;
            size = 0;
            category = null;
            size3 = null;
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
                    size3 = "Small";
                } else if (rb.getText().toString().equals("Big")) {
                    size = 10000;
                    size3 = "Big";
                }
            }

            total = (tools + additional + size) * jumlah;

            tvResult.setText("Name                    : " + nama + "\n\nPhone number    : " + phonenumber +
                    "\n\nBuy                        : " + jumlah + " " + size3 + " " + spTools.getSelectedItem().toString()
                    + " Bag " + " with " + nAdditional + " additional. \n\nPrice                     : Rp " + total);
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
            etquantity.setError(null);
        }

        if (!cbBinoculars.isChecked() && !cbBoots.isChecked() && !cbCompass.isChecked() && !cbFlashlight.isChecked() && !cbMagnifier.isChecked() && !cbSleepingbag.isChecked() && !cbStove.isChecked()) {
            cbBinoculars.setError("");
            cbBoots.setError("");
            cbCompass.setError("");
            cbFlashlight.setError("");
            cbMagnifier.setError("");
            cbSleepingbag.setError("");
            cbStove.setError("");
            valid = false;
        } else {
            cbBinoculars.setError(null);
            cbBoots.setError(null);
            cbCompass.setError(null);
            cbFlashlight.setError(null);
            cbMagnifier.setError(null);
            cbSleepingbag.setError(null);
            cbStove.setError(null);
        }

        if (rgSize.getCheckedRadioButtonId() == -1) {
            small.setError("");
            big.setError("");
            valid = false;
        } else {
            small.setError(null);
            big.setError(null);
        }

        return valid;

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) nAdditional += 1;
        else nAdditional -= 1;
    }

}
