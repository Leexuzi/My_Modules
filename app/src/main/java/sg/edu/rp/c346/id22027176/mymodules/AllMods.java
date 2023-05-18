package sg.edu.rp.c346.id22027176.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AllMods extends AppCompatActivity {

    TextView dip;
    TextView mod1;
    TextView mod2;
    TextView year;
    TextView ttlCred;

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_mods);

        dip = findViewById(R.id.diploma);
        year = findViewById(R.id.year);
        mod1 = findViewById(R.id.mod1);
        mod2 = findViewById(R.id.mod2);
        ttlCred = findViewById(R.id.totalCred);
        back = findViewById(R.id.back);
        Intent intentReceived = getIntent();

        Modules module1 = (Modules) getIntent().getSerializableExtra("module1");
        Modules module2 = (Modules) getIntent().getSerializableExtra("module2");

        dip.setText(R.string.program);
        year.setText(R.string.academic_year);
        mod1.setText((String.format("%s-%s", module1.getCode(), module1.getName())));
        mod2.setText((String.format("%s-%s", module2.getCode(), module2.getName()))); //wonder if this is automatable
        ttlCred.append(String.valueOf(module1.getCred() + module2.getCred())); //now i feel like a class for values would make a lot of sense. iterate through the Credit array to get this. but i feel like making a class for a single textview, and filling it with 2 elements is kinda overkill.
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllMods.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
// im gonna upload real late the enhancement. the worksheet is done though