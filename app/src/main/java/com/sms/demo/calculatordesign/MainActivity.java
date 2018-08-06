package com.sms.demo.calculatordesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    String v1,v2,v3;

    TextView monitor;
    Button btnclear,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnminus,btnmul,btndiv,btneql,btncls,btndecimal,btnpercent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_views();
        init_variables();
        init_listener();
        init_functions();
    }


    private void init_functions() {

    }

    private void init_listener() {


       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              String output = monitor.getText().toString();
              monitor.setText(output + btn1.getText().toString());
           }
       });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btn2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btn3.getText().toString());
            }
        });

       btn0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String output = monitor.getText().toString();
               monitor.setText(output + btn0.getText().toString());
           }
       });

       btn4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String output = monitor.getText().toString();
               monitor.setText(output + btn4.getText().toString());
           }
       });

       btn5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String output = monitor.getText().toString();
               monitor.setText(output + btn5.getText().toString());
           }
       });

      btn6.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String output = monitor.getText().toString();
              monitor.setText(output + btn6.getText().toString());
          }
      });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btn7.getText().toString());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btn8.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btn9.getText().toString());
            }
        });

        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btndecimal.getText().toString());
            }
        });

        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btnpercent.getText().toString());
            }
        });

        btncls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                StringBuilder cut = new StringBuilder(output);
                int stringlen = output.length();

                if(stringlen > 0){
                    cut.deleteCharAt(stringlen - 1);
                    monitor.setText(cut.toString());
                }
            }
        });



        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btnplus.getText().toString());
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String output = monitor.getText().toString();
                monitor.setText(output + btnminus.getText().toString());
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btndiv.getText().toString());

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = monitor.getText().toString();
                monitor.setText(output + btnmul.getText().toString());

            }
        });

        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String process = monitor.getText().toString();
                char operator = ' ';
                String operand_one = "";
                String operand_two = "";
                boolean operfound = false;


                for(char x : process.toCharArray()){

                    if(!operfound && (Character.isDigit(x) || (operand_one.length() == 0) || x == '.')){
                        operand_one += x;
                    }
                    else if(operfound && (Character.isDigit(x) || (operand_one.length() == 0) || x == '.')){
                        operand_two += x;
                    }

                    else if(x == '+' || x == '-' || x == '/' || x == '*' || x == '%'){
                        operator = x;
                        operfound = true;
                    }
                }

                try{

                    double a = Double.parseDouble(operand_one);
                    double b = Double.parseDouble(operand_two);

                    switch (operator){
                        case '+':
                            a = a + b;
                            break;
                        case '-':
                            a = a - b;
                            break;
                        case '*':
                            a = a * b;
                            break;
                        case '/':
                            a = a / b;
                            break;
                        case '%':
                            a = (a / 100) * b;
                            break;
                            default:
                                break;
                    }

                    monitor.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    monitor.setText("" + a);

                }catch (Exception e){}

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monitor.setText("");
            }
        });
    }

    private void init_variables() {

    }

    private void init_views() {
        monitor = (TextView)findViewById(R.id.monitor);
        btn0 = (Button)findViewById(R.id.btn_zero);
        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);
        btn4 = (Button)findViewById(R.id.btn_4);
        btn5 = (Button)findViewById(R.id.btn_5);
        btn6 = (Button)findViewById(R.id.btn_6);
        btn7 = (Button)findViewById(R.id.btn_7);
        btn8 = (Button)findViewById(R.id.btn_8);
        btn9 = (Button)findViewById(R.id.btn_9);
        btnplus = (Button)findViewById(R.id.btn_plus);
        btnminus = (Button)findViewById(R.id.btn_minus);
        btndiv = (Button)findViewById(R.id.btn_div);
        btnmul = (Button)findViewById(R.id.btn_star);
        btndecimal = (Button)findViewById(R.id.btn_Dot);
        btneql = (Button)findViewById(R.id.btn_Equal);
        btncls = (Button)findViewById(R.id.btn_X);
        btnpercent = (Button)findViewById(R.id.btn_percentage);
        btnclear = (Button)findViewById(R.id.btn_Clear);

    }
}
