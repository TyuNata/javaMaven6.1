package ru.netology.javaqa.javamvn.services;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        RelaxService service = new RelaxService();
        int count = service.calculate(100000, 60000, 150000);

            System.out.println(count);
        }
    }
