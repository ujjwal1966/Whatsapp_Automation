/**
 * This class is generated by jOOQ
 */
package com.clicdirectory.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupdataRecord extends org.jooq.impl.TableRecordImpl<com.clicdirectory.tables.records.GroupdataRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -530631363;

	/**
	 * Setter for <code>public.Groupdata.groupname</code>.
	 */
	public void setGroupname(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.Groupdata.groupname</code>.
	 */
	public java.lang.String getGroupname() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.Groupdata.tag</code>.
	 */
	public void setTag(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.Groupdata.tag</code>.
	 */
	public java.lang.String getTag() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.clicdirectory.tables.Groupdata.GROUPDATA.GROUPNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.clicdirectory.tables.Groupdata.GROUPDATA.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getGroupname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupdataRecord value1(java.lang.String value) {
		setGroupname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupdataRecord value2(java.lang.String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupdataRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GroupdataRecord
	 */
	public GroupdataRecord() {
		super(com.clicdirectory.tables.Groupdata.GROUPDATA);
	}

	/**
	 * Create a detached, initialised GroupdataRecord
	 */
	public GroupdataRecord(java.lang.String groupname, java.lang.String tag) {
		super(com.clicdirectory.tables.Groupdata.GROUPDATA);

		setValue(0, groupname);
		setValue(1, tag);
	}
}
