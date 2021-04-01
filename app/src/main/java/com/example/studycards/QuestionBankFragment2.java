package com.example.studycards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.room.Room;

public class QuestionBankFragment2 extends Fragment {
    private Button BnAdd;
    private EditText QuestionText, QuestionAnswer, QuestionCategory;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        QuestionText = getView().findViewById(R.id.questionTextEditText);
        QuestionAnswer = getView().findViewById(R.id.questionAnswerEditText);
        QuestionCategory = getView().findViewById(R.id.questionCategoryEditText);
        BnAdd = getView().findViewById(R.id.addQuestionBttn);
        return inflater.inflate(R.layout.fragment_questionbank_2, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String questionText = QuestionText.toString();
                String questionAns = QuestionAnswer.toString();
                /*int questionCat = Integer.parseInt(QuestionCategory.toString());*/

/*                Question question = new Question();
                question.setQuestionText(questionText);
                question.setAnswerText(questionAns);
                question.setCategory(questionCat);*/

                QuestionBankActivity.a.questionDAO().insertQuestion(questionText, questionAns);
                Toast.makeText(getActivity(), "Question added", Toast.LENGTH_SHORT).show();
            }
        });
    }
}