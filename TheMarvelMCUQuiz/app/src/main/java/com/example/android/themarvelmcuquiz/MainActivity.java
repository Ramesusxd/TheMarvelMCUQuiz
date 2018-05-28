package com.example.android.themarvelmcuquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view)
    /**
     * question 1. answer is vision
     */
    {
        int score = 0;

        RadioButton sentryRadioButton = (RadioButton) findViewById(R.id.Jarvis_answer_1);
        boolean selectSentry = sentryRadioButton.isChecked();
        if (selectSentry) {
            score = score;
        }

        RadioButton visionRadioButton = (RadioButton) findViewById(R.id.Jarvis_answer_2);
        boolean selectVision = visionRadioButton.isChecked();
        if (selectVision) {
            score = score + 1;
        }

        RadioButton ultronRadioButton = (RadioButton) findViewById(R.id.Jarvis_answer_3);
        boolean selectUltron = ultronRadioButton.isChecked();
        if (selectUltron) {
            score = score;
        }

        RadioButton magnusRadioButton = (RadioButton) findViewById(R.id.Jarvis_answer_4);
        boolean selectMagnus = magnusRadioButton.isChecked();
        if (selectMagnus) {
            score = score;
        }

        /**
         * question 2. Mjölnir is the answer
         */

        EditText nameOfHammer = (EditText) findViewById(R.id.hammer);
        String hammerName = nameOfHammer.getText().toString().toLowerCase().trim();
        if (hammerName.contains("mj\u00f6lnir")) {
            score = score + 1;
        }

        /**
         * question 3. hulk buster armor is the answer
         */

        EditText nameOfArmor = (EditText) findViewById(R.id.armor);
        String armorName = nameOfArmor.getText().toString().toLowerCase().trim();
        if (armorName.contains("hulk buster armor")) {
            score = score + 1;
        }

        /**
         * question 4. tchaka is the answer
         */

        RadioButton mbakuRadioButton = (RadioButton) findViewById(R.id.BP_answer_1);
        boolean selectMbaku = mbakuRadioButton.isChecked();
        if (selectMbaku) {
            score = score;
        }

        RadioButton njobuRadioButton = (RadioButton) findViewById(R.id.BP_answer_2);
        boolean selectNjobu = njobuRadioButton.isChecked();
        if (selectNjobu) {
            score = score;
        }

        RadioButton tchakaRadioButton = (RadioButton) findViewById(R.id.BP_answer_3);
        boolean selectTchaka = tchakaRadioButton.isChecked();
        if (selectTchaka) {
            score = score + 1;
        }


        RadioButton okoyaRadioButton = (RadioButton) findViewById(R.id.BP_answer_4);
        boolean selectOkoya = okoyaRadioButton.isChecked();
        if (selectOkoya) {
            score = score;
        }

        /**
         * question 5. quicksilver and scarlett witch is the answer
         */

        EditText nameOfKid1 = (EditText) findViewById(R.id.kid1);
        String kidsName1 = nameOfKid1.getText().toString().toLowerCase().trim();

        EditText nameOfKid2 = (EditText) findViewById(R.id.kid2);
        String kidsName2 = nameOfKid2.getText().toString().toLowerCase().trim();

        if ((kidsName1.contains("quicksilver")) && (kidsName2.contains("scarlett witch"))) {
            score = score + 1;
        }

        if ((kidsName1.contains("scarlett witch")) && (kidsName2.contains("quicksilver"))) {
            score = score + 1;
        }


        /**
         * question 6 java answer codeing correct answer is space stone
         */

        RadioButton soulStoneButton = (RadioButton) findViewById(R.id.stone_answer_1);
        boolean selectSoulStone = soulStoneButton.isChecked();
        if (selectSoulStone) {
            score = score;
        }

        RadioButton mindStoneButton = (RadioButton) findViewById(R.id.stone_answer_2);
        boolean selectMindStone = mindStoneButton.isChecked();
        if (selectMindStone) {
            score = score;
        }

        RadioButton spaceStoneButton = (RadioButton) findViewById(R.id.stone_answer_3);
        boolean selectSpaceStone = spaceStoneButton.isChecked();
        if (selectSpaceStone) {
            score = score + 1;
        }

        RadioButton powerStoneButton = (RadioButton) findViewById(R.id.stone_answer_4);
        boolean selectPowerStone = powerStoneButton.isChecked();
        if (selectPowerStone) {
            score = score;
        }

        /**
         *  question number 7 answers is Wade Wilson(deadpool) and Carol Danvers (captain marvel)
         */

        CheckBox hawkEye = (CheckBox) findViewById(R.id.hawk_eye);
        boolean selectHawkEye = hawkEye.isChecked();
        if (selectHawkEye) {
            score = score;
        }

        CheckBox falCon = (CheckBox) findViewById(R.id.fal_con);
        boolean selectFalcon = falCon.isChecked();
        if (selectFalcon) {
            score = score;
        }

        CheckBox deadPool = (CheckBox) findViewById(R.id.dead_pool);
        boolean selectDeadPool = deadPool.isChecked();
        if (selectDeadPool) {
            score = score;
        }


        CheckBox captianMarvel = (CheckBox) findViewById(R.id.captain_marvel);
        boolean selectCaptianM = captianMarvel.isChecked();
        if (selectCaptianM && selectDeadPool) {
            score = score + 1;
        }

        /**
         * question 8 answer is crossbones and captain america
         */

        CheckBox thePunisher = (CheckBox) findViewById(R.id.the_punisher);
        boolean selectThePunisher = thePunisher.isChecked();
        if (selectThePunisher) {
            score = score;
        }

        CheckBox theRavager = (CheckBox) findViewById(R.id.the_ravager);
        boolean selectRavager = theRavager.isChecked();
        if (selectRavager) {
            score = score;
        }

        CheckBox profKlaw = (CheckBox) findViewById(R.id.proff_klaw);
        boolean selectProfKlaw = profKlaw.isChecked();
        if (selectProfKlaw) {
            score = score;
        }

        CheckBox crossBones = (CheckBox) findViewById(R.id.cross_bones);
        boolean selectCrossBones = crossBones.isChecked();
        if (selectCrossBones && selectRavager) {
            score = score + 1;
        }

        /**
         * answer for question 9 answer is antman, bucky, and captain america
         */

        CheckBox antMan = (CheckBox) findViewById(R.id.ant_man);
        boolean selectAntMan = antMan.isChecked();
        if (selectAntMan) {
            score = score;
        }

        CheckBox blackPanther = (CheckBox) findViewById(R.id.Black_panther);
        boolean selectBlackPanther = blackPanther.isChecked();
        if (selectBlackPanther) {
            score = score;
        }

        CheckBox winterSoldier = (CheckBox) findViewById(R.id.winter_soldier);
        boolean selectWinterSoldier = winterSoldier.isChecked();
        if (selectWinterSoldier) {
            score = score;
        }

        CheckBox captainAmerica = (CheckBox) findViewById(R.id.captain_america);
        boolean selectCaptainAmerica = captainAmerica.isChecked();
        if (selectCaptainAmerica && selectAntMan && selectWinterSoldier) {
            score = score + 1;
        }

        /**
         * answer for question 10 answer is Nick Fury
         */

        EditText nameOfDirector = (EditText) findViewById(R.id.nameOfDirector);
        String directorFury = nameOfDirector.getText().toString().toLowerCase().trim();
        if (directorFury.contains("nick fury")) {
            score = score + 1;
        }

        /**
         * answer toasts, depending on score dictates which toast message appears
         */


        if (score == 5) {
            //displays toast perfect score
            Toast.makeText(this, "5/10 correct half of them right keep it up", Toast.LENGTH_LONG).show();
        } else if (score == 4) {
            //displays 4/5 score
            Toast.makeText(this, "Almost you got 4/10 Keep watching the movies!", Toast.LENGTH_LONG).show();

        } else if (score == 3) {
            //displays 3/5 score
            Toast.makeText(this, "3/10 not bad all the movie are free to watch on netflix", Toast.LENGTH_LONG).show();

        } else if (score == 2) {
            //display 2/5 score
            Toast.makeText(this, "come on man! 2/10.. I understand if you needed refills", Toast.LENGTH_LONG).show();

        } else if (score == 1) {
            //display 1/5 score
            Toast.makeText(this, "1/10 its ok you must had needed your rest!", Toast.LENGTH_LONG).show();
        } else if (score == 0) {
            //display 0/5
            Toast.makeText(this, "0/10 I'm so so sorry!", Toast.LENGTH_LONG).show();

        } else if (score == 6) {
            //display 6 correct
            Toast.makeText(this, "6/10 questions correct! Are you stan lee and Jack Kirby was there with you??", Toast.LENGTH_LONG).show();

        } else if (score == 7) {
            // display correct for 7
            Toast.makeText(this, "7/10 correct your smart ok! your reed richards then or tony stark! great job", Toast.LENGTH_LONG).show();

        } else if (score == 8) {
            //display 8 correct
            Toast.makeText(this, "8/10 correct Moongirl would approve of ur smarts", Toast.LENGTH_LONG).show();

        } else if (score == 9) {
            //display 9 correct
            Toast.makeText(this, "9/10 correct! Dr.Doom must be helping you.", Toast.LENGTH_LONG).show();

        } else if (score == 10) {
            //display 10 correct
            Toast.makeText(this, "Prefect score are you Stan Lee? 10/10 correct", Toast.LENGTH_LONG).show();

        }


    }


}





