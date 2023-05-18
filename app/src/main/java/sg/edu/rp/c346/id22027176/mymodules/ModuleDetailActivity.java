package sg.edu.rp.c346.id22027176.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView modCode;
    TextView modName;
    TextView acadYr;
    TextView seme;
    TextView modCred;
    TextView venue;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        modCode = findViewById(R.id.modCode);
        modName = findViewById(R.id.modName);
        acadYr = findViewById(R.id.acadYr);
        seme = findViewById(R.id.needsUke);
        modCred = findViewById(R.id.modCred);
        venue = findViewById(R.id.venue);
        back = findViewById(R.id.back);

        Intent intentReceived = getIntent();

        Modules modules = (Modules) getIntent().getSerializableExtra("module");
        //feels like i'm a bit lacking in naming sense
        modCode.append(modules.getCode());
        modName.append(modules.getName());
        acadYr.append(String.valueOf(modules.getYear()));
        seme.append(String.valueOf(modules.getSem()));
        modCred.append(String.valueOf(modules.getCred()));
        venue.append(modules.getVenue());
        //all view

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}