package com.adrian.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Variables
    private Button btncero, btnuno, btndos, btntres, btncuatro, btncinco, btnseis, btnsiete, btnocho, btnnueve, btnborrar, btnsumar, btnrestar, btnmultiplicar, btndividir, btnigual, btncos, btnsin, btntag, btnlog;
    private EditText editresultado, editintro;
    private boolean operando = false;
    // Variables operacion
    private int primerResultado, segundoResultado,resultado;
    private int tipodeoperacion;
    private double resultadoDoble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Creo metodo instancias
        instancias();
        // Creo metodo acciones
        acciones();
    }

    // Metodo acciones
    private void acciones() {
        ArrayList<View> botones = findViewById(R.id.layoutbotones).getTouchables();
        for (View item : botones) {
            ((Button)item).setOnClickListener(this);
        }
    }

    // Meotodo instancias
    private void instancias() {
        btncero = findViewById(R.id.btncero);
        btnuno = findViewById(R.id.btnuno);
        btndos = findViewById(R.id.btndos);
        btntres = findViewById(R.id.btntres);
        btncuatro = findViewById(R.id.btncuatro);
        btncinco = findViewById(R.id.btncinco);
        btnseis = findViewById(R.id.btnseis);
        btnsiete = findViewById(R.id.btnsiete);
        btnocho = findViewById(R.id.btnocho);
        btnnueve = findViewById(R.id.btnnueve);
        btnborrar = findViewById(R.id.btnborrar);
        btnsumar = findViewById(R.id.btnsumar);
        btnrestar = findViewById(R.id.btnrestar);
        btnmultiplicar = findViewById(R.id.btnmultiplicar);
        btndividir = findViewById(R.id.btndividir);
        btnigual = findViewById(R.id.btnigual);
        editintro = findViewById(R.id.editintro);
        editresultado = findViewById(R.id.editresultado);
        btncos = findViewById(R.id.btncos);
        btnsin = findViewById(R.id.btnsin);
        btntag = findViewById(R.id.btntag);
        btnlog = findViewById(R.id.btnlog);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnborrar:
                editintro.setText("");
                editresultado.setText("");
                break;
            case R.id.btncero:
                if (!operando) {
                    editintro.setText(editintro.getText() + "0");
                }
                else
                    editintro.setText("0");
                break;
            case R.id.btnuno:
                if (!operando) {
                    editintro.setText(editintro.getText() + "1");
                }
                else
                    editintro.setText("1");
                break;
            case R.id.btndos:
                if (!operando) {
                    editintro.setText(editintro.getText() + "2");
                }
                else
                    editintro.setText("2");
                break;
            case R.id.btntres:
                if (!operando) {
                    editintro.setText(editintro.getText() + "3");
                }
                else
                    editintro.setText("3");
                break;
            case R.id.btncuatro:
                if (!operando) {
                    editintro.setText(editintro.getText() + "4");
                }
                else
                    editintro.setText("4");
                break;
            case R.id.btncinco:
                if (!operando) {
                    editintro.setText(editintro.getText() + "5");
                }
                else
                    editintro.setText("5");
                break;
            case R.id.btnseis:
                if (!operando) {
                    editintro.setText(editintro.getText() + "6");
                }
                else
                    editintro.setText("6");
                break;
            case R.id.btnsiete:
                if (!operando) {
                    editintro.setText(editintro.getText() + "7");
                }
                else
                    editintro.setText("7");
                break;
            case R.id.btnocho:
                if (!operando) {
                    editintro.setText(editintro.getText() + "8");
                }
                else
                    editintro.setText("8");
                break;
            case R.id.btnnueve:
                if (!operando) {
                    editintro.setText(editintro.getText() + "9");
                }
                else
                    editintro.setText("9");
                break;
            case R.id.btnsumar:
                operando = true;
                primerResultado = Integer.valueOf(editintro.getText().toString());
                tipodeoperacion = 1;
                break;
            case R.id.btnrestar:
                operando = true;
                primerResultado = Integer.valueOf(editintro.getText().toString());
                tipodeoperacion = 2;
                break;
            case R.id.btnmultiplicar:
                operando = true;
                primerResultado = Integer.valueOf(editintro.getText().toString());
                tipodeoperacion = 3;
                break;
            case R.id.btndividir:
                operando = true;
                primerResultado = Integer.valueOf(editintro.getText().toString());
                tipodeoperacion = 4;
                break;
            case R.id.btncos:
                if(editintro.length()==0){
                    Toast.makeText(getApplicationContext(), "No se puede calcular sin un número", Toast.LENGTH_SHORT).show();
                }else{
                    operando = true;
                    primerResultado = Integer.valueOf(editintro.getText().toString());
                    String formateoCos = String.format("%s (%d)","COS",primerResultado);
                    editresultado.setText(formateoCos);
                    System.out.println(primerResultado);
                    tipodeoperacion = 5;
                }
                break;
            case R.id.btnsin:
                if(editintro.length()==0){
                    Toast.makeText(getApplicationContext(), "No se puede calcular sin un número", Toast.LENGTH_SHORT).show();
                }else{
                    operando = true;
                    primerResultado = Integer.valueOf(editintro.getText().toString());
                    String formateoSin = String.format("%s (%d)","SIN",primerResultado);
                    editresultado.setText(formateoSin);
                    System.out.println(primerResultado);
                    tipodeoperacion = 6;
                }
                break;
            case R.id.btntag:
                if(editintro.length()==0){
                    Toast.makeText(getApplicationContext(), "No se puede calcular sin un número", Toast.LENGTH_SHORT).show();
                }else{
                    operando = true;
                    primerResultado = Integer.valueOf(editintro.getText().toString());
                    String formateoTag = String.format("%s (%d)","TAG",primerResultado);
                    editresultado.setText(formateoTag);
                    System.out.println(primerResultado);
                    tipodeoperacion = 7;
                }
                break;
            case R.id.btnlog:
                if(editintro.length()==0){
                    Toast.makeText(getApplicationContext(), "No se puede calcular sin un número", Toast.LENGTH_SHORT).show();
                }else{
                    operando = true;
                    primerResultado = Integer.valueOf(editintro.getText().toString());
                    String formateoLog = String.format("%s (%d)","LOG",primerResultado);
                    editresultado.setText(formateoLog);
                    System.out.println(primerResultado);
                    tipodeoperacion = 8;
                }
                break;
            case R.id.btnigual:
                segundoResultado = Integer.valueOf(editintro.getText().toString());
                int resultadoOperacion = 0;
                if(tipodeoperacion == 1){
                    resultado=primerResultado+segundoResultado;
                    editresultado.setText(String.valueOf(resultado));
                }
                else if(tipodeoperacion == 2){
                    resultado=primerResultado-segundoResultado;
                    editresultado.setText(String.valueOf(resultado));
                }
                else if(tipodeoperacion == 3){
                    resultado=primerResultado*segundoResultado;
                    editresultado.setText(String.valueOf(resultado));
                }
                else if(tipodeoperacion == 4){
                    resultado=primerResultado/segundoResultado;
                    editresultado.setText(String.valueOf(resultado));
                }
                else if(tipodeoperacion == 5){
                    System.out.println(primerResultado);
                    double introDoble = primerResultado;
                    resultadoDoble=Math.cos(introDoble);
                    editresultado.setText(String.valueOf(resultadoDoble));
                }
                else if(tipodeoperacion == 6){
                    System.out.println(primerResultado);
                    double introDoble = primerResultado;
                    resultadoDoble=Math.sin(introDoble);
                    editresultado.setText(String.valueOf(resultadoDoble));
                }
                else if(tipodeoperacion == 7){
                    System.out.println(primerResultado);
                    double introDoble = primerResultado;
                    resultadoDoble=Math.tan(introDoble);
                    editresultado.setText(String.valueOf(resultadoDoble));
                }
                else if(tipodeoperacion == 8){
                    System.out.println(primerResultado);
                    double introDoble = primerResultado;
                    resultadoDoble=Math.log10(introDoble);
                    editresultado.setText(String.valueOf(resultadoDoble));
                }
        }
    }
}
