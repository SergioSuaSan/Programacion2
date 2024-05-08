package doWhile;

import java.util.Scanner;

public class sfgsfdsfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	
				Scanner scanner = new Scanner (System.in);
		        System.out.println("Calculadora de IMC (Índice de Masa Corporal)");
		        System.out.print("Por favor, ingresa tu peso en kilogramos: ");
		        double peso = scanner.nextDouble();

		        System.out.print("Ahora, ingresa tu altura en metros: ");
		        double altura = scanner.nextDouble();

		        double imc = calcularIMC(peso, altura);
		        String resultadoIMC = interpretarIMC(imc);

		        System.out.println("Tu IMC es: " + imc);
		        System.out.println("Interpretación del IMC: " + resultadoIMC);

		        if (resultadoIMC.equals("Sobrepeso") || resultadoIMC.equals("Obesidad")) {
		            double pesoSaludable = calcularPesoSaludable(altura, resultadoIMC);
		            double caloriasNecesarias = calcularCaloriasNecesarias(peso, pesoSaludable);
		            System.out.println("Peso saludable para tu altura: " + pesoSaludable + " kg");
		            System.out.println("Calorías necesarias para alcanzar el peso saludable: " + caloriasNecesarias + " kcal");
		            System.out.println("Hábitos saludables para mantenerte:");
		            System.out.println("- Mantén una dieta equilibrada y variada.");
		            System.out.println("- Realiza ejercicio regularmente.");
		            System.out.println("- Consulta a un profesional de la salud para un plan personalizado.");
		        }

		        scanner.close();
		    }

		    public static double calcularIMC(double peso, double altura) {
		        return peso / (altura * altura);
		    }

		    public static String interpretarIMC(double imc) {
		        if (imc < 18.5) {
		            return "Infrapeso";
		        } else if (imc >= 18.5 && imc < 24.9) {
		            return "Peso saludable";
		        } else if (imc >= 25.0 && imc < 29.9) {
		            return "Sobrepeso";
		        } else {
		            return "Obesidad";
		        }
		    }

		    public static double calcularPesoSaludable(double altura, String resultadoIMC) {
		        if (resultadoIMC.equals("Sobrepeso")) {
		            return 24.9 * altura * altura;
		        } else {
		            return 18.5 * altura * altura;
		        }
		    }

		    public static double calcularCaloriasNecesarias(double pesoActual, double pesoSaludable) {
		        double caloriasPorKilo = 7700; // Calorías necesarias para ganar o perder 1 kg
		        return (pesoSaludable - pesoActual) * caloriasPorKilo;
		    }
		


	}


