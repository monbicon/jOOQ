/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
public enum T_658_12 implements org.jooq.MasterDataType<java.lang.String> {

	/**
	 * A
	 */
	A("A", "A"),

	/**
	 * B
	 */
	B("B", "B"),

	/**
	 * C
	 */
	C("C", "C"),
	;

	private final java.lang.String id;
	private final java.lang.String cd;

	private T_658_12(java.lang.String id, java.lang.String cd) {
		this.id = id;
		this.cd = cd;
	}

	@Override
	public java.lang.String getPrimaryKey() {
		return id;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final java.lang.String getId() {
		return id;
	}

	/**
	 * An uncommented item
	 */
	public final java.lang.String getCd() {
		return cd;
	}
}
