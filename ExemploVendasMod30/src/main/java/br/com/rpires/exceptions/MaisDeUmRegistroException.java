/**
 * 
 */
package br.com.rpires.exceptions;

import java.io.Serial;

/**
 * @author rodrigo.pires
 *
 */
public class MaisDeUmRegistroException extends Exception {

	
	@Serial
	private static final long serialVersionUID = -7509649433607067138L;

	public MaisDeUmRegistroException(String msg) {
		super(msg);
    }

}
