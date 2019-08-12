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
public class PgtableRecord extends org.jooq.impl.TableRecordImpl<com.clicdirectory.tables.records.PgtableRecord> implements org.jooq.Record4<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -1215154708;

	/**
	 * Setter for <code>public.PGtable.Task</code>.
	 */
	public void setTask(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.PGtable.Task</code>.
	 */
	public java.lang.Long getTask() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.PGtable.Group1</code>.
	 */
	public void setGroup1(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.PGtable.Group1</code>.
	 */
	public java.lang.String getGroup1() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.PGtable.Post</code>.
	 */
	public void setPost(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.PGtable.Post</code>.
	 */
	public java.lang.Long getPost() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>public.PGtable.status</code>.
	 */
	public void setStatus(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.PGtable.status</code>.
	 */
	public java.lang.Long getStatus() {
		return (java.lang.Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.clicdirectory.tables.Pgtable.PGTABLE.TASK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.clicdirectory.tables.Pgtable.PGTABLE.GROUP1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return com.clicdirectory.tables.Pgtable.PGTABLE.POST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return com.clicdirectory.tables.Pgtable.PGTABLE.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getTask();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getGroup1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getPost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgtableRecord value1(java.lang.Long value) {
		setTask(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgtableRecord value2(java.lang.String value) {
		setGroup1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgtableRecord value3(java.lang.Long value) {
		setPost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgtableRecord value4(java.lang.Long value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgtableRecord values(java.lang.Long value1, java.lang.String value2, java.lang.Long value3, java.lang.Long value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PgtableRecord
	 */
	public PgtableRecord() {
		super(com.clicdirectory.tables.Pgtable.PGTABLE);
	}

	/**
	 * Create a detached, initialised PgtableRecord
	 */
	public PgtableRecord(java.lang.Long task, java.lang.String group1, java.lang.Long post, java.lang.Long status) {
		super(com.clicdirectory.tables.Pgtable.PGTABLE);

		setValue(0, task);
		setValue(1, group1);
		setValue(2, post);
		setValue(3, status);
	}
}