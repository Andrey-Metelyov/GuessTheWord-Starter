package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "ScoreViewModel"
class ScoreViewModel(finalScore: Int) : ViewModel() {
    var score = finalScore
    init {
        Log.i(TAG, "Final score is $finalScore")
    }
}