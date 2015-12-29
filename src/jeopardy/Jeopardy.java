package jeopardy;

import jeopardy.gameEntities.Player;
import jeopardy.gameEntities.Question;

import java.util.ArrayList;

/**
 * Verwaltet das Spiel
 * Created by marlux on 24.12.15.
 */
public class Jeopardy {

    // Liste der Spieler
    ArrayList<Player> PlayerList;

    /*
    Liste von Fragen
    Erste Liste Steht für die Kategorien
    Zweite Dimension sind die Fragen
     */
    ArrayList<ArrayList<Question>> QuestionList;

    boolean playersLoaded = false;
    boolean questionLoaded = false;

    int currentPlayer=0;

    int currentQuestionID=0;
    int currentCategoryID=0;
    boolean currentAnswer=false;
    int questionCount=0;
    int answeredQuestion=0;

    public Jeopardy() {

    }

    public boolean loadBoard() {

        return false;

    }

    public boolean loadPlayers() {

        return false;
    }


    /*
    Lädt die Fragen aus einer CSV (cool wäre ein CSV Loader als Extraklasse)
    CSV Header Categorynamen
    Jede weitere Zeile sind die Fragen
    Speichert die Anzahl der Fragen in der Variablen questionCount zusätzlich
    Speichert die Fragen in QuestionList
    @return Gibt true zurück wenn Fragen erfolgreich geladen wurden
     */
    public boolean loadQuestions() {



        return false;
    }

    public void gameLoop() {

        currentPlayer=getRandomPlayer();

        while(answeredQuestion < questionCount) {


            // 1. Jetzt wird hier von dem Spieler eine Frage ausgewählt auf der GUI (existiert noch nicht)
            // ...

            // 2 .Hier ist die Auswahl zu Ende und die Parameter der Frage werden an die Variable currentCategoryID und
            // currentQuestionID geschickt

            Question question = QuestionList.get(currentCategoryID).get(currentQuestionID);

            // 3. Hier wird dann die Frage geladen

            // 4. Hier wird eine Listener gestartet der Wartet bis der erste Player eine Taste drückt

            // Prüfe nun aus der Spieler Liste welcher Spieler zuerst gedrückt hat
            // Setze zudem currentplayer auf den der Zuerst gedrückt hat

            // Warte auf antwort

            // Current Answer muss vom Gameleiter gefüllt werdens

            if (currentAnswer == true) {
                //gehe zu 2.
            } else {
                //gehe zu 4.
            }

            // Wenn alle Aufgeben ne Abbruchroutine noch einfügen das aufgelöst werden kann
            currentPlayer=getRandomPlayer();
        }
    }

    public int getRandomPlayer() {
        return 0;
    }
}
