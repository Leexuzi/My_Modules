package sg.edu.rp.c346.id22027176.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mod1;
    TextView mod2;
    TextView allMods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1 = findViewById(R.id.modAP);
        mod2 = findViewById(R.id.modIP);
        allMods = findViewById(R.id.allMod);

        Modules module1 = new Modules("C346", "Android Programming", 2020, 1, 4, "W66M");
        Modules module2 = new Modules("C349", "iPad Programming", 2020, 1, 4, "W66L");
        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", module1);
                startActivity(intent);
            }
        });

        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", module2);
                startActivity(intent);
            }
        });

        allMods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllMods.class);
                intent.putExtra("module1", module1);
                intent.putExtra("module2", module2);
                startActivity(intent);
            }
        });
    }
}