package com.example.lottieandbottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class BottomSheetActivity extends AppCompatActivity {

    private BottomAppBar bottomAppBar;
    private BottomSheetBehavior bottomSheetBehavior;
    private LinearLayout bottomsheet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);
        bottomAppBar=(BottomAppBar)findViewById(R.id.bottomappbar);
        bottomsheet=(LinearLayout)findViewById(R.id.bottomsheet);

        bottomSheetBehavior=BottomSheetBehavior.from(bottomsheet);

        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }
}