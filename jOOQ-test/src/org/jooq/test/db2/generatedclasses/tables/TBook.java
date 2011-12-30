/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 1972484549;

	/**
	 * The singleton instance of T_BOOK
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.db2.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> __RECORD_TYPE = org.jooq.test.db2.generatedclasses.tables.records.TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.LANGUAGE_ID]
	 * REFERENCES T_LANGUAGE [LUKAS.T_LANGUAGE.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, org.jooq.test.db2.generatedclasses.enums.TLanguage> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.db2.generatedclasses.enums.TLanguage.class), T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.LONGVARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_BOOK__PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.T_BOOK__PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.db2.generatedclasses.Keys.T_BOOK__FK_T_BOOK_AUTHOR_ID, org.jooq.test.db2.generatedclasses.Keys.T_BOOK__FK_T_BOOK_CO_AUTHOR_ID);
	}
}
