package teiser.gr.golden_offers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button UserBtn = (Button) findViewById(R.id.UserBtn);
        UserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToUser = new Intent(getApplicationContext(), UserActivity.class);
                startActivity(goToUser);
            }
        });

        Button BusinessBtn = (Button) findViewById(R.id.BusinessBtn);
        BusinessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToBusiness = new Intent(getApplicationContext(), BusinessActivity.class);
                startActivity(goToBusiness);

            }
        });


    }
}
