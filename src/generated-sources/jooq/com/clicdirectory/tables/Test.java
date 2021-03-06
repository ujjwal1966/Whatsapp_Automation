/**
 * This class is generated by jOOQ
 */
package com.clicdirectory.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends org.jooq.impl.TableImpl<com.clicdirectory.tables.records.TestRecord> {

	private static final long serialVersionUID = -935855382;

	/**
	 * The singleton instance of <code>public.Test</code>
	 */
	public static final com.clicdirectory.tables.Test TEST = new com.clicdirectory.tables.Test();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.clicdirectory.tables.records.TestRecord> getRecordType() {
		return com.clicdirectory.tables.records.TestRecord.class;
	}

	/**
	 * The column <code>public.Test.id_no</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.TestRecord, java.lang.Long> ID_NO = createField("id_no", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.Test.name</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.TestRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.Test</code> table reference
	 */
	public Test() {
		this("Test", null);
	}

	/**
	 * Create an aliased <code>public.Test</code> table reference
	 */
	public Test(java.lang.String alias) {
		this(alias, com.clicdirectory.tables.Test.TEST);
	}

	private Test(java.lang.String alias, org.jooq.Table<com.clicdirectory.tables.records.TestRecord> aliased) {
		this(alias, aliased, null);
	}

	private Test(java.lang.String alias, org.jooq.Table<com.clicdirectory.tables.records.TestRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.clicdirectory.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.clicdirectory.tables.Test as(java.lang.String alias) {
		return new com.clicdirectory.tables.Test(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.clicdirectory.tables.Test rename(java.lang.String name) {
		return new com.clicdirectory.tables.Test(name, null);
	}
}
