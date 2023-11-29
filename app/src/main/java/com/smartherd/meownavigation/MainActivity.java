package com.smartherd.meownavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation bottomNavigation;
    RelativeLayout settings, addNotes, reminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bottomNavigation = findViewById(R.id.bottomNavigation);
        settings = findViewById(R.id.settings);
        addNotes = findViewById(R.id.addNotes);
        reminder = findViewById(R.id.reminder);

        bottomNavigation.show(2, true);

        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.baseline_access_alarm_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.baseline_add_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.baseline_settings_24));

        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch ((model.getId())){
                    case 1:

                        reminder.setVisibility(View.VISIBLE);
                        addNotes.setVisibility(View.GONE);
                        settings.setVisibility(View.GONE);

                        break;
                    case 2:

                        reminder.setVisibility(View.GONE);
                        addNotes.setVisibility(View.VISIBLE);
                        settings.setVisibility(View.GONE);

                        break;
                    case 3:

                        reminder.setVisibility(View.GONE);
                        addNotes.setVisibility(View.GONE);
                        settings.setVisibility(View.VISIBLE);

                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch ((model.getId())){
                    case 1:

                        reminder.setVisibility(View.VISIBLE);
                        addNotes.setVisibility(View.GONE);
                        settings.setVisibility(View.GONE);

                        break;
                }
                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch ((model.getId())){
                    case 2:
                        reminder.setVisibility(View.GONE);
                        addNotes.setVisibility(View.VISIBLE);
                        settings.setVisibility(View.GONE);
                        break;
                }
                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch ((model.getId())){
                    case 3:

                        reminder.setVisibility(View.GONE);
                        addNotes.setVisibility(View.GONE);
                        settings.setVisibility(View.VISIBLE);

                        break;
                }
                return null;
            }
        });
    }
}