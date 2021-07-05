package com.scripting;
import java.io.Console;
import java.io.FileNotFoundException;

import javax.script.*;
public class JavascriptDemo {

	public static void main(String[] args) throws ScriptException, FileNotFoundException {
		ScriptEngineManager manager=new  ScriptEngineManager(ClassLoader.getSystemClassLoader());
        ScriptEngine engine = manager.getEngineByName("Nashorn");
 System.out.print(engine);
// evaluate JavaScript code
       // engine.eval("print('Hello, World')");
      //  engine.eval(new java.io.FileReader("script.js"));

	}

}
