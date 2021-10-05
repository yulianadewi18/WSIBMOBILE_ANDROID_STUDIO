package com.example.myrecyclerview;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMovieActivity extends AppCompatActivity {

    TextView textViewTitle, textViewRating, textViewGenre, textViewReleaseDate, textViewDirector, textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        textViewTitle = findViewById(R.id.tvTitle);
        textViewRating = findViewById(R.id.tvRating);
        textViewGenre = findViewById(R.id.tvGenre);
        textViewReleaseDate = findViewById(R.id.tvReleaseDate);
        textViewDirector = findViewById(R.id.tvDirector);
        textViewDescription = findViewById(R.id.tvDescription);

        Movies movies = getIntent().getParcelableExtra("MOVIES");
        textViewTitle.setText(movies.getTitle());
        textViewRating.setText(String.valueOf(movies.getRating()));
        textViewGenre.setText(movies.getGenre());
        textViewReleaseDate.setText(movies.getReleasedata());
        textViewDirector.setText(movies.getDirector());
        textViewDescription.setText(movies.getDescription());
    }
}