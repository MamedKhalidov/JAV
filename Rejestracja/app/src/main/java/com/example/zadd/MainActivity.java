package com.example.zadd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText imie = findViewById(R.id.imie);
    EditText nazwisko = findViewById(R.id.nazwisko);
    EditText email = findViewById(R.id.email);
    EditText haslo = findViewById(R.id.haslo);
    Button przycisk = findViewById(R.id.przycisk);

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


                przycisk.setOnClickListener(v -> {
                    if (!sprawdzDane()) {
                        return;
                    }

                    if (!sprawdzEmail()) {
                        return;
                    }

                    if (!sprawdzHaslo()) {
                        return;
                    }

                    Toast.makeText(
                            this,
                            "Dane są poprawne!",
                            Toast.LENGTH_SHORT
                    ).show();
                });
            }

            private boolean sprawdzDane(){
                String imieTekst = imie.getText().toString().trim();
                String nazwiskoTekst = nazwisko.getText().toString().trim();
                String emailTekst = email.getText().toString().trim();
                String hasloTekst = haslo.getText().toString().trim();

                if(imieTekst.isEmpty() || nazwiskoTekst.isEmpty() || emailTekst.isEmpty() || hasloTekst.isEmpty()){
                    Toast.makeText(
                            this,
                            "Uzupełnij pola",
                            Toast.LENGTH_SHORT
                    ).show();
                    return false;
                }
                return true;
            }

            private boolean sprawdzEmail(){
                String emailTekst = email.getText().toString().trim();
                if(emailTekst.contains("@") || emailTekst.contains(".")){
                    Toast.makeText(
                            this,
                            "Wpisz poprawny email!",
                            Toast.LENGTH_SHORT
                    ).show();
                    return false;
                }
                return true;
            }

            private boolean sprawdzHaslo(){
                String hasloTekst = haslo.getText().toString().trim();

                if(hasloTekst.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{8}$")){
                    return true;
                }
                return false;
            }
        }


