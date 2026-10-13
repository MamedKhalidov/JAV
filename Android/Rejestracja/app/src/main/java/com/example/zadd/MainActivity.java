package com.example.zadd;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText imie;
    EditText nazwisko;
    EditText email;
    EditText haslo;
    Button przycisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imie = findViewById(R.id.imie);
        nazwisko = findViewById(R.id.nazwisko);
        email = findViewById(R.id.email);
        haslo = findViewById(R.id.haslo);
        przycisk = findViewById(R.id.przycisk);

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

    private boolean sprawdzDane() {

        String imieTekst = imie.getText().toString().trim();
        String nazwiskoTekst = nazwisko.getText().toString().trim();
        String emailTekst = email.getText().toString().trim();
        String hasloTekst = haslo.getText().toString().trim();

        if (imieTekst.isEmpty() || nazwiskoTekst.isEmpty()
                || emailTekst.isEmpty() || hasloTekst.isEmpty()) {

            Toast.makeText(
                    this,
                    "Uzupełnij wszystkie pola!",
                    Toast.LENGTH_SHORT
            ).show();
            return false;
        }
        return true;
    }

    private boolean sprawdzEmail() {

        String emailTekst = email.getText().toString().trim();
        if (!emailTekst.contains("@") || !emailTekst.contains(".")) {
            Toast.makeText(
                    this,
                    "Wpisz poprawny email!",
                    Toast.LENGTH_SHORT
            ).show();
            return false;
        }
        return true;
    }
    private boolean sprawdzHaslo() {
        String hasloTekst = haslo.getText().toString();
        if (hasloTekst.matches(
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{8,}$")) {
            return true;
        }
        Toast.makeText(
                this,
                "Hasło musi mieć minimum 8 znaków, małą i wielką literę oraz znak specjalny!",
                Toast.LENGTH_LONG
        ).show();
        return false;
    }

    private void saveToFile() {
        String imieTekst = imie.getText().toString().trim();
        String nazwiskoTekst = nazwisko.getText().toString().trim();
        String emailTekst = email.getText().toString().trim();
        String hasloTekst = haslo.getText().toString();

        String data = "Imię: " + imieTekst
                + "\nNazwisko: " + nazwiskoTekst
                + "\nEmail: " + emailTekst
                + "\nHasło: " + hasloTekst

        try (FileOutputStream fos = openFileOutput(
                "dane.txt", MODE_APPEND
        )) {
            fos.write(data.getBytes(StandardCharsets.UTF_8));

            Toast.makeText(
                    this,
                    "Dane zapisano do pliku!",
                    Toast.LENGTH_SHORT
            ).show();

        } catch (IOException e) {
            Toast.makeText(
                    this,
                    "Błąd podczas zapisu!",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }