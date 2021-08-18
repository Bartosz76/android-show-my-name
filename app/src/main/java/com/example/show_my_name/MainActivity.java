package com.example.show_my_name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Instance variables to be joined with widgets via their IDs.
     */
    private Button showButton;
    private TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Performing the linkage!
         */
        showButton = findViewById(R.id.button);
        nameText = findViewById(R.id.textView);

        /**
         * Setting an "event listener" on my button.
         */
        showButton.setOnClickListener(new View.OnClickListener() {
            /**
             * When the user taps on the button...
             */
            @Override
            public void onClick(View view) {
                /**
                 * ... this happens!
                 */
                nameText.setText("Hello, Bartosz!");
            }
        });
    }
}