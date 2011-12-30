/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentityPk extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = 243861094;

	/**
	 * The singleton instance of t_identity_pk
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk T_IDENTITY_PK = new org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private TIdentityPk() {
		super("t_identity_pk", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * No further instances allowed
	 */
	private TIdentityPk(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.mysql2.generatedclasses.Keys.IDENTITY_t_identity_pk;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_t_identity_pk_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_t_identity_pk_PRIMARY);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk(alias);
	}
}
