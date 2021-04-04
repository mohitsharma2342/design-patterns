package com.design.patterns.singleton;

import java.io.Serializable;

/**
 * @author mohit
 *
 */
public class BySerialization implements Serializable {
	


	    public static final BySerialization INSTANCE = new BySerialization();

	    private BySerialization() {
	    }

	    /*
	     * The problem with serialized singleton class is that whenever we deserialize it, 
	     * it will create a new instance of the class
	     * 
	     * So it destroys the singleton pattern, to overcome this scenario all we need to do it 
	     * provide the implementation of readResolve()
	     */
	    protected Object readResolve() {
	        return INSTANCE;
	    }

}
