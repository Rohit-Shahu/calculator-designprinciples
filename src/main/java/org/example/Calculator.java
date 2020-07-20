package org.example;
import javax.script.ScriptEngine;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;



public class Calculator {
	private ScriptEngine engine;
	Calculator()
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
		engine = mgr.getEngineByName("javaScript");
	}
	double add(double... values) {
		return Arrays.stream(values).sum();
	}
	double subtract(double a,double b) {
		return a-b;
	}
	double divide(double a,double b) {
		return a/b;
	}
	double multiply(double... values) {
		return Arrays.stream(values).reduce(1, (a,b) -> a*b);
	}
		
			Object expressionEval(String expression) {
		try {
			return engine.eval(expression);
		}catch(ScriptException e) {
			return e.getMessage();
		}
		
	}
	

}
