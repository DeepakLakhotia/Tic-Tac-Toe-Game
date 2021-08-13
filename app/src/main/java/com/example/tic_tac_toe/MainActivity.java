package com.example.tic_tac_toe;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    private String startGame="X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,XCount=0,YCount=0,i=0;
    private TextView scoreX,scoreY;
    private Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.buttonImage1);
        bt2=findViewById(R.id.buttonImage2);
        bt3=findViewById(R.id.buttonImage3);
        bt4=findViewById(R.id.buttonImage4);
        bt5=findViewById(R.id.buttonImage5);
        bt6=findViewById(R.id.buttonImage6);
        bt7=findViewById(R.id.buttonImage7);
        bt8=findViewById(R.id.buttonImage8);
        bt9=findViewById(R.id.buttonImage9);

        scoreX=findViewById(R.id.ScoreX);
        scoreY=findViewById(R.id.ScoreY);

        Reset=findViewById(R.id.Reset);

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setImageDrawable(null);
                bt2.setImageDrawable(null);
                bt3.setImageDrawable(null);
                bt4.setImageDrawable(null);
                bt5.setImageDrawable(null);
                bt6.setImageDrawable(null);
                bt7.setImageDrawable(null);
                bt8.setImageDrawable(null);
                bt9.setImageDrawable(null);
                resetValues();
                XCount=0;
                YCount=0;
                scoreX.setText("Score X :-"+String.valueOf(XCount));
                scoreY.setText("Score Y :-"+String.valueOf(YCount));
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt1.setImageResource(R.drawable.cross);
                    b1=1;
                    i++;
                }
                else{
                    bt1.setImageResource(R.drawable.circle);
                    b1=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt2.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                }
                else{
                    bt2.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt3.setImageResource(R.drawable.cross);
                    b3=1;
                    i++;
                }
                else{
                    bt3.setImageResource(R.drawable.circle);
                    b3=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt4.setImageResource(R.drawable.cross);
                    b4=1;
                    i++;
                }
                else{
                    bt4.setImageResource(R.drawable.circle);
                    b4=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt5.setImageResource(R.drawable.cross);
                    b5=1;
                    i++;
                }
                else{
                    bt5.setImageResource(R.drawable.circle);
                    b5=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt6.setImageResource(R.drawable.cross);
                    b6=1;
                    i++;
                }
                else{
                    bt6.setImageResource(R.drawable.circle);
                    b6=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt7.setImageResource(R.drawable.cross);
                    b7=1;
                    i++;
                }
                else{
                    bt7.setImageResource(R.drawable.circle);
                    b7=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt8.setImageResource(R.drawable.cross);
                    b8=1;
                    i++;
                }
                else{
                    bt8.setImageResource(R.drawable.circle);
                    b8=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(startGame.equals("X")){
                    bt9.setImageResource(R.drawable.cross);
                    b9=1;
                    i++;
                }
                else{
                    bt9.setImageResource(R.drawable.circle);
                    b9=0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void winningGame(){
        if((b1==1) && (b2==1) && (b3==1)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            XCount++;
            scoreX.setText("Score X :-"+String.valueOf(XCount));
        }

        else if((b4==1) && (b5==1) && (b6==1)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            XCount++;
            scoreX.setText("Score X :-"+String.valueOf(XCount));
        }

        else if((b7==1) && (b8==1) && (b9==1)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            XCount++;
            scoreX.setText("Score X :-"+String.valueOf(XCount));
        }

        else if((b1==1) && (b4==1) && (b7==1)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            XCount++;
            scoreX.setText("Score X :-"+String.valueOf(XCount));
        }

        else if((b2==1) && (b5==1) && (b8==1)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            XCount++;
            scoreX.setText("Score X :-"+String.valueOf(XCount));
        }

        else if((b3==1) && (b6==1) && (b9==1)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            XCount++;
            scoreX.setText("Score X :-"+String.valueOf(XCount));
        }

        else if((b1==1) && (b5==1) && (b9==1)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            XCount++;
            scoreX.setText("Score X :-"+String.valueOf(XCount));
        }

        else if((b3==1) && (b5==1) && (b7==1)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            XCount++;
            scoreX.setText("Score X :-"+String.valueOf(XCount));
        }

        else if((b1==0) && (b2==0) && (b3==0)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            YCount++;
            scoreY.setText("Score Y :-"+String.valueOf(YCount));
        }

        else if((b4==0) && (b5==0) && (b6==0)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            YCount++;
            scoreY.setText("Score Y :-"+String.valueOf(YCount));
        }

        else if((b7==0) && (b8==0) && (b9==0)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            YCount++;
            scoreY.setText("Score Y :-"+String.valueOf(YCount));
        }

        else if((b1==0) && (b4==0) && (b7==0)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            YCount++;
            scoreY.setText("Score Y :-"+String.valueOf(YCount));
        }

        else if((b2==0) && (b5==0) && (b8==0)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            YCount++;
            scoreY.setText("Score Y :-"+String.valueOf(YCount));
        }

        else if((b3==0) && (b6==0) && (b9==0)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            YCount++;
            scoreY.setText("Score Y :-"+String.valueOf(YCount));
        }

        else if((b1==0) && (b5==0) && (b9==0)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            YCount++;
            scoreY.setText("Score Y :-"+String.valueOf(YCount));
        }

        else if((b3==0) && (b5==0) && (b7==0)){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player Y Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    bt1.setImageDrawable(null);
                    bt2.setImageDrawable(null);
                    bt3.setImageDrawable(null);
                    bt4.setImageDrawable(null);
                    bt5.setImageDrawable(null);
                    bt6.setImageDrawable(null);
                    bt7.setImageDrawable(null);
                    bt8.setImageDrawable(null);
                    bt9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            YCount++;
            scoreY.setText("Score Y :-"+String.valueOf(YCount));
        }

        else{
            if(i==9){
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setMessage("No One Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        bt1.setImageDrawable(null);
                        bt2.setImageDrawable(null);
                        bt3.setImageDrawable(null);
                        bt4.setImageDrawable(null);
                        bt5.setImageDrawable(null);
                        bt6.setImageDrawable(null);
                        bt7.setImageDrawable(null);
                        bt8.setImageDrawable(null);
                        bt9.setImageDrawable(null);
                        resetValues();
                    }
                });

                AlertDialog alertDialog=builder.create();
                alertDialog.show();

            }

        }
    }

    private void choosePlayer(){
        if(startGame.equals("X")){
            startGame="O";
        }
        else{
            startGame="X";
        }
    }

    private void resetValues() {
        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
        i=0;
    }
}