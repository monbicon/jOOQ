/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public enum T_658_31 implements org.jooq.MasterDataType<java.lang.Long> {

	/**
	 * 1
	 */
	_1(1L),

	/**
	 * 2
	 */
	_2(2L),

	/**
	 * 3
	 */
	_3(3L),
	;

	private final java.lang.Long id;

	private T_658_31(java.lang.Long id) {
		this.id = id;
	}

	@Override
	public java.lang.Long getPrimaryKey() {
		return id;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final java.lang.Long getId() {
		return id;
	}
}
