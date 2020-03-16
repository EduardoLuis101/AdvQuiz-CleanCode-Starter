package es.ulpgc.eite.da.quiz.app;

import android.app.Application;

import es.ulpgc.eite.da.quiz.cheat.CheatState;
import es.ulpgc.eite.da.quiz.question.QuestionState;

public class AppMediator extends Application {

  // state question screen
  private QuestionState questionState;
  // state cheat screen
  private CheatState cheatState;

  // state from question screen to cheat screen
  private QuestionToCheatState questionToCheatState;
  // state from cheat screen to question screen
  private CheatToQuestionState cheatToQuestionState;

  @Override
  public void onCreate() {
    super.onCreate();

    questionState = new QuestionState();
    cheatState = new CheatState();
  }

  public CheatState getCheatState() {
    return cheatState;
  }

  public QuestionState getQuestionState() {
    return questionState;
  }

  public void setCheatToQuestionState(CheatToQuestionState state) {
    cheatToQuestionState = state;
  }

  public CheatToQuestionState getCheatToQuestionState() {
    CheatToQuestionState state = cheatToQuestionState;
    cheatToQuestionState=null; // reset state after getting it
    return state;
  }

  public QuestionToCheatState getQuestionToCheatState() {
    QuestionToCheatState state = questionToCheatState;
    questionToCheatState = null; // reset state after getting it
    return state;
  }

  public void setQuestionToCheatState(QuestionToCheatState state) {
    questionToCheatState = state;
  }
}
