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
public class Pgtable extends org.jooq.impl.TableImpl<com.clicdirectory.tables.records.PgtableRecord> {

	private static final long serialVersionUID = 1875261810;

	/**
	 * The singleton instance of <code>public.PGtable</code>
	 */
	public static final com.clicdirectory.tables.Pgtable PGTABLE = new com.clicdirectory.tables.Pgtable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.clicdirectory.tables.records.PgtableRecord> getRecordType() {
		return com.clicdirectory.tables.records.PgtableRecord.class;
	}

	/**
	 * The column <code>public.PGtable.Task</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.PgtableRecord, java.lang.Long> TASK = createField("Task", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.PGtable.Group1</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.PgtableRecord, java.lang.String> GROUP1 = createField("Group1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.PGtable.Post</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.PgtableRecord, java.lang.Long> POST = createField("Post", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.PGtable.status</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.PgtableRecord, java.lang.Long> STATUS = createField("status", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.PGtable</code> table reference
	 */
	public Pgtable() {
		this("PGtable", null);
	}

	/**
	 * Create an aliased <code>public.PGtable</code> table reference
	 */
	public Pgtable(java.lang.String alias) {
		this(alias, com.clicdirectory.tables.Pgtable.PGTABLE);
	}

	private Pgtable(java.lang.String alias, org.jooq.Table<com.clicdirectory.tables.records.PgtableRecord> aliased) {
		this(alias, aliased, null);
	}

	private Pgtable(java.lang.String alias, org.jooq.Table<com.clicdirectory.tables.records.PgtableRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.clicdirectory.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.clicdirectory.tables.Pgtable as(java.lang.String alias) {
		return new com.clicdirectory.tables.Pgtable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.clicdirectory.tables.Pgtable rename(java.lang.String name) {
		return new com.clicdirectory.tables.Pgtable(name, null);
	}
}
