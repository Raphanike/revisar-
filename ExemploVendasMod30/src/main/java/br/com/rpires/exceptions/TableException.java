/**
 * 
 */
package br.com.rpires.exceptions;

import java.io.Serial;

/**
 * @author rodrigo.pires
 *
 */
public class TableException extends Exception {

	
	@Serial
	private static final long serialVersionUID = -7509649433607067138L;

	public TableException(String msg) {
		super(msg);
    }

}
