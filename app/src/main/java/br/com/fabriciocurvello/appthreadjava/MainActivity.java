package br.com.fabriciocurvello.appthreadjava;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvStatus;
    private Button btnStart;
    private Handler mainHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvStatus = findViewById(R.id.tv_status);
        btnStart = findViewById(R.id.btn_start);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startBackgroundTask();
            }
        });
    }

    private void startBackgroundTask() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int cont = 0; cont <= 10; cont++) {
                    final int progress = cont;
                    mainHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            tvStatus.setText("Status: " + progress * 10 + "%");
                        }
                    });
                    try {
                        Thread.sleep(500); //Simula uma tarefa longa
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        tvStatus.setText("Status: Finalizado");
                    }
                });
            }
        }).start();
    }
}