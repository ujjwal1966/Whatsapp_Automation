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
public class Groupdata extends org.jooq.impl.TableImpl<com.clicdirectory.tables.records.GroupdataRecord> {

	private static final long serialVersionUID = -627466902;

	/**
	 * The singleton instance of <code>public.Groupdata</code>
	 */
	public static final com.clicdirectory.tables.Groupdata GROUPDATA = new com.clicdirectory.tables.Groupdata();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.clicdirectory.tables.records.GroupdataRecord> getRecordType() {
		return com.clicdirectory.tables.records.GroupdataRecord.class;
	}

	/**
	 * The column <code>public.Groupdata.groupname</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.GroupdataRecord, java.lang.String> GROUPNAME = createField("groupname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.Groupdata.tag</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.GroupdataRecord, java.lang.String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.Groupdata</code> table reference
	 */
	public Groupdata() {
		this("Groupdata", null);
	}

	/**
	 * Create an aliased <code>public.Groupdata</code> table reference
	 */
	public Groupdata(java.lang.String alias) {
		this(alias, com.clicdirectory.tables.Groupdata.GROUPDATA);
	}

	private Groupdata(java.lang.String alias, org.jooq.Table<com.clicdirectory.tables.records.GroupdataRecord> aliased) {
		this(alias, aliased, null);
	}

	private Groupdata(java.lang.String alias, org.jooq.Table<com.clicdirectory.tables.records.GroupdataRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.clicdirectory.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.clicdirectory.tables.Groupdata as(java.lang.String alias) {
		return new com.clicdirectory.tables.Groupdata(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.clicdirectory.tables.Groupdata rename(java.lang.String name) {
		return new com.clicdirectory.tables.Groupdata(name, null);
	}
}
