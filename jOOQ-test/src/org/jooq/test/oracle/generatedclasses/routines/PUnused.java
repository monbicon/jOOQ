/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PUnused extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 471728099;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> IN1 = createParameter("IN1", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> OUT1 = createParameter("OUT1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> OUT2 = createParameter("OUT2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public PUnused() {
		super(org.jooq.SQLDialect.ORACLE, "P_UNUSED", org.jooq.test.oracle.generatedclasses.Test.TEST);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	/**
	 * Set the <code>IN1</code> parameter to the routine
	 */
	public void setIn1(java.lang.String value) {
		setValue(IN1, value);
	}

	/**
	 * Set the <code>OUT2</code> parameter to the routine
	 */
	public void setOut2(java.lang.Number value) {
		setNumber(OUT2, value);
	}

	public java.math.BigDecimal getOut1() {
		return getValue(OUT1);
	}

	public java.math.BigDecimal getOut2() {
		return getValue(OUT2);
	}
}
