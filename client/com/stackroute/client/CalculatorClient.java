package com.stackroute.client;

import com.stackroute.lib.*;
import java.util.*;

public class CalculatorClient{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Two Number : ");
int a=sc.nextInt();
int b=sc.nextInt();

Calculator obj= new Calculator();
int result = obj.add(a,b);

System.out.println(result);

sc.close();
}

}
