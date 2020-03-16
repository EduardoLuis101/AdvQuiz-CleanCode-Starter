package es.ulpgc.eite.da.quiz.question;

import android.content.Context;
import android.content.Intent;

import es.ulpgc.eite.da.quiz.app.AppMediator;
import es.ulpgc.eite.da.quiz.app.CheatToQuestionState;
import es.ulpgc.eite.da.quiz.app.QuestionToCheatState;
import es.ulpgc.eite.da.quiz.cheat.CheatActivity;

public class QuestionRouter implements QuestionContract.Router {

  public static String TAG = QuestionRouter.class.getSimpleName();

  private AppMediator mediator;

  public QuestionRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void navigateToCheatScreen() {

    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, CheatActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
  }

  @Override
  public void passStateToCheatScreen(QuestionToCheatState state) {

    //TODO: falta implementacion

  }

  @Override
  public CheatToQuestionState getStateFromCheatScreen() {

    //TODO: falta implementacion

    return null;
  }
}
