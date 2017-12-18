package edu.upc.eseiaat.pma.ididit_17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        ImageButton btn_addTask = (ImageButton) findViewById(R.id.Btn_addTask);


        btn_addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goNext();

            }
        });


    }

    private void goNext() {
        Intent intent = new Intent(this, NewTask.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
