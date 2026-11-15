package com.example.tp2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
    public class MainActivity extends AppCompatActivity {
        private Button btnConsulter;
        private TextView msg;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnConsulter = findViewById(R.id.btnConsulter);
            msg = findViewById(R.id.msg);
            //btnConsulter.setOnClickListener(new View.OnClickListener()
            //{
            // @Override
            //public void onClick(View v) {
            //   msg.setText("Félicitation");
            // }
            // });
            //}
        }
        public void calculer(View view) {
            Toast.makeText(this, "Le bouton CONSULTER a été cliqué !",
                    Toast.LENGTH_SHORT).show();}
    }