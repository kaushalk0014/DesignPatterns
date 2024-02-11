package com.kk.strategypattern;

public class PaymentClient {
	
	public static void main(String[] args) {
		PaymentStrategy creditCardPayment = new CreditCardPayment("1234", "John Doe");
		PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
		PaymentContext paymentContext = new PaymentContext();
		// Pay using Credit Card
		paymentContext.setPaymentStrategy(creditCardPayment);
		paymentContext.processPayment(100.0);
		// Switch to PayPal and pay
		paymentContext.setPaymentStrategy(payPalPayment);
		paymentContext.processPayment(50.0);
	}
}
