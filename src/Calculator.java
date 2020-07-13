import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("Input operation");
        System.out.println("1. Plus");
        System.out.println("2. Minus");
        System.out.println("3. Multiple");
        System.out.println("4. Divide");
        System.out.println("C. Reload");
        System.out.println("s. Stop program");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        double result = 0;
        boolean resultExecute = true;
        String firstNumber = null;
        String secondNumber = null;
        boolean execute = true;
        while (execute) {
            String operation = str;
            switch (operation) {
                case "1" :
                    try {
                        if (resultExecute) {
                            System.out.println("Input first number: ");
                            firstNumber = bf.readLine();
                            System.out.println("Input second number: ");
                            secondNumber = bf.readLine();
                            result = plus(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
                            resultExecute = false;
                        } else {
                            System.out.println("Input number: ");
                            secondNumber = bf.readLine();
                            result = plus(result, Double.parseDouble(secondNumber));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Result = " + result);
                    System.out.println("Select operation");
                    str = bf.readLine();
                    break;
                case "2" :
                    try {
                        if (resultExecute) {
                            System.out.println("Input first number: ");
                            firstNumber = bf.readLine();
                            System.out.println("Input second number: ");
                            secondNumber = bf.readLine();
                            result = minus(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
                            resultExecute = false;
                        } else {
                            System.out.println("Input number: ");
                            secondNumber = bf.readLine();
                            result = minus(result, Double.parseDouble(secondNumber));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Result = " + result);
                    System.out.println("Select operation");
                    str = bf.readLine();
                    break;
                case "3" :
                    try {
                        if (resultExecute) {
                            System.out.println("Input first number: ");
                            firstNumber = bf.readLine();
                            System.out.println("Input second number: ");
                            secondNumber = bf.readLine();
                            result = multiple(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
                            resultExecute = false;
                        } else {
                            System.out.println("Input number: ");
                            secondNumber = bf.readLine();
                            result = multiple(result, Double.parseDouble(secondNumber));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Result = " + result);
                    System.out.println("Select operation");
                    str = bf.readLine();
                    break;
                case "4" :
                    try {
                        if (resultExecute) {
                            System.out.println("Input first number: ");
                            firstNumber = bf.readLine();
                            System.out.println("Input second number: ");
                            secondNumber = bf.readLine();
                            result = div(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
                            resultExecute = false;
                        } else {
                            System.out.println("Input number: ");
                            secondNumber = bf.readLine();
                            result = div(result, Double.parseDouble(secondNumber));
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Result = " + result);
                    System.out.println("Select operation");
                    str = bf.readLine();
                    break;
                case "C" :
                    if (firstNumber == null && secondNumber == null) {
                        System.out.println("Select operation");
                        System.out.println("1. Plus");
                        System.out.println("2. Minus");
                        System.out.println("3. Multiple");
                        System.out.println("4. Divide");
                        str = bf.readLine();
                    } else {
                        resultExecute = true;
                        System.out.println("Select operation");
                        System.out.println("1. Plus");
                        System.out.println("2. Minus");
                        System.out.println("3. Multiple");
                        System.out.println("4. Divide");
                        str = bf.readLine();
                    }
                    break;
                case "s" :
                    execute = false;
                    break;
                default:
                    System.out.println("Not correct input");
                    System.out.println("Select operation");
                    System.out.println("1. Plus");
                    System.out.println("2. Minus");
                    System.out.println("3. Multiple");
                    System.out.println("4. Divide");
                    str = bf.readLine();
                    break;
            }
        }
    }
    public static double plus(double a, double b) {
        return a + b;
    }
    public static double minus(double a, double b) {
        return a - b;
    }
    public static double multiple(double a, double b) {
        return a * b;
    }
    public static double div(double a, double b) {
        return a / b;
    }
}